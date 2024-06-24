package com.lkl.laop.sdk.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;
import com.lkl.laop.sdk.request.model.V3SacsSeparateRecvDatas;

/**
 * @author nxj
 * @date 2023/7/27 17:34
 * @description 分账指令
 */
public class V3SacsSeparateRequest extends V3CommRequest {

    /**
     * 商户号
     * M
     */
    @JsonProperty("merchant_no")
    private String merchantNo;

    /**
     * 拉卡拉对账单流水号
     * M
     * posp流水号，查清结算用
     */
    @JsonProperty("log_no")
    private String logNo;

    /**
     * 交易日期
     * M
     * posp日期，yyyyMMdd，查清结算用
     */
    @JsonProperty("log_date")
    private String logDate;

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
     * 分账接收数据对象
     */
    @JsonProperty("recv_datas")
    List<V3SacsSeparateRecvDatas> recvDatas;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getLogNo() {
        return logNo;
    }

    public void setLogNo(String logNo) {
        this.logNo = logNo;
    }

    public String getLogDate() {
        return logDate;
    }

    public void setLogDate(String logDate) {
        this.logDate = logDate;
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

    public List<V3SacsSeparateRecvDatas> getRecvDatas() {
        return recvDatas;
    }

    public void setRecvDatas(List<V3SacsSeparateRecvDatas> recvDatas) {
        this.recvDatas = recvDatas;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_SACS_SEPARATE;
    }
}
