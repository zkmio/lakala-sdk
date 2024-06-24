package com.lkl.laop.sdk.notification;

import com.lkl.laop.sdk.Validator;
import com.lkl.laop.sdk.auth.LklApiValidator;
import com.lkl.laop.sdk.auth.NotifyCertificatesVerifier;
import com.lkl.laop.sdk.exception.SDKException;

import javax.servlet.http.HttpServletRequest;
import java.security.cert.X509Certificate;

/**
 * @author nxj
 * @date 2023/8/18 10:39
 * @description
 */
public class NotificationHandler {

    private final Validator validator;

    public NotificationHandler(X509Certificate certificate) {
        this.validator = new LklApiValidator(new NotifyCertificatesVerifier(certificate));
    }

    public String parse(HttpServletRequest request) throws SDKException {
        if (!validator.validate(request)) {
            throw new SDKException("推送通知的签名验证失败");
        }
        return request.getAttribute("reqBody").toString();
    }

    public void validate(String body, String authorization) throws SDKException {
        if (!validator.validate(body, authorization)) {
            throw new SDKException("推送通知的签名验证失败");
        }
    }

}
