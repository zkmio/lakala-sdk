package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2024/5/16 15:14
 * @description 终端交易权限查询
 */
public class V2McqsBusiQueryTermTranTypeRequest extends V2CommRequest{

    /**
     * 银联商户号
     * M
     */
    @JsonProperty("merCupNo")
    private String merCupNo;

    /**
     * 终端号
     * M
     */
    @JsonProperty("termNo")
    private String termNo;

    /**
     * 请求流水
     * M
     * 建议：14位年月日时（24小时制）分秒+8位的随机数（同一机构不重复）
     */
    @JsonProperty("orderNo")
    private String orderNo;

    public String getMerCupNo() {
        return merCupNo;
    }

    public void setMerCupNo(String merCupNo) {
        this.merCupNo = merCupNo;
    }

    public String getTermNo() {
        return termNo;
    }

    public void setTermNo(String termNo) {
        this.termNo = termNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_MCQS_BUSI_QUERYTERMTRANTYPE;
    }
}
