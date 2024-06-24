package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2024/1/12 15:03
 * @description 账管家V2.0-账管家提款手续费查询
 */
public class V2LaepIndustryEwalletQueryfeeRequest extends V2CommRequest {

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

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_LAEP_INDUSTRY_EWALLET_QUERYFEE;
    }
}
