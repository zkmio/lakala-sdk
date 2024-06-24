package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2023/7/28 09:57
 * @description 可分账金额查询
 */
public class V3SacsQueryAmtRequest extends V3CommRequest {

    /**
     * 商户号
     * M
     */
    @JsonProperty("merchant_no")
    private String merchantNo;

    /**
     * 拉卡拉对账单流水号
     * M
     * posp流水号，查清结算用
     */
    @JsonProperty("log_no")
    private String logNo;

    /**
     * 拉卡拉对账单交易日期
     * M
     * posp日期，yyyyMMdd，查清结算用
     */
    @JsonProperty("log_date")
    private String logDate;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getLogNo() {
        return logNo;
    }

    public void setLogNo(String logNo) {
        this.logNo = logNo;
    }

    public String getLogDate() {
        return logDate;
    }

    public void setLogDate(String logDate) {
        this.logDate = logDate;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_SACS_QUERYAMT;
    }
}
