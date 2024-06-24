package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;
import com.lkl.laop.sdk.request.model.V3LabsTradeLocationInfo;

/**
 * @author nxj
 * @date 2023/8/15 16:33
 * @description 商户订单退款交易
 */
public class V3LabsRelationIdmrefundRequest extends V3CommRequest {

    /**
     * 商户号
     * M
     * 拉卡拉分配的银联商户号
     */
    @JsonProperty("merchant_no")
    private String merchantNo;

    /**
     * 终端号
     * M
     * 拉卡拉分配的商户号
     */
    @JsonProperty("term_no")
    private String termNo;

    /**
     * 商户退款订单号
     * M
     * 支持使用该退款订单号，在退款失败的场景下，重复发起退款。
     */
    @JsonProperty("out_refund_order_no")
    private String outRefundOrderNo;

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
     * 下单时的商户请求流水号（退款时origin_out_trade_no，origin_trade_no，origin_log_no必送其一）
     */
    @JsonProperty("origin_out_trade_no")
    private String originOutTradeNo;

    /**
     * 原拉卡拉交易流水号
     * C
     * 下单成功时，返回的拉卡拉交易流水。 origin_out_trade_no、origin_log_no、origin_trade_no至少一个必填，
     * 同时存在时优先级顺序如下： origin_trade_no、origin_log_no、origin_out_trade_no。
     */
    @JsonProperty("origin_trade_no")
    private String originTradeNo;

    /**
     * 原对账单流水号
     * C
     * 对账单中的交易流水。 origin_out_trade_no、origin_log_no、origin_trade_no至少一个必填，
     * 同时存在时优先级顺序如下： origin_trade_no、origin_log_no、origin_out_trade_no。
     */
    @JsonProperty("origin_log_no")
    private String originLogNo;

    /**
     * 地址位置信息
     * M
     * 地址位置信息，风控要求必送
     */
    @JsonProperty("location_info")
    private V3LabsTradeLocationInfo locationInfo;

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

    public String getOutRefundOrderNo() {
        return outRefundOrderNo;
    }

    public void setOutRefundOrderNo(String outRefundOrderNo) {
        this.outRefundOrderNo = outRefundOrderNo;
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

    public V3LabsTradeLocationInfo getLocationInfo() {
        return locationInfo;
    }

    public void setLocationInfo(V3LabsTradeLocationInfo locationInfo) {
        this.locationInfo = locationInfo;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_LABS_RELATION_IDMREFUND;
    }

}
