package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2023/11/23 17:13
 * @description 商户服务接口V3.0-退货查询
 */
public class V3LamsTradeTradeRefundQueryRequest extends V3CommRequest {

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
     * 原交易日期
     * M
     * 原退货交易日期：yyyyMMdd 20200326，posp接口必填
     */
    @JsonProperty("origin_trade_date")
    private String originTradeDate;

    /**
     * 原业务类型
     * M
     * 原交易类型:1 银行卡，2 外卡，3 扫码，4 线上
     */
    @JsonProperty("origin_biz_type")
    private String originBizType;

    /**
     * 原交易拉卡拉交易订单号
     * C
     * 小票订单号、微信/支付宝商家订单号
     */
    @JsonProperty("origin_trade_no")
    private String originTradeNo;

    /**
     * 系统参考号
     * origin_out_trade_no、origin_trade_ref_no必填一个
     * C
     * 小票参考号
     */
    @JsonProperty("origin_trade_ref_no")
    private String originTradeRefNo;

    /**
     * 退款请求流水号
     * origin_out_trade_no、origin_trade_ref_no必填一个
     * C
     * 原退款交易商户请求流水号
     */
    @JsonProperty("origin_out_trade_no")
    private String originOutTradeNo;

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

    public String getOriginTradeDate() {
        return originTradeDate;
    }

    public void setOriginTradeDate(String originTradeDate) {
        this.originTradeDate = originTradeDate;
    }

    public String getOriginBizType() {
        return originBizType;
    }

    public void setOriginBizType(String originBizType) {
        this.originBizType = originBizType;
    }

    public String getOriginTradeNo() {
        return originTradeNo;
    }

    public void setOriginTradeNo(String originTradeNo) {
        this.originTradeNo = originTradeNo;
    }

    public String getOriginTradeRefNo() {
        return originTradeRefNo;
    }

    public void setOriginTradeRefNo(String originTradeRefNo) {
        this.originTradeRefNo = originTradeRefNo;
    }

    public String getOriginOutTradeNo() {
        return originOutTradeNo;
    }

    public void setOriginOutTradeNo(String originOutTradeNo) {
        this.originOutTradeNo = originOutTradeNo;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_LAMS_TRADE_TRADE_REFUND_QUERY;
    }
}
