package com.lkl.laop.sdk.request;

import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2023/11/23 15:02
 * @description 收银台订单创建 （全报文加密）
 */
public class V3CcssCounterOrderSpecialCreateEncryRequest extends V3CcssCounterOrderSpecialCreateRequest {
    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_CCSS_COUNTER_ORDER_SPECIAL_CREATE_ENCRY;
    }

}
