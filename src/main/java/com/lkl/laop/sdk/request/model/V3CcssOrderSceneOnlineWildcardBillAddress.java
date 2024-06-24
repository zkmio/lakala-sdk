package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nxj
 * @date 2023/11/23 15:43
 * @description 收银台订单-订单场景域-线上外卡场景加密域-地址实体
 */
public class V3CcssOrderSceneOnlineWildcardBillAddress {
    /**
     * 门牌号或姓名
     * M
     * 账单地址 - 门牌号或姓名
     */
    @JsonProperty("houseNumberOrName")
    private String houseNumberOrName;

    /**
     * 街道
     * M
     * 账单地址 - 街道
     */
    @JsonProperty("street")
    private String street;

    /**
     * 城市
     * M
     * 账单地址 - 城市
     */
    @JsonProperty("city")
    private String city;

    /**
     * 国家
     * M
     * 账单地址 - 国家
     */
    @JsonProperty("country")
    private String country;

    /**
     * 州或省
     * C
     * 账单地址 - 州或省
     */
    @JsonProperty("stateOrProvince")
    private String stateOrProvince;

    /**
     * 邮编
     * M
     * 账单地址 - 邮编
     */
    @JsonProperty("postalCode")
    private String postalCode;

    public String getHouseNumberOrName() {
        return houseNumberOrName;
    }

    public void setHouseNumberOrName(String houseNumberOrName) {
        this.houseNumberOrName = houseNumberOrName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStateOrProvince() {
        return stateOrProvince;
    }

    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
