package com.lkl.laop.sdk.request.ext;

import com.fasterxml.jackson.annotation.JsonProperty;

public class V3LabsTradeOutSplitInfo {

  /**
   * 外部子交易流水号
   * M
   * 商户子交易流水号，商户号下唯一
   */
  @JsonProperty("out_sub_trade_no")
  private String outSubTradeNo;

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
   * 拉卡拉分配的业务终端号
   */
  @JsonProperty("term_no")
  private String termNo;

  @JsonProperty("amount")
  private String amount;

  public String getOutSubTradeNo() {
    return outSubTradeNo;
  }

  public void setOutSubTradeNo(String outSubTradeNo) {
    this.outSubTradeNo = outSubTradeNo;
  }

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

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }
}
