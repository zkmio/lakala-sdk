package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;
import com.lkl.laop.sdk.request.model.V3LabsTradeLocationInfo;
import com.lkl.laop.sdk.request.model.V3LabsTransShareCodeBusiFieldInfo;

/**
 * @author nxj
 * @date 2023/11/22 14:59
 * @description 申请分享码（支付宝吱口令）
 */
public class V3LabsTransShareCodeRequest extends V3CommRequest {

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
     * 商户系统唯一
     */
    @JsonProperty("out_trade_no")
    private String outTradeNo;

    /**
     * 钱包类型
     * M
     * 支付宝：ALIPAY
     */
    @JsonProperty("account_type")
    private String accountType;

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
     * 码有效期
     * C
     * 秒为单位,整型
     */
    @JsonProperty("code_valid_period")
    private String codeValidPeriod;

    /**
     * 账户端业务信息域
     * C
     * 参见acc_busi_fields字段详细说明,不同的account_type，需要传入的参数不一样
     */
    @JsonProperty("acc_busi_fields")
    private V3LabsTransShareCodeBusiFieldInfo accBusiFields;

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

    public String getCodeValidPeriod() {
        return codeValidPeriod;
    }

    public void setCodeValidPeriod(String codeValidPeriod) {
        this.codeValidPeriod = codeValidPeriod;
    }

    public V3LabsTransShareCodeBusiFieldInfo getAccBusiFields() {
        return accBusiFields;
    }

    public void setAccBusiFields(V3LabsTransShareCodeBusiFieldInfo accBusiFields) {
        this.accBusiFields = accBusiFields;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_LABS_TRANS_SHARE_CODE;
    }
}
