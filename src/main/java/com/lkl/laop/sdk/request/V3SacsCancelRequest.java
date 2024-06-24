package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2023/8/16 17:25
 * @description 订单分账撤销
 */
public class V3SacsCancelRequest extends V3CommRequest{

    /**
     * 分账方商户号
     * M
     */
    @JsonProperty("merchant_no")
    private String merchantNo;

    /**
     * 原分账指令流水
     * C
     * 分账指令接口返回的分账流水，origin_out_separate_no和该字段至少二选一，
     * 优先级: origin_separate_no> origin_out_separate_no
     */
    @JsonProperty("origin_separate_no")
    private String originSeparateNo;

    /**
     * 原商户分账指令流水号
     * C
     * 分账指令请求时，入参中的origin_separate_no该字段至少二选一，
     * 优先级: origin_separate_no> origin_out_separate_no
     */
    @JsonProperty("origin_out_separate_no")
    private String originOutSeparateNo;

    /**
     * 商户分账指令流水号
     * M
     */
    @JsonProperty("out_separate_no")
    private String outSeparateNo;

    /**
     * 撤销金额
     * M
     * 用于金额校验，与原分账金额一致，否则校验失败
     */
    @JsonProperty("total_amt")
    private String totalAmt;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOriginSeparateNo() {
        return originSeparateNo;
    }

    public void setOriginSeparateNo(String originSeparateNo) {
        this.originSeparateNo = originSeparateNo;
    }

    public String getOriginOutSeparateNo() {
        return originOutSeparateNo;
    }

    public void setOriginOutSeparateNo(String originOutSeparateNo) {
        this.originOutSeparateNo = originOutSeparateNo;
    }

    public String getOutSeparateNo() {
        return outSeparateNo;
    }

    public void setOutSeparateNo(String outSeparateNo) {
        this.outSeparateNo = outSeparateNo;
    }

    public String getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(String totalAmt) {
        this.totalAmt = totalAmt;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_SACS_CANCEL;
    }
}
