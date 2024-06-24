package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;
import com.lkl.laop.sdk.request.model.V3IpsCustomerInfo;

/**
 * @author nxj
 * @date 2024/3/25 10:33
 * @description 代收签约确认
 */
public class V3IpsdkTransCollectionSignConfirmRequest extends V3CommRequest {
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
     * 拉卡拉分配的终端号
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
     * 交易请求时间
     * M
     */
    @JsonProperty("txn_time")
    private String txnTime;

    /**
     * 交易请求时间
     * M
     */
    @JsonProperty("customer_info")
    private V3IpsCustomerInfo customerInfo;

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

    public String getTxnTime() {
        return txnTime;
    }

    public void setTxnTime(String txnTime) {
        this.txnTime = txnTime;
    }

    public V3IpsCustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(V3IpsCustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_IPSDK_TRANS_COLLECTIONSIGNCONFIRM;
    }
}
