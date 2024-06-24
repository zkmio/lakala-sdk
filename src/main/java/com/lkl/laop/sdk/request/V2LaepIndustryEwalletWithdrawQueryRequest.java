package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2023/12/26 11:03
 * @description 账管家V2.0-账管家提现结果查询
 */
public class V2LaepIndustryEwalletWithdrawQueryRequest extends V2CommRequest {

    /**
     * bmcp机构号
     * M
     */
    @JsonProperty("orgNo")
    private String orgNo;

    /**
     * 商户号 或 receiveNo
     * M
     */
    @JsonProperty("merchantNo")
    private String merchantNo;

    /**
     * 提款流水号（二选一）
     * C
     */
    @JsonProperty("drawJnl")
    private String drawJnl;

    /**
     * 商户订单号（二选一）
     * C
     */
    @JsonProperty("merOrderNo")
    private String merOrderNo;

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getDrawJnl() {
        return drawJnl;
    }

    public void setDrawJnl(String drawJnl) {
        this.drawJnl = drawJnl;
    }

    public String getMerOrderNo() {
        return merOrderNo;
    }

    public void setMerOrderNo(String merOrderNo) {
        this.merOrderNo = merOrderNo;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_LAEP_INDUSTRY_EWALLETWITHDRAWQUERY;
    }
}
