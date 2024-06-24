package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;
import com.lkl.laop.sdk.request.model.V3IpsdfPayerInfo;

/**
 * @author nxj
 * @date 2024/5/16 09:47
 * @description 实时代付接口
 */
public class V3IpsdfPaidPayRequest extends V3CommRequest {

    /**
     * 商户号
     * M
     * 拉卡拉分配的商户号
     */
    @JsonProperty("merchant_no")
    private String merchantNo;

    /**
     * 终端号
     * M
     * 拉卡拉分配的业务终端号
     */
    @JsonProperty("term_no")
    private String termNo;

    /**
     * 商户交易流水号
     * M
     * 商户系统唯一，对应数据库表中外部请求流水号。
     */
    @JsonProperty("out_trade_no")
    private String outTradeNo;

    /**
     * 交易金额
     * M
     * 单位分，整数型字符
     */
    @JsonProperty("txn_amt")
    private String txnAmt;

    /**
     * 结算/出款周期
     * M
     * D0 - 实时 暂时只支持：D0
     */
    @JsonProperty("period_type")
    private String periodType;

    /**
     * 附言
     * O
     */
    @JsonProperty("remark")
    private String remark;

    /**
     * 业务摘要
     * O
     */
    @JsonProperty("summary")
    private String summary;

    /**
     * 收款帐户信息
     * C
     * 格式jsonObject
     */
    @JsonProperty("payer_info")
    private V3IpsdfPayerInfo payerInfo;

    /**
     * 子虚户号
     * O
     */
    @JsonProperty("sub_vir_acct")
    private String subVirAcct;

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

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getTxnAmt() {
        return txnAmt;
    }

    public void setTxnAmt(String txnAmt) {
        this.txnAmt = txnAmt;
    }

    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
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

    public V3IpsdfPayerInfo getPayerInfo() {
        return payerInfo;
    }

    public void setPayerInfo(V3IpsdfPayerInfo payerInfo) {
        this.payerInfo = payerInfo;
    }

    public String getSubVirAcct() {
        return subVirAcct;
    }

    public void setSubVirAcct(String subVirAcct) {
        this.subVirAcct = subVirAcct;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_IPSDF_PAID_PAY;
    }
}
