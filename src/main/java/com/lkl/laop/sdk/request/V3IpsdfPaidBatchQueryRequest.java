package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2024/5/16 14:10
 * @description 批量代付查询接口
 */
public class V3IpsdfPaidBatchQueryRequest extends V3CommRequest {

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
     * 批次号
     * M
     * 批量交易时填写，当天唯一,0001-9999
     */
    @JsonProperty("batch_no")
    private String batchNo;

    /**
     * 发送时间
     * M
     * 发送时间
     */
    @JsonProperty("txn_time")
    private String txnTime;

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

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getTxnTime() {
        return txnTime;
    }

    public void setTxnTime(String txnTime) {
        this.txnTime = txnTime;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_IPSDF_PAID_BATCHQUERY;
    }
}
