package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nxj
 * @date 2023/7/20 10:10
 * @description 银联云闪付主扫场景下acc_busi_fields域内容
 */
public class V3LabsTradePreorderUnionPayBus extends V3LabsTradeAccBusiFieldInfo {

    /**
     * 用户id
     * C
     * JS获取用户标识返回码不为34时，必送（ https://open.unionpay.com/tjweb/api/interface?apiSvcId=579&id=804 ）
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * 预下单有效时间
     * C
     * 预下单的订单的有效时间，以分钟为单位。如果在有效时间内没有完成付款，则在账户端该订单失效。如果不上送，以账户端订单失效时间为准。 建议不超过15分钟。不传值则默认5分钟。
     */
    @JsonProperty("timeout_express")
    private String timeoutExpress;

    /**
     * 银联订单信息(暂不支持,以接口文档为准)
     * C
     */
    @JsonProperty("acq_addn_data_order_info")
    private String acqAddnDataOrderInfo;

    /**
     * 银联商品信息(暂不支持,以接口文档为准)
     * C
     */
    @JsonProperty("acq_addn_data_goods_info")
    private String acqAddnDataGoodsInfo;

    /**
     * 银联前台通知地址
     * C
     * 收款方向银联推送订单时上送的前台通知地址（仅允许为外网地址），用户完成支付点击，“返回”后，银联通过浏览器POST请求到该地址。
     * 当transType为JSAPI，payMode为UQRCODEPAY时，可选填此字段
     */
    @JsonProperty("front_url")
    private String frontUrl;

    /**
     * 银联失败交易前台通知地址
     * C
     * 收款方向银联推送订单时上送的失败交易前台通知地址（仅允许为外网地址），用户支付过程中交易失败，点击“返回”后，银联通过浏览器GET请求到该地址。
     * 当transType为JSAPI，payMode为UQRCODEPAY时，可选填此字段，需与frontUrl同时出现，未上送默认为frontUrl的值
     */
    @JsonProperty("front_fail_url")
    private String frontFailUrl;

    /**
     * 分期意愿
     * C
     * 0: 不分期（缺省） 1：分期
     */
    @JsonProperty("instal_will")
    private String instalWill;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTimeoutExpress() {
        return timeoutExpress;
    }

    public void setTimeoutExpress(String timeoutExpress) {
        this.timeoutExpress = timeoutExpress;
    }

    public String getAcqAddnDataOrderInfo() {
        return acqAddnDataOrderInfo;
    }

    public void setAcqAddnDataOrderInfo(String acqAddnDataOrderInfo) {
        this.acqAddnDataOrderInfo = acqAddnDataOrderInfo;
    }

    public String getAcqAddnDataGoodsInfo() {
        return acqAddnDataGoodsInfo;
    }

    public void setAcqAddnDataGoodsInfo(String acqAddnDataGoodsInfo) {
        this.acqAddnDataGoodsInfo = acqAddnDataGoodsInfo;
    }

    public String getFrontUrl() {
        return frontUrl;
    }

    public void setFrontUrl(String frontUrl) {
        this.frontUrl = frontUrl;
    }

    public String getFrontFailUrl() {
        return frontFailUrl;
    }

    public void setFrontFailUrl(String frontFailUrl) {
        this.frontFailUrl = frontFailUrl;
    }

    public String getInstalWill() {
        return instalWill;
    }

    public void setInstalWill(String instalWill) {
        this.instalWill = instalWill;
    }

}

