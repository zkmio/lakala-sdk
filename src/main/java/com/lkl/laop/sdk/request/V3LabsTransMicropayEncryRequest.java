package com.lkl.laop.sdk.request;

import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2023/11/23 10:04
 * @description 被扫接口（全报文加密）
 */
public class V3LabsTransMicropayEncryRequest extends V3LabsTransMicropayRequest {
    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_LABS_TRANS_MICROPAY_ENCRY;
    }

}
