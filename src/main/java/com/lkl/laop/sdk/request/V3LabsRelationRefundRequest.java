package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;
import com.lkl.laop.sdk.request.model.V3LabsTradeLocationInfo;

/**
 * @author nxj
 * @date 2023/7/21 14:07
 * @description v3退款交易
 */
public class V3LabsRelationRefundRequest extends V3CommRequest {

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
     * M
     * 退款原因描述
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
     * 下单成功时，返回的拉卡拉交易流水。 origin_out_trade_no、origin_log_no、origin_trade_no至少一个必填
     * （调用收银台下单接口拉起交易后发起退款时至少要传两个），同时存在时优先级顺序如下： origin_trade_no、origin_log_no、origin_out_trade_no。
     */
    @JsonProperty("origin_trade_no")
    private String originTradeNo;

    /**
     * 原对账单流水号
     * C
     * 对账单中的交易流水。 origin_out_trade_no、origin_log_no、origin_trade_no至少一个必填
     * （调用收银台下单接口拉起交易后发起退款时至少要传两个，同时存在时优先级顺序如下： origin_trade_no、origin_log_no、origin_out_trade_no。
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

    public V3LabsTradeLocationInfo getLocationInfo() {
        return locationInfo;
    }

    public void setLocationInfo(V3LabsTradeLocationInfo locationInfo) {
        this.locationInfo = locationInfo;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_LABS_RELATION_REFUND;
    }

}
