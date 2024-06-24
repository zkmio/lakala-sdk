package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nxj
 * @date 2023/8/16 15:13
 * @description 收银台订单-商品信息域
 */
public class V3CcssOrderGoodsFieldInfo {

    /**
     * 商品单价
     * M
     * 单位：分
     */
    @JsonProperty("goods_amt")
    private Long goodsAmt;

    /**
     * 商品数量
     * M
     */
    @JsonProperty("goods_num")
    private Integer goodsNum;

    /**
     * 商品计价单位
     * M
     * 1-箱 2-件 3-瓶 4-个
     */
    @JsonProperty("goods_pricing_unit")
    private String goodsPricingUnit;

    /**
     * 商品名称
     * M
     */
    @JsonProperty("goods_name")
    private String goodsName;

    /**
     * 交易电商平台类型
     * M
     * 1-境内平台 2-境外平
     */
    @JsonProperty("te_platform_type")
    private String tePlatformType;

    /**
     * 交易电商平台名称
     * M
     */
    @JsonProperty("te_platform_name")
    private String tePlatformName;

    /**
     * 交易商品类型
     * M
     * 1:服饰箱包
     * 2:食品药品
     * 3:化妆品
     * 4:电子产品
     * 5:日用家居
     * 7:航空机票
     * 8:酒店住宿
     * 9:留学教育
     * 10:旅游票务
     * 11:国际物流
     * 12:国际租车
     * 13:国际会议
     * 14:软件服务
     * 15:医疗服务
     * 16:通讯
     * 17:休闲娱乐
     */
    @JsonProperty("goods_type")
    private String goodsType;

    public Long getGoodsAmt() {
        return goodsAmt;
    }

    public void setGoodsAmt(Long goodsAmt) {
        this.goodsAmt = goodsAmt;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getGoodsPricingUnit() {
        return goodsPricingUnit;
    }

    public void setGoodsPricingUnit(String goodsPricingUnit) {
        this.goodsPricingUnit = goodsPricingUnit;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getTePlatformType() {
        return tePlatformType;
    }

    public void setTePlatformType(String tePlatformType) {
        this.tePlatformType = tePlatformType;
    }

    public String getTePlatformName() {
        return tePlatformName;
    }

    public void setTePlatformName(String tePlatformName) {
        this.tePlatformName = tePlatformName;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }
}
