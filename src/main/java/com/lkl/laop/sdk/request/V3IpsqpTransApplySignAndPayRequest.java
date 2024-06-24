package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;
import com.lkl.laop.sdk.request.model.V3IpsDiscountInfo;
import com.lkl.laop.sdk.request.model.V3IpsRskInfo;
import com.lkl.laop.sdk.request.model.V3IpsSgnInfo;
import com.lkl.laop.sdk.request.model.V3IpsTermInfo;

/**
 * @author nxj
 * @date 2024/3/25 09:45
 * @description 快捷签约并支付申请（没有协议号）
 */
public class V3IpsqpTransApplySignAndPayRequest extends V3CommRequest {

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
     * M
     * 商户系统唯一，对应数据库表中外部请求流水号。
     */
    @JsonProperty("out_trade_no")
    private String outTradeNo;

    /**
     * 交易金额
     * M
     * 单位分，整数型字符
     */
    @JsonProperty("total_amount")
    private String totalAmount;

    /**
     * 订单标题
     * C
     * 标题，用于简单描述订单或商品主题
     */
    @JsonProperty("subject")
    private String subject;

    /**
     * 订单详情
     * C
     */
    @JsonProperty("detail")
    private String detail;

    /**
     * 签约人信息
     * M
     * 格式jsonObject
     */
    @JsonProperty("sgn_inf")
    private V3IpsSgnInfo sgnInf;

    /**
     * 营销信息
     * C
     * 格式jsonObject
     */
    @JsonProperty("discount_inf")
    private V3IpsDiscountInfo discountInf;

    /**
     * 风险监控信息
     * C
     * 格式jsonObject
     */
    @JsonProperty("rsk_inf")
    private V3IpsRskInfo rskInf;

    /**
     * 交易设备信息
     * C
     * 格式jsonObject
     */
    @JsonProperty("term_info")
    private V3IpsTermInfo termInfo;

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

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public V3IpsSgnInfo getSgnInf() {
        return sgnInf;
    }

    public void setSgnInf(V3IpsSgnInfo sgnInf) {
        this.sgnInf = sgnInf;
    }

    public V3IpsDiscountInfo getDiscountInf() {
        return discountInf;
    }

    public void setDiscountInf(V3IpsDiscountInfo discountInf) {
        this.discountInf = discountInf;
    }

    public V3IpsRskInfo getRskInf() {
        return rskInf;
    }

    public void setRskInf(V3IpsRskInfo rskInf) {
        this.rskInf = rskInf;
    }

    public V3IpsTermInfo getTermInfo() {
        return termInfo;
    }

    public void setTermInfo(V3IpsTermInfo termInfo) {
        this.termInfo = termInfo;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_IPSQP_TRANS_APPLYSIGNANDPAY;
    }
}
