package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nxj
 * @date 2023/7/20 10:18
 * @description 网联小钱包acc_busi_fields域内容
 */
public class V3LabsTradePreorderNucspayBus extends V3LabsTradeAccBusiFieldInfo {

    /**
     * 小钱包金融机构编号
     * C
     */
    @JsonProperty("nuc_issr_id")
    private String nucIssrId;

    public String getNucIssrId() {
        return nucIssrId;
    }

    public void setNucIssrId(String nucIssrId) {
        this.nucIssrId = nucIssrId;
    }
}
