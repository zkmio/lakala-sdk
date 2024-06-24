package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nxj
 * @date 2023/7/21 14:02
 * @description 银联二维码被扫场景下acc_busi_fields域内容
 */
public class V3LabsTradeMicropayUnionPayBus extends V3LabsTradeAccBusiFieldInfo {

    /**
     * 银联订单信息
     * C
     * 银联二维码单品营销时上送
     */
    @JsonProperty("acq_addn_data_order_info")
    private String acqAddnDataOrderInfo;

    /**
     * 银联商品信息
     * C
     * 银联单品营销商品信息
     */
    @JsonProperty("acq_addn_data_goods_info")
    private String acqAddnDataGoodsInfo;

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
}
