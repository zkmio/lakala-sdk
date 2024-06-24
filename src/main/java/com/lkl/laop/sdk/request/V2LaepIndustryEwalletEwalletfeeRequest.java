package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2024/1/12 14:20
 * @description 账管家V2.0-账管家提款手续费设置
 */
public class V2LaepIndustryEwalletEwalletfeeRequest extends V2CommRequest {

    /**
     * BMCP机构号
     * M
     */
    @JsonProperty("bmcpNo")
    private String bmcpNo;

    /**
     * 822商户号
     * M
     */
    @JsonProperty("mercId")
    private String mercId;

    /**
     * 手续费类型
     * M
     * 01固定金额 02按比例
     */
    @JsonProperty("feeType")
    private String feeType;

    /**
     * 手续费金额
     * M
     * 固定金额时，整数，单位分；按比例时，小数，0.0001
     */
    @JsonProperty("feeAmt")
    private String feeAmt;

    /**
     * 按比例的保底手续费
     * C
     * 手续费类型02生效 单位：分 不能小于100
     */
    @JsonProperty("minFeeAmt")
    private String minFeeAmt;

    /**
     *按比例的封顶手续费
     * C
     * 手续费类型02生效 单位：分
     */
    @JsonProperty("maxFeeAmt")
    private String maxFeeAmt;

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

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(String feeAmt) {
        this.feeAmt = feeAmt;
    }

    public String getMinFeeAmt() {
        return minFeeAmt;
    }

    public void setMinFeeAmt(String minFeeAmt) {
        this.minFeeAmt = minFeeAmt;
    }

    public String getMaxFeeAmt() {
        return maxFeeAmt;
    }

    public void setMaxFeeAmt(String maxFeeAmt) {
        this.maxFeeAmt = maxFeeAmt;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_LAEP_INDUSTRY_EWALLET_EWALLETFEE;
    }
}
