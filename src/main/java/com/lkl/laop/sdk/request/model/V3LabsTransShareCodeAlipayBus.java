package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nxj
 * @date 2023/11/22 15:10
 * @description 申领分享码接口-支付宝业务信息域
 */
public class V3LabsTransShareCodeAlipayBus extends V3LabsTransShareCodeBusiFieldInfo{

    /**
     * 业务来源
     * M
     */
    @JsonProperty("source")
    private String source;

    /**
     * 跳转业务链接
     * M
     * 支付页面url
     */
    @JsonProperty("biz_link")
    private String bizLink;

    /**
     * 卖家支付宝ID
     * C
     */
    @JsonProperty("seller_id")
    private String sellerId;

    /**
     * 业务来源
     * C
     */
    @JsonProperty("ext_info")
    private ExtInfo extInfo;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getBizLink() {
        return bizLink;
    }

    public void setBizLink(String bizLink) {
        this.bizLink = bizLink;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public ExtInfo getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(ExtInfo extInfo) {
        this.extInfo = extInfo;
    }

    public static class ExtInfo {

        /**
         * 花呗分期期数
         * C
         * 支付宝花呗分期必送字段: 花呗分期数 3：3期 6：6期 12：12期
         */
        @JsonProperty("fq_number")
        private String fq_number;

        /**
         * 卖家承担手续费比例
         * M
         * 支付宝花呗分期必送字段: 卖家承担收费比例，商家承担手续费传入100，
         * 用户承担手续费传入0，仅支持传入100、0两种，其他比例暂不支持
         * 100：代表商家贴息 0：代表用户承担手续费
         */
        @JsonProperty("fq_seller_percent")
        private String fqSellerPercent;

        public String getFq_number() {
            return fq_number;
        }

        public void setFq_number(String fq_number) {
            this.fq_number = fq_number;
        }

        public String getFqSellerPercent() {
            return fqSellerPercent;
        }

        public void setFqSellerPercent(String fqSellerPercent) {
            this.fqSellerPercent = fqSellerPercent;
        }
    }
}
