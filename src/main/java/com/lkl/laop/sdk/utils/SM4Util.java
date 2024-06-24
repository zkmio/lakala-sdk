package com.lkl.laop.sdk.utils;

import com.lkl.laop.sdk.exception.SDKException;
import org.apache.commons.lang3.StringUtils;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;

/**
 * @author nxj
 * @date 2023/11/9 10:38
 * @description
 */
public class SM4Util {
    public static final String ALGORITHM_NAME = "SM4";
    public static final String ALGORITHM_NAME_ECB_PADDING = "SM4/ECB/PKCS5Padding";

    // SM4算法目前只支持128位（即密钥16字节）
    public static final int DEFAULT_KEY_SIZE = 128;

    public static final String ENCODING = "UTF-8";

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    private final byte[] sm4Key;

    public SM4Util(byte[] key) {
        this.sm4Key = key;
    }

    /**
     * 生成Base64编码的密钥
     *
     * @return Base64编码的密钥
     * @throws CryptoException
     */
    public static String generateKeyToBase64() throws CryptoException {
        return Base64.toBase64String(generateKey());
    }

    public static byte[] generateKey() throws CryptoException {
        return generateKey(DEFAULT_KEY_SIZE);
    }

    /**
     * 生成Base64编码的密钥
     *
     * @param keySize 密钥长度 单位为bit
     * @return Base64编码的密钥
     * @throws CryptoException
     */
    public static String generateKeyToBase64(int keySize) throws CryptoException {
        return Base64.toBase64String(generateKey(keySize));
    }

    public static byte[] generateKey(int keySize) throws CryptoException {
        KeyGenerator kg = null;
        try {
            kg = KeyGenerator.getInstance(ALGORITHM_NAME, BouncyCastleProvider.PROVIDER_NAME);
        } catch (Exception e) {
            throw new CryptoException("SM4Util generateKey error:", e);
        }
        kg.init(keySize, new SecureRandom());
        return kg.generateKey().getEncoded();
    }

    /**
     * ECB_PKCS5Padding 加密，返回Base64编码后的密文
     *
     * @param data 正常明文数据
     * @return
     * @throws SDKException
     */
    public String encrypt(String data) throws SDKException {
        try {
            Cipher cipher = generateECBCipher(Cipher.ENCRYPT_MODE, sm4Key);
            byte[] enData = cipher.doFinal(data.getBytes(ENCODING));
            return Base64.toBase64String(enData);
        } catch (Exception e) {
            throw new SDKException("SM4Util 加密失败!", e);
        }
    }

    /**
     * ECB_PKCS5Padding 解密 ,返回正常明文数据
     *
     * @param cipherText 返回Base64编码后的密文
     * @return
     * @throws SDKException
     */
    public String decrypt(String cipherText) throws SDKException {
        try {
            Cipher cipher = generateECBCipher(Cipher.DECRYPT_MODE, sm4Key);
            byte[] data = cipher.doFinal(Base64.decode(cipherText));
            return new String(data, ENCODING);
        } catch (Exception e) {
            throw new SDKException("SM4Util 解密失败!", e);
        }
    }

    private Cipher generateECBCipher(int mode, byte[] key)
            throws NoSuchAlgorithmException, NoSuchProviderException, NoSuchPaddingException,
            InvalidKeyException {
        Cipher cipher = Cipher.getInstance(SM4Util.ALGORITHM_NAME_ECB_PADDING, BouncyCastleProvider.PROVIDER_NAME);
        Key sm4Key = new SecretKeySpec(key, ALGORITHM_NAME);
        cipher.init(mode, sm4Key);
        return cipher;
    }

    public static boolean verifyKey(String key) {
        if (StringUtils.isBlank(key)) {
            return false;
        }
        try {
            byte[] keyByteArray = Base64.decode(key);
            if (keyByteArray.length != DEFAULT_KEY_SIZE / 8) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            String key = "dRzPaYd7z6vYn9sL/JTZ3A==";
            System.out.println(generateKeyToBase64());
            System.out.println(verifyKey(key));

            SM4Util sm4Util = new SM4Util(Base64.decode(key));

            System.out.println(Base64.decode(key).length);

            String data = "阿萨德哈的哦已我居然挤公交大幅度AAAADDF";

            String cipherText = sm4Util.encrypt(data);

            System.out.println("cipherText " + cipherText);

            String deData = sm4Util.decrypt(cipherText);

            System.out.println("deData " + deData);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
