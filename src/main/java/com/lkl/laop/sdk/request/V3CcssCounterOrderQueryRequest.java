package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2023/8/16 16:01
 * @description 收银台订单查询
 * 说明: 输入参数要么传out_order_no+merchant_no，
 * 要么传要么传pay_order_no+merchant_no。
 */
public class V3CcssCounterOrderQueryRequest extends V3CommRequest {

    /**
     * 商户订单号
     * C
     */
    @JsonProperty("out_order_no")
    private String outOrderNo;

    /**
     * 银联商户号
     * M
     */
    @JsonProperty("merchant_no")
    private String merchantNo;

    /**
     * 支付订单号
     * C
     */
    @JsonProperty("pay_order_no")
    private String payOrderNo;

    /**
     * 渠道号
     * C
     */
    @JsonProperty("channel_id")
    private String channelId;

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_CCSS_COUNTER_ORDER_QUERY;
    }
}
