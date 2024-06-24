package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2024/1/15 13:40
 * @description 账管家V2.0-可用余额定向转账
 */
public class V2LaepIndustryTransferDirectRequest extends V2CommRequest {

    /**
     * 转出BMCP机构号
     * M
     */
    @JsonProperty("outBmcpNo")
    private String outBmcpNo;

    /**
     * 转出822商户号
     * M
     */
    @JsonProperty("outMercId")
    private String outMercId;

    /**
     * 转出账户类型 01 收款账户
     * M
     */
    @JsonProperty("outAcctType")
    private String outAcctType;

    /**
     * 转入BMCP机构号
     * M
     */
    @JsonProperty("inBmcpNo")
    private String inBmcpNo;

    /**
     * 转入822商户号
     * M
     */
    @JsonProperty("inMercId")
    private String inMercId;

    /**
     * 转入账户类型 06 结算代付账户
     * M
     */
    @JsonProperty("inPayType")
    private String inPayType;

    /**
     * 商户订单号
     * M
     */
    @JsonProperty("merOrderNo")
    private String merOrderNo;

    /**
     * 金额（单位：元）
     * M
     */
    @JsonProperty("amount")
    private String amount;

    /**
     * 备注
     * C
     */
    @JsonProperty("remark")
    private String remark;

    public String getOutBmcpNo() {
        return outBmcpNo;
    }

    public void setOutBmcpNo(String outBmcpNo) {
        this.outBmcpNo = outBmcpNo;
    }

    public String getOutMercId() {
        return outMercId;
    }

    public void setOutMercId(String outMercId) {
        this.outMercId = outMercId;
    }

    public String getOutAcctType() {
        return outAcctType;
    }

    public void setOutAcctType(String outAcctType) {
        this.outAcctType = outAcctType;
    }

    public String getInBmcpNo() {
        return inBmcpNo;
    }

    public void setInBmcpNo(String inBmcpNo) {
        this.inBmcpNo = inBmcpNo;
    }

    public String getInMercId() {
        return inMercId;
    }

    public void setInMercId(String inMercId) {
        this.inMercId = inMercId;
    }

    public String getInPayType() {
        return inPayType;
    }

    public void setInPayType(String inPayType) {
        this.inPayType = inPayType;
    }

    public String getMerOrderNo() {
        return merOrderNo;
    }

    public void setMerOrderNo(String merOrderNo) {
        this.merOrderNo = merOrderNo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_LAEP_INDUSTRY_TRANSFER_DIRECT;
    }
}
