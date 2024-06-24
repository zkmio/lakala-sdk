package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;
import com.lkl.laop.sdk.request.model.V3LabsTradeAccBusiFieldInfo;
import com.lkl.laop.sdk.request.model.V3LabsTradeLocationInfo;
import com.lkl.laop.sdk.request.model.V3TransIdentityInfo;

/**
 * @author nxj
 * @date 2023/7/19 15:51
 * @description V3主扫交易
 */
public class V3LabsTransPreorderRequest extends V3CommRequest {

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
     * 拉卡拉分配的业务终端号
     */
    @JsonProperty("term_no")
    private String termNo;

    /**
     * 商户交易流水号
     * M
     * 商户系统唯一，对应数据库表中外部请求流水号
     */
    @JsonProperty("out_trade_no")
    private String outTradeNo;

    /**
     * 钱包类型
     * M
     * 微信：WECHAT
     * 支付宝：ALIPAY
     * 银联：UQRCODEPAY
     * 翼支付: BESTPAY
     * 苏宁易付宝: SUNING
     * 拉卡拉支付账户：LKLACC
     * 网联小钱包：NUCSPAY
     */
    @JsonProperty("account_type")
    private String accountType;

    /**
     * 接入方式
     * M
     * 41:NATIVE（（ALIPAY，云闪付支持）
     * 51:JSAPI（微信公众号支付，支付宝服务窗支付，银联JS支付，翼支付JS支付、拉卡拉钱包支付）
     * 71:微信小程序支付
     */
    @JsonProperty("trans_type")
    private String transType;

    /**
     * 金额
     * M
     * 单位分，整数型字符
     */
    @JsonProperty("total_amount")
    private String totalAmount;

    /**
     * 地址位置信息
     * M
     * 地址位置信息，风控要求必送
     */
    @JsonProperty("location_info")
    private V3LabsTradeLocationInfo locationInfo;

    /**
     * 业务模式
     * C
     * 业务模式： ACQ-收单 不填，默认为“ACQ-收单”
     */
    @JsonProperty("busi_mode")
    private String busiMode;

    /**
     * 订单标题
     * C
     * 标题，用于简单描述订单或商品主题，会传递给账户端 （账户端控制，实际最多42个字符），微信支付必送。
     */
    @JsonProperty("subject")
    private String subject;

    /**
     * 支付业务订单号
     * C
     * 拉卡拉订单系统订单号，以拉卡拉支付业务订单号为驱动的支付行为，需上传该字段。
     */
    @JsonProperty("pay_order_no")
    private String payOrderNo;

    /**
     * 商户通知地址
     * C
     * 商户通知地址，如果上传，且 pay_order_no 不存在情况下，则按此地址通知商户(详见“[交易通知]”接口)
     */
    @JsonProperty("notify_url")
    private String notifyUrl;

    /**
     * 结算类型
     * C
     * “0”或者空，常规结算方式，如需接拉卡拉分账需传“1”；
     */
    @JsonProperty("settle_type")
    private String settleType;

    /**
     * 备注
     * C
     */
    @JsonProperty("remark")
    private String remark;

    /**
     * 身份信息
     * C
     * 若上送此字段请选择选报文加密形式
     * 实名支付信息，json字符串，如{“identityNo”:”32000000000000000X”,”name”:”张三”}
     * @see V3TransIdentityInfo
     */
    @JsonProperty("identity_info")
    private String identityInfo;

    /**
     * 优惠信息
     * C
     * 优惠相关信息，JSON格式
     */
    @JsonProperty("promo_info")
    private String promoInfo;

    /**
     * 账户端业务信息域
     * C
     * 参见以下acc_busi_fields字段详细说明,不同的account_type和trans_type，需要传入的参数不一样
     */
    @JsonProperty("acc_busi_fields")
    private V3LabsTradeAccBusiFieldInfo accBusiFields;

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

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public V3LabsTradeLocationInfo getLocationInfo() {
        return locationInfo;
    }

    public void setLocationInfo(V3LabsTradeLocationInfo locationInfo) {
        this.locationInfo = locationInfo;
    }

    public String getBusiMode() {
        return busiMode;
    }

    public void setBusiMode(String busiMode) {
        this.busiMode = busiMode;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getSettleType() {
        return settleType;
    }

    public void setSettleType(String settleType) {
        this.settleType = settleType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIdentityInfo() {
        return identityInfo;
    }

    public void setIdentityInfo(String identityInfo) {
        this.identityInfo = identityInfo;
    }

    public String getPromoInfo() {
        return promoInfo;
    }

    public void setPromoInfo(String promoInfo) {
        this.promoInfo = promoInfo;
    }

    public V3LabsTradeAccBusiFieldInfo getAccBusiFields() {
        return accBusiFields;
    }

    public void setAccBusiFields(V3LabsTradeAccBusiFieldInfo accBusiFields) {
        this.accBusiFields = accBusiFields;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_LABS_TRANS_PREORDER;
    }
}
