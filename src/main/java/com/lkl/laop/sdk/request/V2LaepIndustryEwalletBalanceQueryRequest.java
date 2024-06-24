package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2024/1/15 16:34
 * @description 账管家V2.0-账管家余额查询
 */
public class V2LaepIndustryEwalletBalanceQueryRequest extends V2CommRequest {

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
     * 账号
     * C
     * 若该参数上送，则payType将无效
     */
    @JsonProperty("payNo")
    private String payNo;

    /**
     * 账号类型
     * C
     * 01：收款账户，02：付款账户，03：分账商户账户，04：分账接收方账户，05：充值代付账户，06：结算代付账户
     * - 未上送则默认为01
     */
    @JsonProperty("payType")
    private String payType;

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

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_LAEP_INDUSTRY_EWALLETBALANCEQUERY;
    }
}
