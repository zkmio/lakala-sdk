package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nxj
 * @date 2024/3/22 17:36
 * @description v3签约支付接口-用户信息域
 */
public class V3IpsCustomerInfo {

    /**
     * 证件类型
     * C
     * 01：身份证
     * 02：军官证
     * 03：护照
     * 04：港澳居民来往内地通行证；
     * 05: 台湾居民来往大陆通行证；
     * 06：警官证
     * 07：士兵证
     * 09：外国护照
     * 12：港澳居民居住证
     * 13：台湾居民居住证
     * 99：其它证件
     */
    @JsonProperty("certif_tp")
    private String certifTp;

    /**
     * 证件号码
     * C
     */
    @JsonProperty("certif_id")
    private String certifId;

    /**
     * 姓名
     * C
     */
    @JsonProperty("customer_nm")
    private String customerNm;

    /**
     * 短信验证码
     * C
     */
    @JsonProperty("sms_code")
    private String smsCode;

    /**
     * 持卡人密码
     * C
     */
    @JsonProperty("pin")
    private String pin;

    /**
     * cvn2
     * C
     */
    @JsonProperty("cvn2")
    private String cvn2;

    /**
     * 有效期
     * C
     * 格式YYMM
     */
    @JsonProperty("expired")
    private String expired;

    /**
     * 手机号
     */
    @JsonProperty("phone_no")
    private String phoneNo;

    public String getCertifTp() {
        return certifTp;
    }

    public void setCertifTp(String certifTp) {
        this.certifTp = certifTp;
    }

    public String getCertifId() {
        return certifId;
    }

    public void setCertifId(String certifId) {
        this.certifId = certifId;
    }

    public String getCustomerNm() {
        return customerNm;
    }

    public void setCustomerNm(String customerNm) {
        this.customerNm = customerNm;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCvn2() {
        return cvn2;
    }

    public void setCvn2(String cvn2) {
        this.cvn2 = cvn2;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
