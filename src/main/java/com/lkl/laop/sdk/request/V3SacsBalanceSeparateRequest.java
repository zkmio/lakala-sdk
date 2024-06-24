package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

import java.util.List;

/**
 * @author nxj
 * @date 2023/8/17 11:22
 * @description 余额分账
 */
public class V3SacsBalanceSeparateRequest extends V3CommRequest {

    /**
     * 商户号
     * M
     */
    @JsonProperty("merchant_no")
    private String merchantNo;

    /**
     * 商户分账指令流水号
     * M
     * 商户分账指令流水号，每个商户号下唯一，否则会校验失败
     */
    @JsonProperty("out_separate_no")
    private String outSeparateNo;

    /**
     * 分账总金额
     * M
     * 单位：分
     */
    @JsonProperty("total_amt")
    private String totalAmt;

    /**
     * 拉卡拉机构编号
     * C
     */
    @JsonProperty("lkl_org_no")
    private String lklOrgNo;

    /**
     * 分账计算类型
     * C
     * 0- 按照指定金额，1- 按照指定比例。默认 0
     */
    @JsonProperty("cal_type")
    private String calType;

    /**
     * 回调地址
     * C
     * 分账，或者分账撤销时，是异步接口。通过该地址通知商户最终处理结果。不传时，不回调
     */
    @JsonProperty("notify_url")
    private String notifyUrl;

    /**
     * 分账接收数据对象
     * C
     * 分账接收方编号必须已创建
     */
    @JsonProperty("recv_datas")
    private List<RecvData> recvDatas;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOutSeparateNo() {
        return outSeparateNo;
    }

    public void setOutSeparateNo(String outSeparateNo) {
        this.outSeparateNo = outSeparateNo;
    }

    public String getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(String totalAmt) {
        this.totalAmt = totalAmt;
    }

    public String getLklOrgNo() {
        return lklOrgNo;
    }

    public void setLklOrgNo(String lklOrgNo) {
        this.lklOrgNo = lklOrgNo;
    }

    public String getCalType() {
        return calType;
    }

    public void setCalType(String calType) {
        this.calType = calType;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public List<RecvData> getRecvDatas() {
        return recvDatas;
    }

    public void setRecvDatas(List<RecvData> recvDatas) {
        this.recvDatas = recvDatas;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_SACS_BALANCESEPARATE;
    }


    public static class RecvData {

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
}
