package com.lkl.laop.sdk.request.ext;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface ExtLklRequest {

  /**
   * functionCode对应接口url
   *
   * @return FunctionCodeEnum
   */
  @JsonIgnore
  ExtFunctionCodeEnum getExtFunctionCode();

  /**
   *转换为请求报文内容
   * @return text
   */
  String toBody();
}
