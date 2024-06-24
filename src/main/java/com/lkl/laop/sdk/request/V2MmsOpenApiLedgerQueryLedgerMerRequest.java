package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2023/8/21 15:49
 * @description 商户分账信息查询(账户模式)
 */
public class V2MmsOpenApiLedgerQueryLedgerMerRequest extends V2CommRequest{

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

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_MMS_OPENAPI_LEDGER_QUERYLEDGERMER;
    }
}
