package com.lkl.laop.sdk.auth;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.X509Certificate;
import java.util.Base64;

/**
 * @author nxj
 * @date 2023/8/18 16:28
 * @description
 */
public class NotifyCertificatesVerifier implements Verifier {

    private final X509Certificate notifyCertificate;

    public NotifyCertificatesVerifier(X509Certificate certificate) {
        notifyCertificate = certificate;
    }

    private boolean verify(byte[] message, String signature) {
        try {
            Signature sign = Signature.getInstance("SHA256withRSA");
            sign.initVerify(notifyCertificate);
            sign.update(message);
            return sign.verify(Base64.getDecoder().decode(signature));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("当前Java环境不支持SHA256withRSA", e);
        } catch (SignatureException e) {
            throw new RuntimeException("签名验证过程发生了错误", e);
        } catch (InvalidKeyException e) {
            throw new RuntimeException("无效的证书", e);
        }
    }

    @Override
    public boolean verify(String serialNumber, byte[] message, String signature) {
        return verify(message, signature);
    }

    @Override
    public X509Certificate getValidCertificate() {
        return notifyCertificate;

    }
}
