package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2024/1/15 16:59
 * @description 收单清结算接口V2-账户信息查询
 */
public class V2MrssQueryQueryAcctInfoRequest extends V2CommRequest {

    /**
     * 查询流水号
     * M
     */
    @JsonProperty("qryNo")
    private String qryNo;

    /**
     * 商户号
     * M
     */
    @JsonProperty("merId")
    private String merId;

    /**
     * 余额查询标识
     * M
     * 1-联机余额
     * 2-数字货币余额（暂不支持）
     * 3-暂缓结算余额（暂不支持）
     * 4-退货账户余额
     * 5-应收款账户余额
     */
    @JsonProperty("balanceFlag")
    private String balanceFlag;

    public String getQryNo() {
        return qryNo;
    }

    public void setQryNo(String qryNo) {
        this.qryNo = qryNo;
    }

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId;
    }

    public String getBalanceFlag() {
        return balanceFlag;
    }

    public void setBalanceFlag(String balanceFlag) {
        this.balanceFlag = balanceFlag;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_MRSSQUERY_QUERYACCTINFO;
    }
}
