package com.lkl.laop.sdk.request.ext;

public enum ExtFunctionCodeEnum {

  API_V3_LABS_TRANS_MERGE_PREORDER("/api/v3/labs/trans/merge/preorder", "主扫合单交易"),

  ;

  private final String code;

  private final String name;


  ExtFunctionCodeEnum(String code, String name) {
    this.code = code;
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  public String getUrl() {
    return code.replaceAll("\\.", "/");
  }
}
