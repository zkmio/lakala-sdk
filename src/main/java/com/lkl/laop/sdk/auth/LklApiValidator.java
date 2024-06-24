package com.lkl.laop.sdk.auth;


import com.lkl.laop.sdk.Validator;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class LklApiValidator implements Validator {

    private static final Logger log = LoggerFactory.getLogger(LklApiValidator.class);

    private Verifier verifier;

    public LklApiValidator(Verifier verifier) {
        this.verifier = verifier;
    }

    static RuntimeException parameterError(String message, Object... args) {
        message = String.format(message, args);
        return new IllegalArgumentException("parameter error: " + message);
    }

    static RuntimeException verifyFail(String message, Object... args) {
        message = String.format(message, args);
        return new IllegalArgumentException("signature verify fail: " + message);
    }

    @Override
    public final boolean validate(CloseableHttpResponse response) throws IOException {
        try {
            validateParameters(response);
            String message = buildMessage(response);
            String serial = response.getFirstHeader("Lklapi-Serial").getValue();
            String signature = response.getFirstHeader("Lklapi-Signature").getValue();
            log.debug("validate message：\n{}", message);
            log.debug("validate signature：\n{}", signature);
            if (!verifier.verify(serial, message.getBytes(StandardCharsets.UTF_8), signature)) {
                throw verifyFail("serial=[%s] message=[%s] sign=[%s]",
                        serial, message, signature);
            }
        } catch (IllegalArgumentException e) {
            log.warn(e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public boolean validate(String body, String authorization) {
        try {
            log.info("RequestBody：{}", body);
            log.info("Authorization：{}", authorization);
            Map<String, String> authorizationMap = getAuthorizationMap(authorization);
            String message = buildMessage(body, authorizationMap);
            String signature = authorizationMap.get("signature");
            log.debug("validate message：\n{}", message);
            log.debug("validate signature：\n{}", signature);
            if (!verifier.verify(null, message.getBytes(StandardCharsets.UTF_8), signature)) {
                throw verifyFail("message=[%s] sign=[%s]",
                        message, signature);
            }
        } catch (IllegalArgumentException e) {
            log.warn(e.getMessage());
            return false;
        }

        return true;
    }

    @Override
    public boolean validate(HttpServletRequest request) {
        try {
            String body = this.getBody(request);
            String authorization = request.getHeader("Authorization");
            log.info("RequestBody：{}", body);
            log.info("Authorization：{}", authorization);
            Map<String, String> authorizationMap = getAuthorizationMap(authorization);
            String message = buildMessage(body, authorizationMap);
            String signature = authorizationMap.get("signature");
            log.debug("validate message：\n{}", message);
            log.debug("validate signature：\n{}", signature);
            if (!verifier.verify(null, message.getBytes(StandardCharsets.UTF_8), signature)) {
                throw verifyFail("message=[%s] sign=[%s]",
                        message, signature);
            }
            request.setAttribute("reqBody", body);
        } catch (IllegalArgumentException e) {
            log.warn(e.getMessage());
            return false;
        }

        return true;
    }

    protected final void validateParameters(CloseableHttpResponse response) {
        String requestId = "";
        if (!response.containsHeader("Lklapi-Serial")) {
            throw parameterError("empty Lklapi-Serial, request-id=[%s]", requestId);
        } else if (!response.containsHeader("Lklapi-Signature")) {
            throw parameterError("empty Lklapi-Signature, request-id=[%s]", requestId);
        } else if (!response.containsHeader("Lklapi-Timestamp")) {
            throw parameterError("empty Lklapi-Timestamp, request-id=[%s]", requestId);
        } else if (!response.containsHeader("Lklapi-Nonce")) {
            throw parameterError("empty Lklapi-Nonce, request-id=[%s]", requestId);
        }
    }

    protected final String buildMessage(String body, Map<String, String> authorizationMap) {
        String timestamp = authorizationMap.get("timestamp");
        String nonce = authorizationMap.get("nonce_str");
        return timestamp + "\n"
                + nonce + "\n"
                + body + "\n";
    }

    protected final String buildMessage(CloseableHttpResponse response) throws IOException {
        String timestamp = response.getFirstHeader("Lklapi-Timestamp").getValue();
        String nonce = response.getFirstHeader("Lklapi-Nonce").getValue();
        String serialNo = response.getFirstHeader("Lklapi-Serial").getValue();
        String appid = response.getFirstHeader("Lklapi-Appid").getValue();
        String body = getResponseBody(response);
        log.info("ResponseBody: {}", body);
        return appid + "\n"
                + serialNo + "\n"
                + timestamp + "\n"
                + nonce + "\n"
                + body + "\n";
    }

    protected final String getResponseBody(CloseableHttpResponse response) throws IOException {
        HttpEntity entity = response.getEntity();
        return (entity != null && entity.isRepeatable()) ? EntityUtils.toString(entity,StandardCharsets.UTF_8) : "";
    }

    protected final String getBody(HttpServletRequest request) {
        try (InputStreamReader in = new InputStreamReader(request.getInputStream(), StandardCharsets.UTF_8)) {
            StringBuilder bf = new StringBuilder();
            int len;
            char[] chs = new char[1024];
            while ((len = in.read(chs)) != -1) {
                bf.append(new String(chs, 0, len));
            }
            return bf.toString();
        } catch (Exception e) {
            log.error("读取请求数据异常", e);
            throw parameterError("empty request...", "");
        }
    }

    private static Map<String, String> getAuthorizationMap(String authorization) {
        Map<String, String> map = new HashMap<>();
        authorization = authorization.trim();
        int bpos = authorization.indexOf(" ");
        String authType = authorization.substring(0, bpos);
        String[] typeArr = authType.split("-");
        if (typeArr.length > 1) {
            map.put("signSystemCode", typeArr[0]);
            map.put("signAlgorithm", typeArr[1]);
        }
        String signInfo = authorization.substring(bpos + 1);
        String[] infoArr = signInfo.split(",");
        for (String info : infoArr) {
            if (info.contains("=")) {
                int fpos = info.indexOf("=");
                String value = info.substring(fpos + 1).trim();
                value = value.substring(1, value.length() - 1);
                map.put(info.substring(0, fpos).trim(), value);
            }
        }
        return map;
    }
}
