package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2023/8/22 15:13
 * @description 分账关系绑定申请(账户模式)
 */
public class V2MmsOpenApiLedgerApplyBindRequest extends V2CommRequest {

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
     * 分账接收方所属机构代码
     * M
     */
    @JsonProperty("orgCode")
    private String orgCode;

    /**
     * 分账商户内部商户号
     * C
     * merInnerNo、merCupNo选传其一，不能都为空
     */
    @JsonProperty("merInnerNo")
    private String merInnerNo;

    /**
     * 分账商户银联商户号
     * C
     * merInnerNo、merCupNo选传其一，不能都为空
     */
    @JsonProperty("merCupNo")
    private String merCupNo;

    /**
     * 分账接收方编号
     * M
     */
    @JsonProperty("receiverNo")
    private String receiverNo;

    /**
     * 合作协议附件名称
     * M
     */
    @JsonProperty("entrustFileName")
    private String entrustFileName;

    /**
     * 合作协议附件路径
     * M
     * 调用进件附件上传接口获取到附件路径） 文件上传
     */
    @JsonProperty("entrustFilePath")
    private String entrustFilePath;

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

    public String getReceiverNo() {
        return receiverNo;
    }

    public void setReceiverNo(String receiverNo) {
        this.receiverNo = receiverNo;
    }

    public String getEntrustFileName() {
        return entrustFileName;
    }

    public void setEntrustFileName(String entrustFileName) {
        this.entrustFileName = entrustFileName;
    }

    public String getEntrustFilePath() {
        return entrustFilePath;
    }

    public void setEntrustFilePath(String entrustFilePath) {
        this.entrustFilePath = entrustFilePath;
    }

    public String getRetUrl() {
        return retUrl;
    }

    public void setRetUrl(String retUrl) {
        this.retUrl = retUrl;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_MMS_OPENAPI_LEDGER_APPLYBIND;
    }
}
