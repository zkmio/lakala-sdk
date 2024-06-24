package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author nxj
 * @date 2023/7/19 16:59
 * @description 支付宝主扫场景下acc_busi_fields域内容
 */
public class V3LabsTradePreorderAlipayBus extends V3LabsTradeAccBusiFieldInfo {

    /**
     * 买家在支付宝的用户id
     * C
     * 支付宝的buyer_user_id ,trans_type为41-NATIVE情况下不需要传，为51情况下必须传入
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * 预下单有效时间
     * C
     * 预下单的订单的有效时间，以分钟为单位。如果在有效时间内没有完成付款，则在账户端该订单失效。
     * 如果不上送，以账户端订单失效时间为准。 建议不超过15分钟。不传值则默认5分钟。
     */
    @JsonProperty("timeout_express")
    private String timeoutExpress;

    /**
     * 业务扩展参数
     * C
     * 支付宝业务扩展参数
     */
    @JsonProperty("extend_params")
    private AlipayExtendParamInfo extendParams;

    /**
     * 商品详情
     * C
     * 订单包含的商品列表信息，Json数组。
     */
    @JsonProperty("goods_detail")
    private List<AlipayGoodsDeTail> goodsDetail;

    /**
     * 用户付款中途退出返回商户网站的地址
     * C
     * transType=81时（即支付宝H5支付），此参数必传
     */
    @JsonProperty("quit_url")
    private String quitUrl;

    /**
     * 商户门店编号
     * C
     * 支付宝收单上送
     */
    @JsonProperty("store_id")
    private String storeId;

    /**
     * 支付宝禁用支付渠道
     * C
     * “credit_group”表示禁用信用卡
     */
    @JsonProperty("disable_pay_channels")
    private String disablePayChannels;

    /**
     * 商户传入业务信息
     * C
     * 商户传入业务信息，应用于安全，营销等参数直传场景，格式为 json 格式。
     * 示例：{“enable_thirdpar ty_subsidy”:”N”}
     */
    @JsonProperty("business_params")
    private String businessParams;

    /**
     * 允许的最小买家年龄
     * C
     * 买家年龄必须大于等于所传数值
     */
    @JsonProperty("min_age")
    private String minAge;

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

    public AlipayExtendParamInfo getExtendParams() {
        return extendParams;
    }

    public void setExtendParams(AlipayExtendParamInfo extendParams) {
        this.extendParams = extendParams;
    }

    public List<AlipayGoodsDeTail> getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(List<AlipayGoodsDeTail> goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    public String getQuitUrl() {
        return quitUrl;
    }

    public void setQuitUrl(String quitUrl) {
        this.quitUrl = quitUrl;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getDisablePayChannels() {
        return disablePayChannels;
    }

    public void setDisablePayChannels(String disablePayChannels) {
        this.disablePayChannels = disablePayChannels;
    }

    public String getBusinessParams() {
        return businessParams;
    }

    public void setBusinessParams(String businessParams) {
        this.businessParams = businessParams;
    }

    public String getMinAge() {
        return minAge;
    }

    public void setMinAge(String minAge) {
        this.minAge = minAge;
    }

    public static class AlipayExtendParamInfo {
        /**
         * 服务商的PID
         * C
         * 系统商编号，该参数作为系统商返佣数据提取的依据，请填写系统商签约协议的 PID
         */
        @JsonProperty("sys_service_provider_id")
        private String sysServiceProviderId;

        /**
         * 花呗分期期数
         * M
         * 支付宝花呗分期必送字段: 花呗分期数 3：3期 6：6期 12：12期
         */
        @JsonProperty("hb_fq_num")
        private String hbFqNum;

        /**
         * 卖家承担手续费比例
         * M
         * 支付宝花呗分期必送字段: 卖家承担收费比例，商家承担手续费传入100，用户承担手续费传入0，仅支持传入100、0两种，
         * 其他比例暂不支持 100：代表商家贴息 0：代表用户承担手续费
         */
        @JsonProperty("hb_fq_seller_percent")
        private String hbFqSellerPercent;

        /**
         * 点餐场景类型
         * C
         * 点餐场景类型：qr_order（店内扫码点餐）
         * pre_order（预点到店自提）
         * home_delivery （外送到家）
         * direct_payment（直接付款）
         * other（其它）
         */
        @JsonProperty("food_order_type")
        private String foodOrderType;

        public String getSysServiceProviderId() {
            return sysServiceProviderId;
        }

        public void setSysServiceProviderId(String sysServiceProviderId) {
            this.sysServiceProviderId = sysServiceProviderId;
        }

        public String getHbFqNum() {
            return hbFqNum;
        }

        public void setHbFqNum(String hbFqNum) {
            this.hbFqNum = hbFqNum;
        }

        public String getHbFqSellerPercent() {
            return hbFqSellerPercent;
        }

        public void setHbFqSellerPercent(String hbFqSellerPercent) {
            this.hbFqSellerPercent = hbFqSellerPercent;
        }

        public String getFoodOrderType() {
            return foodOrderType;
        }

        public void setFoodOrderType(String foodOrderType) {
            this.foodOrderType = foodOrderType;
        }
    }

    public static class AlipayGoodsDeTail {

        /**
         * 商品的编号
         * M
         */
        @JsonProperty("goods_id")
        private String goodsId;

        /**
         * 支付宝定义的统一商品编号
         * C
         */
        @JsonProperty("alipay_goods_id")
        private String alipayGoodsId;

        /**
         * 商品名称
         * M
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品数量
         * M
         * 支持小数，精确到小数点后两位
         */
        @JsonProperty("quantity")
        private String quantity;

        /**
         * 商品价格 单位元
         * M
         */
        @JsonProperty("price")
        private String price;

        /**
         * 商品类目
         * C
         */
        @JsonProperty("goods_category")
        private String goodsCategory;

        /**
         * 商品类目树，从商品类目根节点到叶子节点的类目id组成，类目id值使用|分割
         * C
         */
        @JsonProperty("categories_tree")
        private String categoriesTree;

        /**
         * 商品描述信息
         * C
         */
        @JsonProperty("body")
        private String body;

        /**
         * 商品的展示地址
         * C
         */
        @JsonProperty("show_url")
        private String showUrl;

        public String getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(String goodsId) {
            this.goodsId = goodsId;
        }

        public String getAlipayGoodsId() {
            return alipayGoodsId;
        }

        public void setAlipayGoodsId(String alipayGoodsId) {
            this.alipayGoodsId = alipayGoodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public void setGoodsName(String goodsName) {
            this.goodsName = goodsName;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getGoodsCategory() {
            return goodsCategory;
        }

        public void setGoodsCategory(String goodsCategory) {
            this.goodsCategory = goodsCategory;
        }

        public String getCategoriesTree() {
            return categoriesTree;
        }

        public void setCategoriesTree(String categoriesTree) {
            this.categoriesTree = categoriesTree;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getShowUrl() {
            return showUrl;
        }

        public void setShowUrl(String showUrl) {
            this.showUrl = showUrl;
        }
    }
}
