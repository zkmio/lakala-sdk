package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2024/3/25 10:46
 * @description 实时代收
 */
public class V3IpsdkTransRealTimeCollectionRequest extends V3CommRequest {

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
     * 交易请求时间
     * M
     */
    @JsonProperty("txn_time")
    private String txnTime;

    /**
     * 交易币种
     * C
     * 默认为 156 人民币
     */
    @JsonProperty("currency_code")
    private String currencyCode;

    /**
     * 交易金额
     * M
     * 单位分，整数型字符
     */
    @JsonProperty("txn_amt")
    private String txnAmt;

    /**
     * 拉卡拉协议号
     * M
     */
    @JsonProperty("sgn_no")
    private String sgnNo;

    /**
     * 代收款项
     * M
     * 代收款项 说明01 移动电话02 固定电话03 水费04 电费05 煤气费06 社保07 小灵通08 信用卡还款09 烟草10 信用卡中心11 有线和付费电视12 非投资型保险
     * 13 政府服务税费14 基金理财15 银行账户充值16 金融机构贷款还款17 网络服务费18 资金归集19 教育费20 物业管理费21 公益捐款22 供暖23 废弃物处理费
     * 24 交通出行25 租金26 会员费27 小贷还款28 投资型保险CS 财税库银RZ 商户实时入账OT 其他
     */
    @JsonProperty("bill_type")
    private String billType;

    /**
     * 用户号码
     * M
     */
    @JsonProperty("bill_no")
    private String billNo;

    /**
     * 产品类型
     * M
     * 依据实际业务场景填写(目前仅使用后 4位，签名 2 位默认为 00)默认取值：000000
     * 具体取值范围：000201 B2C 网关支付000301 认证支付 2.0000302 评级支付000401 贷记000601 账单支付000801 跨行收单000901 绑定支付001001 订购000202 B2B
     */
    @JsonProperty("biz_type")
    private String bizType;

    /**
     * 后台通知地址
     * M
     * 同步返回成功，代表交易受理成功，交易结果通过此地址通知
     */
    @JsonProperty("notify_url")
    private String notifyUrl;

    /**
     * 订单号
     * C
     * 订单系统流水号
     */
    @JsonProperty("pay_order_no")
    private String payOrderNo;

    /**
     * 结算类型
     * C
     * “0”或者空，常规结算方式；“1”-暂缓结算方式
     */
    @JsonProperty("settle_type")
    private String settleType;

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

    public String getTxnTime() {
        return txnTime;
    }

    public void setTxnTime(String txnTime) {
        this.txnTime = txnTime;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getTxnAmt() {
        return txnAmt;
    }

    public void setTxnAmt(String txnAmt) {
        this.txnAmt = txnAmt;
    }

    public String getSgnNo() {
        return sgnNo;
    }

    public void setSgnNo(String sgnNo) {
        this.sgnNo = sgnNo;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }

    public String getSettleType() {
        return settleType;
    }

    public void setSettleType(String settleType) {
        this.settleType = settleType;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_IPSDK_TRANS_REALTIMECOLLECTION;
    }
}
