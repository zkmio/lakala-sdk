package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;
import com.lkl.laop.sdk.request.model.V3LabsTradeLocationInfo;

/**
 * @author nxj
 * @date 2023/11/24 11:07
 * @description 商户服务接口V3.0-统一退货
 */
public class V3LamsTradeTradeRefundRequest extends V3CommRequest {

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
     * 商户请求流水号
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
     * 原业务类型
     * M
     * 原交易类型:1 银行卡，2 外卡，3 扫码，4 线上
     */
    @JsonProperty("origin_biz_type")
    private String originBizType;

    /**
     * 原交易日期
     * M
     * 原退货交易日期：yyyyMMdd 20200326
     */
    @JsonProperty("origin_trade_date")
    private String originTradeDate;

    /**
     * 拉卡拉对账单流水号
     * C
     * 交易返回的拉卡拉统一交易单号，扫码交易为66开头，POSP交易为年份后两位开头
     */
    @JsonProperty("origin_log_no")
    private String originLogNo;

    /**
     * 原交易拉卡拉交易订单号
     * C
     * 下单成功时，返回的扫码系统生成的送往账户方的交易流水号，在微信或支付宝交易信息界面显示为商户订单号
     */
    @JsonProperty("origin_trade_no")
    private String originTradeNo;

    /**
     * 原交易银行卡号
     * C
     * 原交易银行卡号，银行卡退款必填，如无完整卡号可送交易通知时的脱敏卡号如6226****8223
     */
    @JsonProperty("origin_card_no")
    private String originCardNo;

    /**
     * 退款模式
     * C
     * 当商户进件时退货模式配置的为 指定模式退货时，该字段有效。00：退货帐户,05：商户余额退货,06：终端余额退货
     */
    @JsonProperty("refund_type")
    private String refundType;

    /**
     * 地址位置信息
     * C
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

    public String getOriginBizType() {
        return originBizType;
    }

    public void setOriginBizType(String originBizType) {
        this.originBizType = originBizType;
    }

    public String getOriginTradeDate() {
        return originTradeDate;
    }

    public void setOriginTradeDate(String originTradeDate) {
        this.originTradeDate = originTradeDate;
    }

    public String getOriginLogNo() {
        return originLogNo;
    }

    public void setOriginLogNo(String originLogNo) {
        this.originLogNo = originLogNo;
    }

    public String getOriginTradeNo() {
        return originTradeNo;
    }

    public void setOriginTradeNo(String originTradeNo) {
        this.originTradeNo = originTradeNo;
    }

    public String getOriginCardNo() {
        return originCardNo;
    }

    public void setOriginCardNo(String originCardNo) {
        this.originCardNo = originCardNo;
    }

    public String getRefundType() {
        return refundType;
    }

    public void setRefundType(String refundType) {
        this.refundType = refundType;
    }

    public V3LabsTradeLocationInfo getLocationInfo() {
        return locationInfo;
    }

    public void setLocationInfo(V3LabsTradeLocationInfo locationInfo) {
        this.locationInfo = locationInfo;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_LAMS_TRADE_TRADE_REFUND;
    }
}
