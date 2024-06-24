package com.lkl.laop.sdk.request;

import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2023/11/14 15:32
 * @description V3主扫交易(全报文加密)
 */
public class V3LabsTransPreorderEncryRequest extends V3LabsTransPreorderRequest {
    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_LABS_TRANS_PREORDER_ENCRY;
    }

}
