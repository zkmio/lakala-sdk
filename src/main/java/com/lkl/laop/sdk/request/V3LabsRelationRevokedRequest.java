package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;
import com.lkl.laop.sdk.request.model.V3LabsTradeLocationInfo;

/**
 * @author nxj
 * @date 2023/8/16 10:13
 * @description 扫码-撤销
 */
public class V3LabsRelationRevokedRequest extends V3CommRequest {

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
     * 拉卡拉分配的商户号
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
     * 原商户交易流水号
     * C
     * 下单时的商户请求流水号（撤销时origin_out_trade_no，origin_trade_no必送其一）
     */
    @JsonProperty("origin_out_trade_no")
    private String originOutTradeNo;

    /**
     * 原拉卡拉交易流水号
     * C
     * 下单成功时，返回的拉卡拉交易流水。
     */
    @JsonProperty("origin_trade_no")
    private String originTradeNo;

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

    public V3LabsTradeLocationInfo getLocationInfo() {
        return locationInfo;
    }

    public void setLocationInfo(V3LabsTradeLocationInfo locationInfo) {
        this.locationInfo = locationInfo;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_LABS_RELATION_REVOKED;
    }
}
