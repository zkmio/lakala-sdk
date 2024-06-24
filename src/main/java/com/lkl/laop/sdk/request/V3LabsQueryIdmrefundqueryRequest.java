package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2023/8/15 15:16
 * @description 商户订单退款查询
 */
public class V3LabsQueryIdmrefundqueryRequest extends V3CommRequest {

    /**
     * 拉卡拉分配的银联商户号
     * M
     */
    @JsonProperty("merchant_no")
    private String merchantNo;

    /**
     * 拉卡拉分配的商户号
     * M
     */
    @JsonProperty("term_no")
    private String termNo;

    /**
     * 商户退款订单号
     * M
     */
    @JsonProperty("out_refund_order_no")
    private String outRefundOrderNo;

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

    public String getOutRefundOrderNo() {
        return outRefundOrderNo;
    }

    public void setOutRefundOrderNo(String outRefundOrderNo) {
        this.outRefundOrderNo = outRefundOrderNo;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_LABS_QUERY_IDMREFUNDQUERY;
    }

}
