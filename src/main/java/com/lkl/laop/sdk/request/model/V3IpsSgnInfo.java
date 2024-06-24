package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nxj
 * @date 2024/3/25 09:48
 * @description 3签约支付接口-签约人信息域
 */
public class V3IpsSgnInfo {
    /**
     * 签约人账户类型
     * C
     * 账户类型：00-个人银行借记账户 01-个人银行贷记账户02-个人银行准贷记账户 03-个人支付账户 04-单位支付账户 05-对公银行账户 06-备付金账户 07-存折 99-其他 (具体哪些对外开，待确认)
     */
    @JsonProperty("sng_acct_tp")
    private String sngAcctTp;

    /**
     * 签约人账户编号
     * M
     * 签约人银行卡卡号
     */
    @JsonProperty("sgn_acct_id")
    private String sgnAcctId;

    /**
     * 开户行代码
     * M
     */
    @JsonProperty("iss_ins_code")
    private String issInsCode;

    /**
     * 签约人账户名称
     * M
     * 签约人姓名
     */
    @JsonProperty("sgn_acct_nm")
    private String sgnAcctNm;

    /**
     * 签约人证件类型
     * M
     */
    @JsonProperty("id_tp")
    private String idTp;

    /**
     * 签约人证件号码
     * M
     * 签约人证件号码：身份证号码
     */
    @JsonProperty("id_no")
    private String idNo;

    /**
     * 签约人预留手机号码
     * M
     */
    @JsonProperty("mob_no")
    private String mobNo;

    /**
     * cvn2
     * C
     * 信用卡必填
     */
    @JsonProperty("cvn2")
    private String cvn2;

    /**
     * 有效日期
     * C
     * 信用卡必填 yymm
     */
    @JsonProperty("va_date")
    private String vaDate;

    public String getSngAcctTp() {
        return sngAcctTp;
    }

    public void setSngAcctTp(String sngAcctTp) {
        this.sngAcctTp = sngAcctTp;
    }

    public String getSgnAcctId() {
        return sgnAcctId;
    }

    public void setSgnAcctId(String sgnAcctId) {
        this.sgnAcctId = sgnAcctId;
    }

    public String getIssInsCode() {
        return issInsCode;
    }

    public void setIssInsCode(String issInsCode) {
        this.issInsCode = issInsCode;
    }

    public String getSgnAcctNm() {
        return sgnAcctNm;
    }

    public void setSgnAcctNm(String sgnAcctNm) {
        this.sgnAcctNm = sgnAcctNm;
    }

    public String getIdTp() {
        return idTp;
    }

    public void setIdTp(String idTp) {
        this.idTp = idTp;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getCvn2() {
        return cvn2;
    }

    public void setCvn2(String cvn2) {
        this.cvn2 = cvn2;
    }

    public String getVaDate() {
        return vaDate;
    }

    public void setVaDate(String vaDate) {
        this.vaDate = vaDate;
    }
}
