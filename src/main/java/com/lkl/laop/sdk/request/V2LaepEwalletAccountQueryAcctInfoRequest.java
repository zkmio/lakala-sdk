package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2024/1/15 16:45
 * @description 账管家V2.0-收单账户信息查询
 */
public class V2LaepEwalletAccountQueryAcctInfoRequest extends V2CommRequest{

    /**
     * bmcpNo机构号
     * M
     */
    @JsonProperty("bmcpNo")
    private String bmcpNo;

    /**
     * 商户号
     * M
     */
    @JsonProperty("mercId")
    private String mercId;

    /**
     * 余额查询标识
     * M
     * 4-退货账户余额
     * 5-应收款账户余额
     */
    @JsonProperty("balanceFlag")
    private String balanceFlag;

    /**
     * 备注信息
     * C
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

    public String getBalanceFlag() {
        return balanceFlag;
    }

    public void setBalanceFlag(String balanceFlag) {
        this.balanceFlag = balanceFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_LAEP_EWALLETACCOUNT_QUERYACCTINFO;
    }
}
