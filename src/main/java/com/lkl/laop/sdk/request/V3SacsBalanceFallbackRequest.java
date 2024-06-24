package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

import java.util.List;

/**
 * @author nxj
 * @date 2023/8/17 15:25
 * @description 余额分账回退
 */
public class V3SacsBalanceFallbackRequest extends V3CommRequest {

    /**
     * 商户号
     * M
     */
    @JsonProperty("merchant_no")
    private String merchantNo;

    /**
     * 原分账指令流水
     * C
     * origin_separate_no和origin_out_separate_no二选一，
     * 若都选， origin_separate_no > origin_out_separate_no
     */
    @JsonProperty("origin_separate_no")
    private String originSeparateNo;

    /**
     * 商户分账指令流水号
     * M
     */
    @JsonProperty("out_separate_no")
    private String outSeparateNo;

    /**
     * 原商户分账指令流水号
     * M
     * origin_separate_no和origin_out_separate_no二选一，
     * 若都选， origin_separate_no > origin_out_separate_no
     */
    @JsonProperty("origin_out_separate_no")
    private String originOutSeparateNo;

    /**
     * 回退原因
     * C
     */
    @JsonProperty("fallback_reason")
    private String fallbackReason;

    /**
     * 回退金额
     */
    @JsonProperty("total_amt")
    private String totalAmt;

    /**
     * 原分账接收数据对象
     * M
     * 目前只能指定一个接收方编号的回退，该LIST只能传一个对象，否则校验报错。
     */
    @JsonProperty("origin_recv_datas")
    private List<OriginRecvData> originRecvDatas;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOriginSeparateNo() {
        return originSeparateNo;
    }

    public void setOriginSeparateNo(String originSeparateNo) {
        this.originSeparateNo = originSeparateNo;
    }

    public String getOutSeparateNo() {
        return outSeparateNo;
    }

    public void setOutSeparateNo(String outSeparateNo) {
        this.outSeparateNo = outSeparateNo;
    }

    public String getOriginOutSeparateNo() {
        return originOutSeparateNo;
    }

    public void setOriginOutSeparateNo(String originOutSeparateNo) {
        this.originOutSeparateNo = originOutSeparateNo;
    }

    public String getFallbackReason() {
        return fallbackReason;
    }

    public void setFallbackReason(String fallbackReason) {
        this.fallbackReason = fallbackReason;
    }

    public String getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(String totalAmt) {
        this.totalAmt = totalAmt;
    }

    public List<OriginRecvData> getOriginRecvDatas() {
        return originRecvDatas;
    }

    public void setOriginRecvDatas(List<OriginRecvData> originRecvDatas) {
        this.originRecvDatas = originRecvDatas;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_SACS_BALANCEFALLBACK;
    }

    public static class OriginRecvData {
        /**
         * 分账接收方编号
         * C
         */
        @JsonProperty("recv_no")
        private String recvNo;

        /**
         * 回退金额
         * C
         */
        @JsonProperty("amt")
        private String amt;

        public String getRecvNo() {
            return recvNo;
        }

        public void setRecvNo(String recvNo) {
            this.recvNo = recvNo;
        }

        public String getAmt() {
            return amt;
        }

        public void setAmt(String amt) {
            this.amt = amt;
        }
    }
}
