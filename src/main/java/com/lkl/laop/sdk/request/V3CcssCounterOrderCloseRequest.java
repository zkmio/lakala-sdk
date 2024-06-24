package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2024/5/16 14:19
 * @description 收银台关单
 * 输入参数要么传out_order_no，要么传pay_order_no
 */
public class V3CcssCounterOrderCloseRequest extends V3CommRequest {

    /**
     * 商户号
     * M
     */
    @JsonProperty("merchant_no")
    private String merchantNo;

    /**
     * 商户订单号
     * O
     */
    @JsonProperty("out_order_no")
    private String outOrderNo;

    /**
     * 支付订单号
     * O
     */
    @JsonProperty("pay_order_no")
    private String payOrderNo;

    /**
     * 渠道号
     * O
     */
    @JsonProperty("channel_id")
    private String channelId;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
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
        return FunctionCodeEnum.API_V3_CCSS_COUNTER_ORDER_CLOSE;
    }
}
