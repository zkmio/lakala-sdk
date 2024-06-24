package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2024/3/25 10:39
 * @description 批量代收
 */
public class V3IpsdkTransBatchCollectionRequest extends V3CommRequest {

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
     * 批次号
     * M
     * 批量交易时填写，当天唯一,0001-9999
     */
    @JsonProperty("batch_no")
    private String batchNo;

    /**
     * 总笔数
     * M
     * 批量代收总笔数（最大1000）
     */
    @JsonProperty("total_qty")
    private String totalQty;

    /**
     * 总金额
     * M
     * 批量代收总金额
     */
    @JsonProperty("total_amt")
    private String totalAmt;

    /**
     * 文件名称
     * M
     * 文件名及文件路径,比如 /OP00000003/20220411/DK_8223010594303A2_0001_I.txt
     */
    @JsonProperty("file_name")
    private String fileName;

    /**
     * 文件摘要
     * M
     * 文件的SM3摘要
     */
    @JsonProperty("digest")
    private String digest;

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

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(String totalQty) {
        this.totalQty = totalQty;
    }

    public String getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(String totalAmt) {
        this.totalAmt = totalAmt;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_IPSDK_TRANS_BATCHCOLLECTION;
    }
}
