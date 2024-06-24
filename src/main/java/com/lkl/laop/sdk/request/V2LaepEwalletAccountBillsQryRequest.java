package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2024/1/16 14:42
 * @description 账管家V2.0-账单分页查询
 */
public class V2LaepEwalletAccountBillsQryRequest extends V2CommRequest {

    /**
     * 机构号
     * M
     */
    @JsonProperty("orgNo")
    private String orgNo;

    /**
     * bmcpNo机构号
     * M
     */
    @JsonProperty("bmcpNo")
    private String bmcpNo;

    /**
     * 账户号
     * C
     * 账户号和客户号二选一
     */
    @JsonProperty("acctNo")
    private String acctNo;

    /**
     * 客户号
     * C
     * 账户号和客户号二选一
     */
    @JsonProperty("custNo")
    private String custNo;

    /**
     * 账户类型
     * M
     * 01收款账户 02付款账户 03分账商户账户 04 分账接收方账户 05 充值代付账户 06 结算代付账户
     */
    @JsonProperty("payType")
    private String payType;

    /**
     * 余额方向
     * C
     * （+ 或 -），不填查全部
     */
    @JsonProperty("amntcd")
    private String amntcd;

    /**
     * 账户流水号
     * C
     */
    @JsonProperty("billSq")
    private String billSq;

    /**
     * 外部系统流水号
     * C
     */
    @JsonProperty("outTransSq")
    private String outTransSq;

    /**
     * 业务流水号
     * C
     */
    @JsonProperty("sid")
    private String sid;

    /**
     * 拉卡拉流水号
     * C
     */
    @JsonProperty("lklOrderNo")
    private String lklOrderNo;

    /**
     * 开始日期
     * M
     * yyyy-MM-dd
     */
    @JsonProperty("startDate")
    private String startDate;

    /**
     * 结束日期
     * M
     * yyyy-MM-dd
     */
    @JsonProperty("endDate")
    private String endDate;

    /**
     * 当前页，默认值1
     * C
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 查询条数，默认值10，最大200
     * C
     */
    @JsonProperty("size")
    private Integer size;

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getBmcpNo() {
        return bmcpNo;
    }

    public void setBmcpNo(String bmcpNo) {
        this.bmcpNo = bmcpNo;
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getAmntcd() {
        return amntcd;
    }

    public void setAmntcd(String amntcd) {
        this.amntcd = amntcd;
    }

    public String getBillSq() {
        return billSq;
    }

    public void setBillSq(String billSq) {
        this.billSq = billSq;
    }

    public String getOutTransSq() {
        return outTransSq;
    }

    public void setOutTransSq(String outTransSq) {
        this.outTransSq = outTransSq;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getLklOrderNo() {
        return lklOrderNo;
    }

    public void setLklOrderNo(String lklOrderNo) {
        this.lklOrderNo = lklOrderNo;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V2_LAEP_EWALLETACCOUNT_BILLSQRY;
    }
}
