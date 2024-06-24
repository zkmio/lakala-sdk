package com.lkl.laop.sdk.request;

import com.lkl.laop.sdk.utils.JsonUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author nxj
 * @date 2023/8/21 14:54
 * @description V2接口通用公共参数
 */
public abstract class V2CommRequest implements LklRequest {

    @Override
    public String toBody() {
        Map<String, Object> param = new HashMap<>();
        param.put("reqId", UUID.randomUUID().toString().replace("-", ""));
        param.put("reqTime", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
        param.put("version", "2.0");
        param.put("reqData", this);
        return JsonUtils.toJSONString(param);
    }
}
