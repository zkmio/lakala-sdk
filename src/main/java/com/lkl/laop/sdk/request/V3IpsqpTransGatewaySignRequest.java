package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2024/3/25 10:07
 * @description 网关签约（一键绑卡）
 */
public class V3IpsqpTransGatewaySignRequest extends V3CommRequest {

    /**
     * 商户号
     * M
     * 拉卡拉分配的商户号
     */
    @JsonProperty("merchant_no")
    private String merchantNo;

    /**
     * 商户交易流水号
     * C
     * 商户系统唯一，对应数据库表中外部请求流水号。
     */
    @JsonProperty("out_trade_no")
    private String outTradeNo;

    /**
     * 签约卡号
     * C
     */
    @JsonProperty("pan")
    private String pan;

    /**
     * 户名
     * M
     */
    @JsonProperty("acct_name")
    private String acctName;

    /**
     * 银行编码
     * M
     */
    @JsonProperty("bank_code")
    private String bankCode;

    /**
     * 卡种
     * C
     * 01：个人银行贷记卡
     * 00：个人银行借记卡
     */
    @JsonProperty("card_type")
    private String cardType;

    /**
     * 银行预留手机号码
     * C
     */
    @JsonProperty("bk_mobile")
    private String bkMobile;

    /**
     * 证件类型
     * M
     * 01:身份证号
     */
    @JsonProperty("cert_type")
    private String certType;

    /**
     * 证件号码
     * M
     */
    @JsonProperty("cert_no")
    private String certNo;

    /**
     * CVN2/CVV2/CVC2/CSC2
     * C
     * 信用卡必填
     */
    @JsonProperty("cvn2")
    private String cvn2;

    /**
     * 有效日期
     * C
     * 信用卡必填
     */
    @JsonProperty("va_date")
    private String vaDate;

    /**
     * 协议相关信息
     * C
     */
    @JsonProperty("agreement_info")
    private String agreementInfo;

    /**
     * 网关签约成功回调页面URL
     * M
     * 网关签约成功回调页面
     */
    @JsonProperty("lc_url")
    private String lcUrl;

    /**
     * 签约结果后台通知地址
     * M
     * 签约结果通知url
     */
    @JsonProperty("notify_url")
    private String notifyUrl;

    /**
     * 付款方终端类型
     * M
     * 07 电脑
     * 08 手机
     * 10 平板设备
     * 18 可穿戴设备
     * 19 数字电视
     * 00 其他
     */
    @JsonProperty("pyer_trx_trm_tp")
    private String pyerTrxTrmTp;

    /**
     * 网关支付受理渠道
     * M
     * 01 电脑浏览器
     * 02 手机浏览器
     * 03 手机应用程序
     * 04 柜面
     * 00 其他
     */
    @JsonProperty("gw_chnnl_tp")
    private String gwChnnlTp;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getBkMobile() {
        return bkMobile;
    }

    public void setBkMobile(String bkMobile) {
        this.bkMobile = bkMobile;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getCvn2() {
        return cvn2;
    }

    public void setCvn2(String cvn2) {
        this.cvn2 = cvn2;
    }

    public String getVaDate() {
        return vaDate;
    }

    public void setVaDate(String vaDate) {
        this.vaDate = vaDate;
    }

    public String getAgreementInfo() {
        return agreementInfo;
    }

    public void setAgreementInfo(String agreementInfo) {
        this.agreementInfo = agreementInfo;
    }

    public String getLcUrl() {
        return lcUrl;
    }

    public void setLcUrl(String lcUrl) {
        this.lcUrl = lcUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getPyerTrxTrmTp() {
        return pyerTrxTrmTp;
    }

    public void setPyerTrxTrmTp(String pyerTrxTrmTp) {
        this.pyerTrxTrmTp = pyerTrxTrmTp;
    }

    public String getGwChnnlTp() {
        return gwChnnlTp;
    }

    public void setGwChnnlTp(String gwChnnlTp) {
        this.gwChnnlTp = gwChnnlTp;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_IPSQP_TRANS_GATEWAYSIGN;
    }
}
