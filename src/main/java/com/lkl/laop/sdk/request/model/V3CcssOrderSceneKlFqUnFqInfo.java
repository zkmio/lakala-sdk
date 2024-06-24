package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nxj
 * @date 2024/05/17 14:43
 * @description 收银台订单-订单场景域-考拉分期场景-银联聚分期
 */
public class V3CcssOrderSceneKlFqUnFqInfo {

    /**
     * 卡号
     * C
     */
    @JsonProperty("cardNo")
    private String cardNo;

    /**
     * 银行简称
     * C
     */
    @JsonProperty("bankNm")
    private String bankNm;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getBankNm() {
        return bankNm;
    }

    public void setBankNm(String bankNm) {
        this.bankNm = bankNm;
    }
}
