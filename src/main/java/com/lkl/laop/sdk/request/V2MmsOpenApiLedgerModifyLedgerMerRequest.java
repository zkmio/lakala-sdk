package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2023/8/21 16:41
 * @description 商户分账信息变更申请(账户模式)
 */
public class V2MmsOpenApiLedgerModifyLedgerMerRequest extends V2CommRequest{

    /**
     * 接口版本号
     * M
     */
    @JsonProperty("version")
    private String version;

    /**
     * 订单编号
     * M
     * 14位年月日时（24小时制）分秒+8位的随机数（不重复）如：2021020112000012345678
     * 便于后续跟踪排查问题及回调消息匹配
     */
    @JsonProperty("orderNo")
    private String orderNo;

    /**
     * 机构代码
     * M
     */
    @JsonProperty("orgCode")
    private String orgCode;

    /**
     * 拉卡拉内部商户号
     * C
     * 拉卡拉内部商户号和银联商户号必须传一个，都送以内部商户号为准
     */
    @JsonProperty("merInnerNo")
    private String merInnerNo;

    /**
     * 银联商户号
     * C
     * 拉卡拉内部商户号和银联商户号必须传一个，都送以内部商户号为准
     */
    @JsonProperty("merCupNo")
    private String merCupNo;

    /**
     * 联系手机号
     * C
     */
    @JsonProperty("contactMobile")
    private String contactMobile;

    /**
     * 最低分账比例
     * C
     * 百分比，支持2位精度
     */
    @JsonProperty("splitLowestRatio")
    private String splitLowestRatio;

    /**
     * 分账结算委托书文件名称
     * C
     */
    @JsonProperty("splitEntrustFileName")
    private String splitEntrustFileName;

    /**
     * 分账结算委托书文件路径
     * C
     * 调用商户入网接口上传附件后反馈的文件路径
     */
    @JsonProperty("splitEntrustFilePath")
    private String splitEntrustFilePath;

    /**
     * 分账范围
     * C
     * ALL：全部交易分账 (商户所有交易默认待分账)
     * MARK：标记交易分账(只有带分账标识交易待分账，其余交易正常结算)
     * 默认：MARK
     */
    @JsonProperty("splitRange")
    private String splitRange;

    /**
     * 回调通知地址
     * M
     * 审核通过后通知的地址
     */
    @JsonProperty("retUrl")
    private String retUrl;

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

    public String getMerInnerNo() {
        return merInnerNo;
    }

    public void setMerInnerNo(String merInnerNo) {
        this.merInnerNo = merInnerNo;
    }

    public String getMerCupNo() {
        return merCupNo;
    }

    public void setMerCupNo(String merCupNo) {
        this.merCupNo = merCupNo;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getSplitLowestRatio() {
        return splitLowestRatio;
    }

    public void setSplitLowestRatio(String splitLowestRatio) {
        this.splitLowestRatio = splitLowestRatio;
    }

    public String getSplitEntrustFileName() {
        return splitEntrustFileName;
    }

    public void setSplitEntrustFileName(String splitEntrustFileName) {
        this.splitEntrustFileName = splitEntrustFileName;
    }

    public String getSplitEntrustFilePath() {
        return splitEntrustFilePath;
    }

    public void setSplitEntrustFilePath(String splitEntrustFilePath) {
        this.splitEntrustFilePath = splitEntrustFilePath;
    }

    public String getSplitRange() {
        return splitRange;
    }

    public void setSplitRange(String splitRange) {
        this.splitRange = splitRange;
    }

    public String getRetUrl() {
        return retUrl;
    }

    public void setRetUrl(String retUrl) {
        this.retUrl = retUrl;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_MMS_OPENAPI_LEDGER_MODIFYLEDGERMER;
    }
}
