package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2023/12/26 10:13
 * @description 账管家V2.0-账管家提现
 */
public class V2LaepIndustryEwalletWithdrawRequest extends V2CommRequest {

    /**
     * bmcp机构号
     * M
     */
    @JsonProperty("orgNo")
    private String orgNo;

    /**
     * 商户号或 receiveNo
     * M
     * 822商户号，SR分账接收方编号
     */
    @JsonProperty("merchantNo")
    private String merchantNo;

    /**
     * 提现金额（单位：元）
     * M
     */
    @JsonProperty("drawAmt")
    private String drawAmt;

    /**
     * 提款模式（D0-立即到账，D1-次日到账） 为空默认D1
     * C
     */
    @JsonProperty("drawMode")
    private String drawMode;

    /**
     * 通知地址
     * C
     */
    @JsonProperty("notifyUrl")
    private String notifyUrl;

    /**
     * 商户订单号（商户系统唯一）
     * C
     */
    @JsonProperty("merOrderNo")
    private String merOrderNo;

    /**
     * 账号（若该参数上送，则payType将无效）
     * C
     */
    @JsonProperty("payNo")
    private String payNo;

    /**
     *账号类型（01：收款账户，04：分账接收方账户 06:结算代付账户）
     * C
     * payType如果传了，就按照payType去查，如果payType没有传，则查有几个账户，如果有一个，就直接提这个，如果有多个，则默认提01，如果01没有，则报错
     */
    @JsonProperty("payType")
    private String payType;

    /**
     * 备注信息
     * C
     */
    @JsonProperty("remark")
    private String remark;

    /**
     * 摘要
     * C
     */
    private String summary;

    /**
     * 结算银行ID
     * C
     */
    @JsonProperty("bankId")
    private String bankId;

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getDrawAmt() {
        return drawAmt;
    }

    public void setDrawAmt(String drawAmt) {
        this.drawAmt = drawAmt;
    }

    public String getDrawMode() {
        return drawMode;
    }

    public void setDrawMode(String drawMode) {
        this.drawMode = drawMode;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getMerOrderNo() {
        return merOrderNo;
    }

    public void setMerOrderNo(String merOrderNo) {
        this.merOrderNo = merOrderNo;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_LAEP_INDUSTRY_EWALLETWITHDRAW;
    }
}
