package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2024/1/16 10:03
 * @description 账管家V2.0-绑定银行卡
 */
public class V2LaepIndustryBankcardBindRequest extends V2CommRequest {

    /**
     * BMCP机构号
     * M
     */
    @JsonProperty("bmcpNo")
    private String bmcpNo;

    /**
     * 822商户号 或 receiveNo
     * M
     */
    @JsonProperty("mercId")
    private String mercId;

    /**
     * 银行号
     * M
     * 可根据结算卡信息进行查询，（仅支持对私结算卡查询）
     */
    @JsonProperty("bankNo")
    private String bankNo;

    /**
     * 银行名称
     * M
     */
    @JsonProperty("bankName")
    private String bankName;

    /**
     * 清算行号
     * M
     * 可根据结算卡信息进行查询，（仅支持对私结算卡查询）
     */
    @JsonProperty("clearingBankCode")
    private String clearingBankCode;

    /**
     * 银行卡号
     * M
     */
    @JsonProperty("bankcardNo")
    private String bankcardNo;

    /**
     * 卡类型
     * M
     * 1对公 2对私
     */
    @JsonProperty("type")
    private String type;

    /**
     * 是否为默认银行卡
     * C
     * 0:否 1:是
     */
    @JsonProperty("defaultFlag")
    private String defaultFlag;

    /**
     * 开户城市
     * C
     */
    @JsonProperty("acctCity")
    private String acctCity;

    /**
     * 开户支行
     * C
     */
    @JsonProperty("acctBank")
    private String acctBank;

    /**
     * 有效期
     * C
     */
    @JsonProperty("validate")
    private String validate;

    /**
     * 备注信息
     * C
     */
    @JsonProperty("remark")
    private String remark;

    public String getBmcpNo() {
        return bmcpNo;
    }

    public void setBmcpNo(String bmcpNo) {
        this.bmcpNo = bmcpNo;
    }

    public String getMercId() {
        return mercId;
    }

    public void setMercId(String mercId) {
        this.mercId = mercId;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getClearingBankCode() {
        return clearingBankCode;
    }

    public void setClearingBankCode(String clearingBankCode) {
        this.clearingBankCode = clearingBankCode;
    }

    public String getBankcardNo() {
        return bankcardNo;
    }

    public void setBankcardNo(String bankcardNo) {
        this.bankcardNo = bankcardNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDefaultFlag() {
        return defaultFlag;
    }

    public void setDefaultFlag(String defaultFlag) {
        this.defaultFlag = defaultFlag;
    }

    public String getAcctCity() {
        return acctCity;
    }

    public void setAcctCity(String acctCity) {
        this.acctCity = acctCity;
    }

    public String getAcctBank() {
        return acctBank;
    }

    public void setAcctBank(String acctBank) {
        this.acctBank = acctBank;
    }

    public String getValidate() {
        return validate;
    }

    public void setValidate(String validate) {
        this.validate = validate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_LAEP_INDUSTRY_BANKCARD_BIND;
    }
}
