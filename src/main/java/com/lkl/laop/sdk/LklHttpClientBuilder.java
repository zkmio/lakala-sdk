package com.lkl.laop.sdk;


import com.lkl.laop.sdk.auth.CertificatesVerifier;
import com.lkl.laop.sdk.auth.LklApiCredentials;
import com.lkl.laop.sdk.auth.LklApiValidator;
import com.lkl.laop.sdk.auth.PrivateKeySigner;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.execchain.ClientExecChain;

import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.List;

public class LklHttpClientBuilder extends HttpClientBuilder {
    private Credentials credentials;
    private Validator validator;

    static final String os = System.getProperty("os.name") + "/" + System.getProperty("os.version");
    static final String version = System.getProperty("java.version");

    private LklHttpClientBuilder(HttpClientConnectionManager manager) {
        super();
        if (manager != null) {
            setConnectionManager(manager);
        }
        String userAgent = String.format(
                "LklApi-Apache-HttpClient/%s (%s) Java/%s",
                getClass().getPackage().getImplementationVersion(),
                os,
                version == null ? "Unknown" : version);
        setUserAgent(userAgent);
    }

    public static LklHttpClientBuilder create(HttpClientConnectionManager manager) {
        return new LklHttpClientBuilder(manager);
    }

    public LklHttpClientBuilder withMerchant(String appId, String serialNo, PrivateKey privateKey) {
        this.credentials =
                new LklApiCredentials(appId, serialNo, new PrivateKeySigner(serialNo, privateKey));
        return this;
    }

    public LklHttpClientBuilder withCredentials(Credentials credentials) {
        this.credentials = credentials;
        return this;
    }

    public LklHttpClientBuilder withLklpay(List<X509Certificate> certificates) {
        this.validator = new LklApiValidator(new CertificatesVerifier(certificates));
        return this;
    }

    public LklHttpClientBuilder withValidator(Validator validator) {
        this.validator = validator;
        return this;
    }

    @Override
    public CloseableHttpClient build() {
        if (credentials == null) {
            throw new IllegalArgumentException("缺少身份认证信息");
        }
        if (validator == null) {
            throw new IllegalArgumentException("缺少签名验证信息");
        }
        return super.build();
    }

    @Override
    protected ClientExecChain decorateProtocolExec(final ClientExecChain requestExecutor) {
        return new SignatureExec(this.credentials, this.validator, requestExecutor);
    }
}
