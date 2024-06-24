package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nxj
 * @date 2024/3/22 18:07
 * @description v3签约支付接口-交易设备信息域
 */
public class V3IpsTermInfo {

    /**
     * 设备交易IP
     * C
     * 设备交易的IP地址，如：
     * 1）10.10.0.1 (IPv4)
     * 2) ABCD:EF01:2345:6789:ABCE:EF01:2345:6789 (IPv6)
     * 3) 0123:4567:89AB:CDEF:0123:4567:10.10.0.10 (IPv6)
     */
    @JsonProperty("device_ip")
    private String deviceIp;

    /**
     * mac地址
     * C
     * 交易设备的MAC地址，格式:00247e0a6c2e
     */
    @JsonProperty("mac")
    private String mac;

    /**
     * 交易设备IMEI
     * C
     * 交易设备的IMEI 如010102020303040
     */
    @JsonProperty("imei")
    private String imei;

    /**
     * 交易设备IMSI
     * C
     * 交易设备SIM/USIM的IMSI 如：010203040506070
     */
    @JsonProperty("imsi")
    private String imsi;

    /**
     * 交易设备ICCID
     * C
     * 交易设备SIM/USIM的ICCID 如：00112233445566778899
     */
    @JsonProperty("iccid")
    private String iccid;

    /**
     * 交易设备WIFI MAC
     * C
     * 交易设备接入WIFI的MAC地址：格式:00247e0a6c2e
     */
    @JsonProperty("wifi_mac")
    private String wifiMac;

    /**
     * 交易设备的位置信息
     * C
     * 交易设备的位置信息，格式为“经度，纬度”，+表示北纬、东经，-表示南纬、西经。举例：+37.12，-121.23
     */
    @JsonProperty("gps")
    private String gps;

    public String getDeviceIp() {
        return deviceIp;
    }

    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getWifiMac() {
        return wifiMac;
    }

    public void setWifiMac(String wifiMac) {
        this.wifiMac = wifiMac;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }
}
