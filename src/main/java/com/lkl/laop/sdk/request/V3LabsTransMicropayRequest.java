package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;
import com.lkl.laop.sdk.request.model.V3LabsTradeAccBusiFieldInfo;
import com.lkl.laop.sdk.request.model.V3LabsTradeLocationInfo;
import com.lkl.laop.sdk.request.model.V3TransIdentityInfo;

/**
 * @author nxj
 * @date 2023/7/20 18:03
 * @description V3被扫交易
 */
public class V3LabsTransMicropayRequest extends V3CommRequest {

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
     * 商户系统唯一，不可重复
     */
    @JsonProperty("out_trade_no")
    private String outTradeNo;


    /**
     * 支付授权码
     * M
     * 扫码支付授权码，设备读取用户APP中的条码或者二维码信息，用户付款码条形码规则见说明
     * 微信	WECHAT	付款码10 11 12 13 14 15开头
     * 支付宝	ALIPAY	付款码25 26 27 28 29 30开头
     * 银联	UQRCODEPAY	付款码62开头
     * 数币人民币	DCPAY	付款码01开头
     * 翼支付	BESTPAY	付款码51开头
     * 苏宁	SUNING	付款码83开头
     */
    @JsonProperty("auth_code")
    private String authCode;

    /**
     *金额
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
     * 订单交易下单，交易时上送订单系统订单号，交易流程中会校验有效性、判重
     */
    @JsonProperty("pay_order_no")
    private String payOrderNo;

    /**
     * 商户通知地址
     * C
     * 商户通知地址，如上传，且 pay_order_no 不存在情况下，且支付响应报文是交易中状态的场景下，则按此地址通知商户
     */
    @JsonProperty("notify_url")
    private String notifyUrl;

    /**
     * 结算类型
     * C
     * “0”或者空，常规结算方式；
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
     * 扫码类型
     * C
     * 0或不填：扫码支付 1：支付宝刷脸支付；2: 微信刷脸支付
     */
    @JsonProperty("scan_type")
    private String scanType;

    /**
     * 身份信息
     * C
     * 实名支付信息，json字符串，如{“identityNo”:”32000000000000000X”,”name”:”张三”}
     * @see V3TransIdentityInfo
     */
    @JsonProperty("identity_info")
    private String identityInfo;

    /**
     * 优惠信息
     * C
     * 拉卡拉优惠相关信息，JSON格式。暂不支持
     */
    @JsonProperty("promo_info")
    private String promoInfo;

    /**
     * 账户端业务信息域
     * C
     * 参见以下acc_busi_fields字段详细说明,不同类型的auth_code对应不同的账户端，需要填写不同的信息
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

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
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

    public String getScanType() {
        return scanType;
    }

    public void setScanType(String scanType) {
        this.scanType = scanType;
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
        return FunctionCodeEnum.API_V3_LABS_TRANS_MICROPAY;
    }

}
