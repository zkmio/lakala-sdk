package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nxj
 * @date 2024/3/22 17:55
 * @description v3签约支付接口-营销信息域
 */
public class V3IpsDiscountInfo {
    /**
     * 参与营销活动标识
     * C
     * 0：不参与营销活动
     * 1：参与营销活动
     */
    @JsonProperty("discount_use")
    private Integer discountUse;

    /**
     * 营销活动编号
     * C
     * 仅限数字
     */
    @JsonProperty("discount_id")
    private String discountId;

    /**
     * 营销折扣金额
     * C
     * 单位分
     */
    @JsonProperty("discount_amt")
    private String discountAmt;

    public Integer getDiscountUse() {
        return discountUse;
    }

    public void setDiscountUse(Integer discountUse) {
        this.discountUse = discountUse;
    }

    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }

    public String getDiscountAmt() {
        return discountAmt;
    }

    public void setDiscountAmt(String discountAmt) {
        this.discountAmt = discountAmt;
    }
}
