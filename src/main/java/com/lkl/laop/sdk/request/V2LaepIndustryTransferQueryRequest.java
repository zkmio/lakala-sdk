package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2024/1/15 14:20
 * @description 账管家V2.0-转账订单查询
 */
public class V2LaepIndustryTransferQueryRequest extends V2CommRequest {

    /**
     * 转出BMCP机构号
     * M
     */
    @JsonProperty("outBmcpNo")
    private String outBmcpNo;

    /**
     * 转出822商户号
     * M
     */
    @JsonProperty("outMercId")
    private String outMercId;

    /**
     * 商户订单号（二选一）
     * C
     */
    @JsonProperty("merOrderNo")
    private String merOrderNo;

    /**
     * 转账订单号（二选一）
     * C
     */
    @JsonProperty("orderNo")
    private String orderNo;

    public String getOutBmcpNo() {
        return outBmcpNo;
    }

    public void setOutBmcpNo(String outBmcpNo) {
        this.outBmcpNo = outBmcpNo;
    }

    public String getOutMercId() {
        return outMercId;
    }

    public void setOutMercId(String outMercId) {
        this.outMercId = outMercId;
    }

    public String getMerOrderNo() {
        return merOrderNo;
    }

    public void setMerOrderNo(String merOrderNo) {
        this.merOrderNo = merOrderNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_LAEP_INDUSTRY_TRANSFER_QUERY;
    }
}
