package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2024/3/25 10:25
 * @description 代收签约申请(发送短信)
 */
public class V3IpsdkTransCollectionSignApplyRequest extends V3CommRequest {

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
     * 卡号
     * M
     */
    @JsonProperty("acc_no")
    private String accNo;

    /**
     * 账号类型
     * M
     * 01:银行卡 02:存折
     */
    @JsonProperty("acc_type")
    private String accType;

    /**
     * 开户行代码
     * M
     */
    @JsonProperty("iss_ins_code")
    private String issInsCode;

    /**
     * 开户行名称
     * M
     * 支持最多15个汉字
     */
    @JsonProperty("iss_ins_name")
    private String issInsName;

    /**
     * 代收款项
     * M
     * 代收款项 说明
     */
    @JsonProperty("bill_type")
    private String billType;

    /**
     * 用户号码
     * M
     * 用户号码 ,支持字母数字，不能使用特殊字符：”-“,”/“等
     */
    @JsonProperty("bill_no")
    private String billNo;

    /**
     * 产品类型
     * M
     * 依据实际业务场景填写(目前仅使用后 4位，签名 2 位默认为 00)默认取值：000000
     */
    @JsonProperty("biz_type")
    private String bizType;

    /**
     * 委托关系期限
     * M
     * 必送；单位为月份，000 表示长期有效；委托关系限期最多为 999
     */
    @JsonProperty("valid_month")
    private String validMonth;

    /**
     * 代收频率
     * M
     * 商户和持卡人约定的单位时间内发起代收交易的最大次数（指成功交易次数）。
     * 使用扣款时间单位（2 字节）+扣款次数（4 字节）表示扣款时间单位（2 字节）
     * * 00：不限制代收频率* 01：年* 02：季* 03：月* 04：周* 05：日 其他取值：保留使用扣款次数（4 字节）表示扣款时间单位内允许的最大扣款次数。
     * 当扣款时间单位为 00（不限制代收频率）时，表示不限制扣款次数，发卡方可忽略扣款次数，受理方可填 充 默 认 值0000
     * * 例如：每月最多可扣款 10 次，则时间单位为 03（月），扣款次数为 0010，代收频率取值为030010
     */
    @JsonProperty("frequency")
    private String frequency;

    /**
     * 最大限额
     * C
     * 单位分
     */
    @JsonProperty("max_limit")
    private String maxLimit;

    /**
     * 最小限额
     * C
     * 单位分
     */
    @JsonProperty("min_limit")
    private String minLimit;

    /**
     * 手机号
     * M
     */
    @JsonProperty("phone_no")
    private String phoneNo;

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

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getIssInsCode() {
        return issInsCode;
    }

    public void setIssInsCode(String issInsCode) {
        this.issInsCode = issInsCode;
    }

    public String getIssInsName() {
        return issInsName;
    }

    public void setIssInsName(String issInsName) {
        this.issInsName = issInsName;
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

    public String getValidMonth() {
        return validMonth;
    }

    public void setValidMonth(String validMonth) {
        this.validMonth = validMonth;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(String maxLimit) {
        this.maxLimit = maxLimit;
    }

    public String getMinLimit() {
        return minLimit;
    }

    public void setMinLimit(String minLimit) {
        this.minLimit = minLimit;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_IPSDK_TRANS_COLLECTIONSIGNAPPLY;
    }
}
