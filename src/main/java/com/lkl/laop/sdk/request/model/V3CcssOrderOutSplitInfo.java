package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nxj
 * @date 2023/8/16 15:00
 * @description 收银台订单-拆单信息
 */
public class V3CcssOrderOutSplitInfo {

    /**
     * 外部子订单号
     * M
     * 商户子订单号
     */
    @JsonProperty("out_sub_order_no")
    private String outSubOrderNo;

    /**
     * 拉卡拉分配的银联商户号
     * M
     */
    @JsonProperty("merchant_no")
    private String merchantNo;

    /**
     * 拉卡拉分配的业务终端号
     * M
     */
    @JsonProperty("term_no")
    private String termNo;

    /**
     * 金额
     * M
     * 单位分，整数型字符
     */
    @JsonProperty("amount")
    private String amount;

    /**
     * 结算类型（合单）
     * C
     * “0”或者空，常规结算方式
     */
    @JsonProperty("settle_type")
    private String settleType;

    public String getOutSubOrderNo() {
        return outSubOrderNo;
    }

    public void setOutSubOrderNo(String outSubOrderNo) {
        this.outSubOrderNo = outSubOrderNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getTermNo() {
        return termNo;
    }

    public void setTermNo(String termNo) {
        this.termNo = termNo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getSettleType() {
        return settleType;
    }

    public void setSettleType(String settleType) {
        this.settleType = settleType;
    }
}
