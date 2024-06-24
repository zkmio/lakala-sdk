package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2024/3/25 10:53
 * @description 代收退款
 */
public class V3IpsdkRelationRefundRequest extends V3CommRequest {

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
     * 商户系统唯一
     */
    @JsonProperty("out_trade_no")
    private String outTradeNo;

    /**
     * 退款金额
     * M
     * 单位分，整数数字型字符
     */
    @JsonProperty("refund_amount")
    private String refundAmount;

    /**
     * 退款原因
     * C
     */
    @JsonProperty("refund_reason")
    private String refundReason;

    /**
     * 原商户交易流水号
     * C
     * 下单时的商户请求流水号（退款时originOutTradeNo，originTradeNo，originLogNo必送其一）
     */
    @JsonProperty("origin_out_trade_no")
    private String originOutTradeNo;

    /**
     * 原交易拉卡拉商户订单号
     * C
     * 下单成功时，返回的拉卡拉交易流水。 originOutTradeNo、originTradeNo、originLogNo至少一个必填，
     * 同时存在时优先级顺序如下： originTradeNo、originLogNo、originOutTradeNo。
     */
    @JsonProperty("origin_trade_no")
    private String originTradeNo;

    /**
     * 原交易logNo
     * C
     */
    @JsonProperty("origin_log_no")
    private String originLogNo;

    /**
     * 请求方IP地址
     * C
     * 请求方的IP地址，格式如36.45.36.95
     */
    @JsonProperty("request_ip")
    private String requestIp;

    /**
     * 后台通知地址
     * M
     * 同步返回成功，代表交易受理成功，交易结果通过此地址通知
     */
    @JsonProperty("notify_url")
    private String notifyUrl;

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

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getOriginOutTradeNo() {
        return originOutTradeNo;
    }

    public void setOriginOutTradeNo(String originOutTradeNo) {
        this.originOutTradeNo = originOutTradeNo;
    }

    public String getOriginTradeNo() {
        return originTradeNo;
    }

    public void setOriginTradeNo(String originTradeNo) {
        this.originTradeNo = originTradeNo;
    }

    public String getOriginLogNo() {
        return originLogNo;
    }

    public void setOriginLogNo(String originLogNo) {
        this.originLogNo = originLogNo;
    }

    public String getRequestIp() {
        return requestIp;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_IPSDK_RELATION_REFUND;
    }
}
