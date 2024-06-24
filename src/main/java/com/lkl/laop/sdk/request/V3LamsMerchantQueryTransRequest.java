package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2023/11/23 16:58
 * @description 商户服务接口V3.0-商户计费查询
 */
public class V3LamsMerchantQueryTransRequest extends V3CommRequest {

    /**
     * 商户号
     * M
     */
    @JsonProperty("merchant_no")
    private String merchantNo;

    /**
     * 终端号
     * M
     */
    @JsonProperty("term_no")
    private String termNo;

    /**
     * 流水号
     * M
     */
    @JsonProperty("log_no")
    private String logNo;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getTermNo() {
        return termNo;
    }

    public void setTermNo(String termNo) {
        this.termNo = termNo;
    }

    public String getLogNo() {
        return logNo;
    }

    public void setLogNo(String logNo) {
        this.logNo = logNo;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_LAMS_MERCHANT_QUERY_TRANS;
    }
}
