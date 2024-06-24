package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author nxj
 * @date 2023/7/19 17:51
 * @description 微信主扫场景下acc_busi_fields域内容
 */
public class V3LabsTradePreorderWechatBus extends V3LabsTradeAccBusiFieldInfo {

    /**
     * 预下单有效时间
     * C
     * 预下单的订单的有效时间，以分钟为单位。建议不超过15分钟。不传值则默认5分钟。
     * (微信主扫下单上送的失效时间，是控制prepay_id调起支付的有效时间。微信后台不会根据失效时间发起关单。 如需关单，调用关单接口。)
     */
    @JsonProperty("timeout_express")
    private String timeoutExpress;

    /**
     * 子商户公众账号ID
     * C
     * 微信分配的子商户公众账号ID，sub_appid（即微信小程序支付-71、公众号支付-51），
     * 此参数必传，只对微信支付有效 工行数字钱包情况下，该字段上送工行的openId 拉卡拉钱包情况下，该字段上送LAKALA的userId
     */
    @JsonProperty("sub_appid")
    private String subAppid;

    /**
     * 用户标识
     * C
     * 用户在子商户sub_appid下的唯一标识，sub_openid，（即微信小程序支付-71、众号支付-51），此参数必传，只对微信支付有效
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * 商品详情
     * C
     * 单品优惠功能字段
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
     * 附加域
     * C
     * 该字段主要用于商户携带订单的自定义数据。商户定制字段，直接送到账户端。
     */
    @JsonProperty("attach")
    private String attach;

    /**
     * 设备号
     * C
     * 终端设备号(门店号或收银设备ID)，注意：PC网页或JSAPI支付请传”WEB”
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

    public String getTimeoutExpress() {
        return timeoutExpress;
    }

    public void setTimeoutExpress(String timeoutExpress) {
        this.timeoutExpress = timeoutExpress;
    }

    public String getSubAppid() {
        return subAppid;
    }

    public void setSubAppid(String subAppid) {
        this.subAppid = subAppid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
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
