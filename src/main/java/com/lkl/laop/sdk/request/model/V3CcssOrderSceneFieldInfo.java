package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nxj
 * @date 2023/8/16 15:24
 * @description 收银台订单-订单场景域
 */
public class V3CcssOrderSceneFieldInfo {

    /**
     * 订单场景类型
     * M
     * HB_FQ：花呗分期场景
     * ONLINE_WILDCARD：线上外卡场景
     * KL_FQ：考拉分期场景
     */
    @JsonProperty("order_scene_type")
    private String orderSceneType;

    /**
     * 加密域
     * C
     * 加密域信息（json字符串格式），不同的订单场景类型需要上送的结构不一样（详见具体场景）
     *
     * @see OnlineWildcardEncryptedField
     * @see KlFqEncryptedField
     */
    @JsonProperty("encrypted_field")
    private String encryptedField;

    /**
     * 订单场景信息
     * C
     * 订单场景信息（json字符串格式），不同的订单场景类型需要上送的结构不一样（详见具体场景）
     *
     * @see HbFqSceneInfo
     * @see OnlineWildcardSceneInfo
     * @see KlFqSceneInfo
     */
    @JsonProperty("scene_info")
    private String sceneInfo;

    public String getOrderSceneType() {
        return orderSceneType;
    }

    public void setOrderSceneType(String orderSceneType) {
        this.orderSceneType = orderSceneType;
    }

    public String getSceneInfo() {
        return sceneInfo;
    }

    public void setSceneInfo(String sceneInfo) {
        this.sceneInfo = sceneInfo;
    }

    public String getEncryptedField() {
        return encryptedField;
    }

    public void setEncryptedField(String encryptedField) {
        this.encryptedField = encryptedField;
    }

    public static class HbFqSceneInfo {
        /**
         * 花呗分期期数
         * M
         * 支付宝花呗分期必送字段: 花呗分期数 3：3期 6：6期 12：12期
         */
        @JsonProperty("hbFqNum")
        private String hbFqNum;

        /**
         * 卖家承担手续费比例
         * M
         * 支付宝花呗分期必送字段: 卖家承担收费比例，商家承担手续费传入100，用户承担手续费传入0，仅支持传入100、0两种，其他比例暂不支持 100：代表商家贴息 0：代表用户承担手续费
         */
        @JsonProperty("hbFqSellerPercent")
        private String hbFqSellerPercent;

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
    }

    public static class OnlineWildcardSceneInfo {
        /**
         * 用户id
         * M
         * 用户id
         */
        @JsonProperty("userId")
        private String userId;

        /**
         * 用户创建时间
         * M
         * 消费者在商户网站创建账号的日期 （yyyyMMddHHmmss）
         */
        @JsonProperty("userCreateDate")
        private String userCreateDate;

        /**
         * 收件人街道
         * C
         * 收件人街道
         */
        @JsonProperty("recipientStreet")
        private String recipientStreet;

        /**
         * 收件人城市
         * C
         * 收件人城市
         */
        @JsonProperty("recipientCity")
        private String recipientCity;

        /**
         * 收件人州 省
         * C
         * 收件人州 省
         */
        @JsonProperty("recipientStateOrProvince")
        private String recipientStateOrProvince;

        /**
         * 收件人国家
         * C
         * 收件人国家
         */
        @JsonProperty("recipientCountry")
        private String recipientCountry;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUserCreateDate() {
            return userCreateDate;
        }

        public void setUserCreateDate(String userCreateDate) {
            this.userCreateDate = userCreateDate;
        }

        public String getRecipientStreet() {
            return recipientStreet;
        }

        public void setRecipientStreet(String recipientStreet) {
            this.recipientStreet = recipientStreet;
        }

        public String getRecipientCity() {
            return recipientCity;
        }

        public void setRecipientCity(String recipientCity) {
            this.recipientCity = recipientCity;
        }

        public String getRecipientStateOrProvince() {
            return recipientStateOrProvince;
        }

        public void setRecipientStateOrProvince(String recipientStateOrProvince) {
            this.recipientStateOrProvince = recipientStateOrProvince;
        }

        public String getRecipientCountry() {
            return recipientCountry;
        }

        public void setRecipientCountry(String recipientCountry) {
            this.recipientCountry = recipientCountry;
        }
    }

    public static class UnFqInfo {

        /**
         * 是否强制
         * C
         * 01：强制
         */
        @JsonProperty("isForce")
        private String isForce;

        /**
         * 分期期数
         * C
         */
        @JsonProperty("unFqNum")
        private String unFqNum;

        /**
         * 分期费率
         * C
         */
        @JsonProperty("unFqSellerPercent")
        private String unFqSellerPercent;

        public String getIsForce() {
            return isForce;
        }

        public void setIsForce(String isForce) {
            this.isForce = isForce;
        }

        public String getUnFqNum() {
            return unFqNum;
        }

        public void setUnFqNum(String unFqNum) {
            this.unFqNum = unFqNum;
        }

        public String getUnFqSellerPercent() {
            return unFqSellerPercent;
        }

        public void setUnFqSellerPercent(String unFqSellerPercent) {
            this.unFqSellerPercent = unFqSellerPercent;
        }
    }

    public static class KlFqSceneInfo {

        /**
         * 银联聚分期
         * C
         * json字符串结构体
         *
         * @see UnFqInfo
         */
        @JsonProperty("UNFQ")
        private String unfq;

        /**
         * 花呗分期
         * C
         * json字符串结构体
         *
         * @see HbFqSceneInfo
         */
        @JsonProperty("HBFQ")
        private String hbfq;

        public String getUnfq() {
            return unfq;
        }

        public void setUnfq(String unfq) {
            this.unfq = unfq;
        }

        public String getHbfq() {
            return hbfq;
        }

        public void setHbfq(String hbfq) {
            this.hbfq = hbfq;
        }
    }

    public static class OnlineWildcardEncryptedField {
        /**
         * 账单地址
         * C
         * 账单地址（json字符串结构体）
         *
         * @see V3CcssOrderSceneOnlineWildcardBillAddress
         */
        @JsonProperty("billingAddress")
        private String billingAddress;

        /**
         * 注册手机号
         * C
         * 用户注册手机号
         */
        @JsonProperty("mobilePhone")
        private String mobilePhone;

        /**
         * 注册邮箱
         * C
         * 注册邮箱
         */
        @JsonProperty("email")
        private String email;

        /**
         * 收件人名
         * C
         * 收件人名
         */
        @JsonProperty("recipientFirstName")
        private String recipientFirstName;

        /**
         * 收件人姓
         * C
         * 收件人姓
         */
        @JsonProperty("recipientLastName")
        private String recipientLastName;

        public String getBillingAddress() {
            return billingAddress;
        }

        public void setBillingAddress(String billingAddress) {
            this.billingAddress = billingAddress;
        }

        public String getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getRecipientFirstName() {
            return recipientFirstName;
        }

        public void setRecipientFirstName(String recipientFirstName) {
            this.recipientFirstName = recipientFirstName;
        }

        public String getRecipientLastName() {
            return recipientLastName;
        }

        public void setRecipientLastName(String recipientLastName) {
            this.recipientLastName = recipientLastName;
        }
    }

    public static class KlFqEncryptedField {
        /**
         * 银联聚分期
         * C
         * json字符串结构体
         *
         * @see V3CcssOrderSceneKlFqUnFqInfo
         */
        @JsonProperty("UNFQ")
        private String unfq;

        public String getUnfq() {
            return unfq;
        }

        public void setUnfq(String unfq) {
            this.unfq = unfq;
        }
    }
}
