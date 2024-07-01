package com.lkl.laop.sdk.request.ext;

import com.lkl.laop.sdk.utils.JsonUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class ExtV3CommRequest implements ExtLklRequest {

  @Override
  public String toBody() {
    Map<String, Object> param = new HashMap<>();
    param.put("req_time", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
    param.put("version", "3.0");
    param.put("req_data", this);
    return JsonUtils.toJSONString(param);
  }
}
