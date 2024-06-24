package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2024/3/25 10:05
 * @description 代收查询
 */
public class V3IpsqpQueryTradeQueryRequest extends V3CommRequest {

    /**
     * 商户号
     * M
     * 拉卡拉分配的商户号
     */
    @JsonProperty("merchant_no")
    private String merchantNo;

    /**
     * 终端号
     * M
     * 拉卡拉分配的终端号
     */
    @JsonProperty("term_no")
    private String termNo;

    /**
     * 商户交易流水号
     * C
     * 下单时的商户请求流水号 说明：out_trade_no、trade_no、必有其一。如果存在多个字段上送，优先级顺序如下： trade_no、 out_trade_no
     */
    @JsonProperty("out_trade_no")
    private String outTradeNo;

    /**
     * 拉卡拉系统交易流水号
     * C
     */
    @JsonProperty("trade_no")
    private String tradeNo;

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

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_IPSQP_QUERY_TRADEQUERY;
    }
}
