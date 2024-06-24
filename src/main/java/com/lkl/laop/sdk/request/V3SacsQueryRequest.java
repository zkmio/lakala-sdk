package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2023/7/28 10:12
 * @description 分账结果查询
 */
public class V3SacsQueryRequest extends V3CommRequest {

    /**
     *分账方商户号
     * M
     */
    @JsonProperty("merchant_no")
    private String merchantNo;

    /**
     * 分账指令流水号
     * C
     * 分账核心系统返回的分账流水号，入参中的separate_no,out_separate_no至少二选一，优先级: separate_no> out_separate_no
     */
    @JsonProperty("separate_no")
    private String separateNo;

    /**
     * 商户分账指令流水号
     * C
     * 商户分账指令流水号，入入参中的separate_no,out_separate_no至少二选一，优先级: separate_no> out_separate_no
     */
    @JsonProperty("out_separate_no")
    private String outSeparateNo;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getSeparateNo() {
        return separateNo;
    }

    public void setSeparateNo(String separateNo) {
        this.separateNo = separateNo;
    }

    public String getOutSeparateNo() {
        return outSeparateNo;
    }

    public void setOutSeparateNo(String outSeparateNo) {
        this.outSeparateNo = outSeparateNo;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_SACS_QUERY;
    }

}
