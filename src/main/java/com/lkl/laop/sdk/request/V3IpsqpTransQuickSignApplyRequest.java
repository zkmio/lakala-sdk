package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;
import com.lkl.laop.sdk.request.model.V3IpsCustomerInfo;

/**
 * @author nxj
 * @date 2024/3/22 17:26
 * @description 快捷签约申请(发送短信)
 */
public class V3IpsqpTransQuickSignApplyRequest extends V3CommRequest{

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
     * 卡号
     * M
     */
    @JsonProperty("acc_no")
    private String accNo;

    /**
     * 卡种
     * M
     * 00:借记卡 01:贷记卡
     */
    @JsonProperty("card_type")
    private String cardType;

    /**
     *开户行代码
     * M
     */
    @JsonProperty("iss_ins_code")
    private String issInsCode;

    /**
     * 开户行名称
     * C
     * 支持最多15个汉字
     */
    @JsonProperty("iss_ins_name")
    private String issInsName;

    /**
     * 用户信息
     * M
     * json串
     */
    @JsonProperty("customer_info")
    private V3IpsCustomerInfo customerInfo;

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

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
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

    public V3IpsCustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(V3IpsCustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_IPSQP_TRANS_QUICKSIGNAPPLY;
    }
}
