package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nxj
 * @date 2023/7/27 17:41
 * @description V3分账接口分账接收数据对象
 */
public class V3SacsSeparateRecvDatas {

    /**
     * 接收方商户号
     * C
     * 分账接收方商户号，分给自己时使用，需和merchantNo一样，否则检查报错；分账接收方商户号 和 分账接收方 只能填写一个。
     */
    @JsonProperty("recv_merchant_no")
    private String recvMerchantNo;

    /**
     * 分账接收方编号
     * C
     * 分账接收方编号, 分给他人时使用；分账接收方商户号 和 分账接收方 只能填写一个。
     */
    @JsonProperty("recv_no")
    private String recvNo;

    /**
     * 分账数值
     * M
     * calType为0时，按照固定金额分账，单位：分 calType为1时，按照比例分账，单位：百分比的小数值，比如0.55 （55%）
     */
    @JsonProperty("separate_value")
    private String separateValue;

    public String getRecvMerchantNo() {
        return recvMerchantNo;
    }

    public void setRecvMerchantNo(String recvMerchantNo) {
        this.recvMerchantNo = recvMerchantNo;
    }

    public String getRecvNo() {
        return recvNo;
    }

    public void setRecvNo(String recvNo) {
        this.recvNo = recvNo;
    }

    public String getSeparateValue() {
        return separateValue;
    }

    public void setSeparateValue(String separateValue) {
        this.separateValue = separateValue;
    }
}
