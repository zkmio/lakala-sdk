package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2024/1/16 14:34
 * @description 账管家V2.0-解绑银行卡
 */
public class V2LaepIndustryBankcardUnbindRequest extends V2CommRequest {

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
     * 虚拟银行卡号
     * M
     */
    @JsonProperty("bankId")
    private String bankId;

    /**
     *
     */
    @JsonProperty("remark")
    private String remark;

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

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_LAEP_INDUSTRY_BANKCARD_UNBIND;
    }
}
