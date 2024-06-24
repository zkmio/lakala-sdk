package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author nxj
 * @date 2023/7/21 13:56
 * @description 微信二维码被扫场景下acc_busi_fields域内容
 */
public class V3LabsTradeMicropayWechatBus extends V3LabsTradeAccBusiFieldInfo {

    /**
     * 子商户公众账号ID
     * C
     * 微信公众平台基本配置中的AppID(应用ID)，传入后支付成功可返回对应公众号下的用户openid，只对微信支付有效
     */
    @JsonProperty("sub_appid")
    private String subAppid;

    /**
     * 商品详情
     * C
     * 单品优惠功能字段，json字符串格式，内容见以下“微信detail字段说明”
     */
    @JsonProperty("detail")
    private AccBusiDetail detail;

    /**
     * 订单优惠标记
     * C
     * 订单优惠标记，微信平台配置的商品标记，用于优惠券或者满减使用，accountType为WECHAT时，可选填此字段
     */
    @JsonProperty("goods_tag")
    private String goodsTag;

    /**
     * 设备号
     * C
     * 终端设备号(商户自定义，如门店编号)
     */
    @JsonProperty("device_info")
    private String deviceInfo;

    /**
     * 指定支付方式
     * C
     * no_credit–指定不能使用信用卡支付
     */
    @JsonProperty("limit_pay")
    private String limitPay;

    /**
     * 场景信息
     * C
     * 该字段用于上报场景信息，目前支持上报实际门店信息。
     */
    @JsonProperty("scene_info")
    private String sceneInfo;

    /**
     * 限定支付
     * C
     * ADULT：成年人
     */
    @JsonProperty("limit_payer")
    private String limitPayer;

    public String getSubAppid() {
        return subAppid;
    }

    public void setSubAppid(String subAppid) {
        this.subAppid = subAppid;
    }


    public AccBusiDetail getDetail() {
        return detail;
    }

    public void setDetail(AccBusiDetail detail) {
        this.detail = detail;
    }

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getLimitPay() {
        return limitPay;
    }

    public void setLimitPay(String limitPay) {
        this.limitPay = limitPay;
    }

    public String getSceneInfo() {
        return sceneInfo;
    }

    public void setSceneInfo(String sceneInfo) {
        this.sceneInfo = sceneInfo;
    }

    public String getLimitPayer() {
        return limitPayer;
    }

    public void setLimitPayer(String limitPayer) {
        this.limitPayer = limitPayer;
    }

    /**
     * 微信detail字段
     */
    public static class AccBusiDetail {

        /**
         * 1.商户侧一张小票订单可能被分多次支付，订单原 价用于记录整张小票的交易金额。
         * 2.当订单原价与支付金额不相等，则不享受优惠。
         * 3.该字段主要用于防止同一张小票分多次支付，以 享受多次优惠的情况，正常支付订单不必上传此参 数。 如：608800
         * C
         */
        @JsonProperty("cost_price")
        private Integer costPrice;

        /**
         * 商家小票 ID
         * C
         */
        @JsonProperty("receipt_id")
        private String receiptId;


        /**
         * 单品信息，使用Json数组格式提交
         * M
         */
        @JsonProperty("goods_detail")
        private List<WechatGoodsDetail> goodsDetail;

        public Integer getCostPrice() {
            return costPrice;
        }

        public void setCostPrice(Integer costPrice) {
            this.costPrice = costPrice;
        }

        public String getReceiptId() {
            return receiptId;
        }

        public void setReceiptId(String receiptId) {
            this.receiptId = receiptId;
        }

        public List<WechatGoodsDetail> getGoodsDetail() {
            return goodsDetail;
        }

        public void setGoodsDetail(List<WechatGoodsDetail> goodsDetail) {
            this.goodsDetail = goodsDetail;
        }
    }

    /**
     * 微信goods_detail字段
     */
    public static class WechatGoodsDetail {

        /**
         * 商品的编号
         * 由半角的大小写字母、数字、中划线、下划线中的一种或几种组成。如“商品编码”
         * M
         */
        @JsonProperty("goods_id")
        private String goodsId;

        /**
         * 微信支付定义的统一商品编号
         * C
         */
        @JsonProperty("wxpay_goods_id")
        private String wxpayGoodsId;

        /**
         * 商品的实际名称
         * C
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 用户购买的数量
         * M
         */
        @JsonProperty("quantity")
        private Integer quantity;

        /**
         * 单位为：分。如果商户有优惠，需传输商户优惠后的单价
         * M
         */
        @JsonProperty("price")
        private Integer price;

        public String getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(String goodsId) {
            this.goodsId = goodsId;
        }

        public String getWxpayGoodsId() {
            return wxpayGoodsId;
        }

        public void setWxpayGoodsId(String wxpayGoodsId) {
            this.wxpayGoodsId = wxpayGoodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public void setGoodsName(String goodsName) {
            this.goodsName = goodsName;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }
    }
}
