package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

import java.util.List;

/**
 * @author nxj
 * @date 2023/8/21 17:25
 * @description 分账接收方创建申请(账户模式)
 */
public class V2MmsOpenApiLedgerApplyLedgerReceiverRequest extends V2CommRequest {

    /**
     * 接口版本号
     * M
     */
    @JsonProperty("version")
    private String version;

    /**
     * 订单编号
     * M
     * 14位年月日时（24小时制）分秒+8位的随机数（不重复）
     * 便于后续跟踪排查问题及核对报文
     */
    @JsonProperty("orderNo")
    private String orderNo;

    /**
     * 分账接收方所属机构代码
     * M
     */
    @JsonProperty("orgCode")
    private String orgCode;

    /**
     * 分账接收方名称
     * M
     */
    @JsonProperty("receiverName")
    private String receiverName;

    /**
     * 联系手机号
     * M
     */
    @JsonProperty("contactMobile")
    private String contactMobile;

    /**
     * 营业执照号码
     * C
     * 收款账户账户类型为对公，必须上送
     */
    @JsonProperty("licenseNo")
    private String licenseNo;

    /**
     * 营业执照名称
     * C
     * 收款账户账户类型为对公，必须上送
     */
    @JsonProperty("licenseName")
    private String licenseName;

    /**
     * 法人姓名
     * C
     * 收款账户账户类型为对公，必须上送
     */
    @JsonProperty("legalPersonName")
    private String legalPersonName;

    /**
     * 法人证件类型
     * C
     * 17 身份证，18 护照，19 港澳居民来往内地通行证 20 台湾居民来往内地通行证
     * 收款账户账户类型为对公，必须上送，身份证外类型先咨询后再使用
     */
    @JsonProperty("legalPersonCertificateType")
    private String legalPersonCertificateType;

    /**
     * 法人证件号
     * C
     * 收款账户账户类型为对公，必须上送
     */
    @JsonProperty("legalPersonCertificateNo")
    private String legalPersonCertificateNo;

    /**
     * 收款账户卡号
     * M
     */
    @JsonProperty("acctNo")
    private String acctNo;

    /**
     * 收款账户名称
     * M
     */
    @JsonProperty("acctName")
    private String acctName;

    /**
     * 收款账户账户类型
     * M
     * 57：对公 58：对私
     */
    @JsonProperty("acctTypeCode")
    private String acctTypeCode;

    /**
     * 收款账户证件类型
     * M
     * 17 身份证，18 护照，19 港澳居民来往内地通行证 20 台湾居民来往内地通行证
     * 身份证外类型先咨询后再使用
     */
    @JsonProperty("acctCertificateType")
    private String acctCertificateType;

    /**
     * 收款账户证件号
     * M
     */
    @JsonProperty("acctCertificateNo")
    private String acctCertificateNo;

    /**
     * 收款账户开户行号
     * M
     * 参照卡BIN信息查询，仅支持对私结算账户
     */
    @JsonProperty("acctOpenBankCode")
    private String acctOpenBankCode;

    /**
     * 收款账户开户名称
     * M
     */
    @JsonProperty("acctOpenBankName")
    private String acctOpenBankName;

    /**
     * 收款账户清算行行号
     * M
     * 参照卡BIN信息查询，仅支持对私结算账户
     */
    @JsonProperty("acctClearBankCode")
    private String acctClearBankCode;

    /**
     * 接收方附件资料
     * M
     */
    @JsonProperty("attachList")
    private List<AttachInfo> attachList;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getLicenseName() {
        return licenseName;
    }

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    public String getLegalPersonName() {
        return legalPersonName;
    }

    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
    }

    public String getLegalPersonCertificateType() {
        return legalPersonCertificateType;
    }

    public void setLegalPersonCertificateType(String legalPersonCertificateType) {
        this.legalPersonCertificateType = legalPersonCertificateType;
    }

    public String getLegalPersonCertificateNo() {
        return legalPersonCertificateNo;
    }

    public void setLegalPersonCertificateNo(String legalPersonCertificateNo) {
        this.legalPersonCertificateNo = legalPersonCertificateNo;
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

    public String getAcctTypeCode() {
        return acctTypeCode;
    }

    public void setAcctTypeCode(String acctTypeCode) {
        this.acctTypeCode = acctTypeCode;
    }

    public String getAcctCertificateType() {
        return acctCertificateType;
    }

    public void setAcctCertificateType(String acctCertificateType) {
        this.acctCertificateType = acctCertificateType;
    }

    public String getAcctCertificateNo() {
        return acctCertificateNo;
    }

    public void setAcctCertificateNo(String acctCertificateNo) {
        this.acctCertificateNo = acctCertificateNo;
    }

    public String getAcctOpenBankCode() {
        return acctOpenBankCode;
    }

    public void setAcctOpenBankCode(String acctOpenBankCode) {
        this.acctOpenBankCode = acctOpenBankCode;
    }

    public String getAcctOpenBankName() {
        return acctOpenBankName;
    }

    public void setAcctOpenBankName(String acctOpenBankName) {
        this.acctOpenBankName = acctOpenBankName;
    }

    public String getAcctClearBankCode() {
        return acctClearBankCode;
    }

    public void setAcctClearBankCode(String acctClearBankCode) {
        this.acctClearBankCode = acctClearBankCode;
    }

    public List<AttachInfo> getAttachList() {
        return attachList;
    }

    public void setAttachList(List<AttachInfo> attachList) {
        this.attachList = attachList;
    }

    public static class AttachInfo {

        /**
         * 附件类型编码
         * M
         * 法人身份证正面	FR_ID_CARD_FRONT
         * 法人身份证反面	FR_ID_CARD_BEHIND
         * 身份证正面	ID_CARD_FRONT
         * 身份证反面	ID_CARD_BEHIND
         * 银行卡	BANK_CARD
         * 营业执照	BUSINESS_LICENCE
         * 商户门头照	MERCHANT_PHOTO
         * 商铺内部照片	SHOPINNER
         * 电子协议	NETWORK_XY
         * 分账结算授权委托书	SPLIT_ENTRUST_FILE
         * 分账合作协议	SPLIT_COOPERATION_FILE
         * 其他	OTHERS
         */
        @JsonProperty("attachType")
        private String attachType;

        /**
         * 附件名称
         * M
         */
        @JsonProperty("attachName")
        private String attachName;

        /**
         * 附件路径
         * M
         * 调用进件附件上传接口获取到附件路径） 文件上传
         */
        @JsonProperty("attachStorePath")
        private String attachStorePath;

        public String getAttachType() {
            return attachType;
        }

        public void setAttachType(String attachType) {
            this.attachType = attachType;
        }

        public String getAttachName() {
            return attachName;
        }

        public void setAttachName(String attachName) {
            this.attachName = attachName;
        }

        public String getAttachStorePath() {
            return attachStorePath;
        }

        public void setAttachStorePath(String attachStorePath) {
            this.attachStorePath = attachStorePath;
        }
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_MMS_OPENAPI_LEDGER_APPLYLEDGERRECEIVER;
    }
}
