package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nxj
 * @date 2023/7/19 16:44
 * @description 地址位置信息
 */
public class V3LabsTradeLocationInfo {

    /**
     * 请求方IP地址
     * M
     * 请求方的IP地址，存在必填，格式如36.45.36.95
     */
    @JsonProperty("request_ip")
    private String requestIp;

    /**
     * 基站信息
     * C
     * 客户端设备的基站信息（主扫时基站信息使用该字段）
     */
    @JsonProperty("base_station")
    private String baseStation;

    /**
     * 纬度,经度
     * C
     * 商户终端的地理位置，存在必填 格式：纬度,经度，+表示北纬、东经，-表示南纬、 西经，精度最长支持小数点后9位。举例:+37.123456789,-121.123456789
     */
    @JsonProperty("location")
    private String location;

    public V3LabsTradeLocationInfo() {
    }

    public V3LabsTradeLocationInfo(String requestIp) {
        this.requestIp = requestIp;
    }

    public V3LabsTradeLocationInfo(String requestIp, String baseStation, String location) {
        this.requestIp = requestIp;
        this.baseStation = baseStation;
        this.location = location;
    }

    public String getRequestIp() {
        return requestIp;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp;
    }

    public String getBaseStation() {
        return baseStation;
    }

    public void setBaseStation(String baseStation) {
        this.baseStation = baseStation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
