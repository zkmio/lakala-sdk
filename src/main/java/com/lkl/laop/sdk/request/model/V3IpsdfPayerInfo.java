package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nxj
 * @date 2024/5/16 10:08
 * @description 代付业务接口-账户信息payer_info 描述
 */
public class V3IpsdfPayerInfo {

    /**
     * 参与方类型
     * M
     * OutBankCard:外部银行 InAccNo:内部账号(拉卡拉内部账号)
     */
    @JsonProperty("identity_type")
    private String identityType;

    /**
     * 开户行行号
     * C
     * OutBankCard:外部银行卡 必选
     */
    @JsonProperty("bank_no")
    private String bankNo;

    /**
     * 开户行名称
     * C
     * OutBankCard:外部银行卡 必选
     */
    @JsonProperty("bank_name")
    private String bankName;

    /**
     * 账号
     * M
     * OutBankCard:外部银行卡 InAccNo:内部账号
     */
    @JsonProperty("acct_no")
    private String acctNo;

    /**
     * 账户名称
     * M
     * OutBankCard:外部银行卡户InAccNo:内部账号对应商户名称
     */
    @JsonProperty("acct_name")
    private String acctName;

    /**
     * 账号类型
     * C
     * 收款账户类型。 0：对公（在金融机构开设的公司账户） 1：对私（在金融机构开设的个人账户）
     */
    @JsonProperty("acct_type")
    private String acctType;

    /**
     * 联行号
     * C
     * 如果银行卡为对公，必传
     */
    @JsonProperty("bank_branch_no")
    private String bankBranchNo;

    /**
     * 支行名称
     * C
     * 如果银行卡为对公，必传
     */
    @JsonProperty("bank_branch_name")
    private String bankBranchName;

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
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

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public String getBankBranchNo() {
        return bankBranchNo;
    }

    public void setBankBranchNo(String bankBranchNo) {
        this.bankBranchNo = bankBranchNo;
    }

    public String getBankBranchName() {
        return bankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }
}
