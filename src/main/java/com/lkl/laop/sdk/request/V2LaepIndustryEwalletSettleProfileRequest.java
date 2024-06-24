package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2023/12/26 15:28
 * @description 账管家V2.0-账管家提款模式设置
 */
public class V2LaepIndustryEwalletSettleProfileRequest extends V2CommRequest {

    /**
     * BMCP机构号
     * M
     */
    @JsonProperty("bmcpNo")
    private String bmcpNo;

    /**
     * 822商户号 或 receiveNo
     * M
     */
    @JsonProperty("mercId")
    private String mercId;

    /**
     * 提款模式（01主动提款 02余额自动结算 03交易自动结算）
     * M
     */
    @JsonProperty("settleType")
    private String settleType;

    /**
     * 余额自动结算时间（小时）- 默认值：06。如08:00-09:00到账，则传入08。
     * C
     * 针对02余额自动结算生效
     */
    @JsonProperty("settleTime")
    private String settleTime;

    /**
     * 交易自动结算周期（D1/T1）
     * C
     * 针对03交易自动结算生效
     */
    @JsonProperty("settleCircle")
    private String settleCircle;

    /**
     * 结算账户类型（01收款账户 04 分账接收方账户）
     * C
     * 针对02余额自动结算,03交易自动结算生效
     */
    @JsonProperty("payType")
    private String payType;

    /**
     * 提款通知URL
     * C
     * 提款模式02，03生效
     */
    @JsonProperty("notifyUrl")
    private String notifyUrl;

    /**
     * 留存金额(单位：元)
     * C
     * 提款模式02生效
     */
    @JsonProperty("retainedAmt")
    private String retainedAmt;

    public String getBmcpNo() {
        return bmcpNo;
    }

    public void setBmcpNo(String bmcpNo) {
        this.bmcpNo = bmcpNo;
    }

    public String getMercId() {
        return mercId;
    }

    public void setMercId(String mercId) {
        this.mercId = mercId;
    }

    public String getSettleType() {
        return settleType;
    }

    public void setSettleType(String settleType) {
        this.settleType = settleType;
    }

    public String getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(String settleTime) {
        this.settleTime = settleTime;
    }

    public String getSettleCircle() {
        return settleCircle;
    }

    public void setSettleCircle(String settleCircle) {
        this.settleCircle = settleCircle;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getRetainedAmt() {
        return retainedAmt;
    }

    public void setRetainedAmt(String retainedAmt) {
        this.retainedAmt = retainedAmt;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_LAEP_INDUSTRY_EWALLET_SETTLEPROFILE;
    }
}
