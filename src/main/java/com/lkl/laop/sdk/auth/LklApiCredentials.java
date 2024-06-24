package com.lkl.laop.sdk.auth;


import com.lkl.laop.sdk.Credentials;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

public class LklApiCredentials implements Credentials {
    private static final Logger log = LoggerFactory.getLogger(LklApiCredentials.class);

    private static final String SYMBOLS =
            "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final SecureRandom RANDOM = new SecureRandom();

    protected String appId;
    protected Signer signer;
    protected String serialNo;

    public LklApiCredentials(String appId, String serialNo, Signer signer) {
        this.appId = appId;
        this.signer = signer;
        this.serialNo = serialNo;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    protected long generateTimestamp() {
        return System.currentTimeMillis() / 1000;
    }

    protected String generateNonceStr() {
        char[] nonceChars = new char[32];
        for (int index = 0; index < nonceChars.length; ++index) {
            nonceChars[index] = SYMBOLS.charAt(RANDOM.nextInt(SYMBOLS.length()));
        }
        return new String(nonceChars);
    }

    @Override
    public final String getSchema() {
        return "LKLAPI-SHA256withRSA";
    }

    @Override
    public final String getToken(HttpRequestWrapper request) throws IOException {
        String nonceStr = generateNonceStr();
        long timestamp = generateTimestamp();
        String message = buildMessage(getAppId(), getSerialNo(), nonceStr, timestamp, request);
        log.debug("authorization message：\n{}", message);
        Signer.SignatureResult signature = signer.sign(message.getBytes(StandardCharsets.UTF_8));
        String token = "appid=\"" + getAppId() + "\","
                + "nonce_str=\"" + nonceStr + "\","
                + "timestamp=\"" + timestamp + "\","
                + "serial_no=\"" + signature.certificateSerialNumber + "\","
                + "signature=\"" + signature.sign + "\"";
        log.debug("authorization token：\n{}", token);
        return token;
    }

    @Override
    public String getOpAppId() {
        return getAppId();
    }

    protected final String buildMessage(String appid, String serialNo, String nonce, long timestamp, HttpRequestWrapper request)
            throws IOException {
        String body = "";
        if (request instanceof HttpEntityEnclosingRequest) {
            body = EntityUtils.toString(((HttpEntityEnclosingRequest) request).getEntity(),StandardCharsets.UTF_8);
        }
        log.info("RequestBody：{}", body);
        return appid + "\n"
                + serialNo + "\n"
                + timestamp + "\n"
                + nonce + "\n"
                + body + "\n";
    }
}
