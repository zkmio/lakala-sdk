package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nxj
 * @date 2023/11/23 16:45
 * @description 交易订单上送身份信息实体
 */
public class V3TransIdentityInfo {

    /**
     * 证件号
     * M
     */
    @JsonProperty("identityNo")
    private String identityNo;

    /**
     * 名称
     * M
     */
    @JsonProperty("name")
    private String name;

    /**
     * 证件类型
     * C
     * 证件类型 01：身份证 02：军官证 03：护照 04：港澳证（港澳居民来往内地通行证/回乡证） 05：台胞证 06：警官证 07：士兵证 99：其它证件
     * 目前仅支持证件类型为01-身份证,不上送默认01
     */
    @JsonProperty("identityType")
    private String identityType;

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }
}
