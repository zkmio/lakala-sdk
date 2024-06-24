package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2024/1/16 14:59
 * @description 账管家V2.0-生成电子回单
 */
public class V2LaepCreateEleReceiptRequest extends V2CommRequest {

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
     * 账户流水号
     * M
     * 对应billSq字段
     */
    @JsonProperty("acctSysSq")
    private String acctSysSq;

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

    public String getAcctSysSq() {
        return acctSysSq;
    }

    public void setAcctSysSq(String acctSysSq) {
        this.acctSysSq = acctSysSq;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_LAEP_CREATEELERECEIPT;
    }
}
