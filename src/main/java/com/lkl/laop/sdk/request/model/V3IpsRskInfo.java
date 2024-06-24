package com.lkl.laop.sdk.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author nxj
 * @date 2024/3/22 17:58
 * @description v3签约支付接口-风险监控信息域
 */
public class V3IpsRskInfo {

    /**
     * 设备型号
     * C
     * 设备型号名称
     */
    @JsonProperty("device_mode")
    private String deviceMode;

    /**
     * 设备语音
     * C
     * 设备语言，代码遵从 ISO639-3 标准
     */
    @JsonProperty("device_language")
    private String deviceLanguage;

    /**
     * IP地址
     * C
     * 客户端IP地址
     */
    @JsonProperty("source_ip")
    private String sourceIp;

    /**
     * mac地址
     * C
     * 格式有以下两种：00-24-7E-0A-6C-2E、00247e0a6c2e
     */
    @JsonProperty("mac")
    private String mac;

    /**
     * 设备号
     * C
     * 建议 PC 设备采集硬盘序列号、安卓系统设备采集 IMEI、iOS 设备采集IDFV
     */
    @JsonProperty("dev_id")
    private String devId;

    /**
     * GPS位置
     * C
     * 经纬度，格式为纬度/经度，+表示北纬、东经，-表示南纬、西经。举例：+37.12/-121.23 或者+37/-121
     */
    @JsonProperty("extensive_deviceLocation")
    private String extensiveDeviceLocation;

    /**
     * SIM 卡号码
     * C
     * 存储 11 位手机号，若存在 2 个通讯设备号码，则用逗号分隔
     */
    @JsonProperty("device_number")
    private String deviceNumber;

    /**
     * SIM 卡数量
     * C
     * 设备 sim 卡数量
     */
    @JsonProperty("device_sim_number")
    private String deviceSimNumber;

    /**
     * 账户 ID
     * C
     * 商户端用户支付时，如处于用户登录状态，提供商户系统中的用户 ID
     */
    @JsonProperty("account_id_hash")
    private String accountIdHash;

    /**
     * 风险评分
     * C
     * 风险等级评分
     */
    @JsonProperty("risk_score")
    private String riskScore;

    /**
     * 原因码
     * C
     * 风险评分的主要原因码
     */
    @JsonProperty("risk_reason_code")
    private String riskReasonCode;

    /**
     * 收单端用户注册日期
     * C
     * 收单端用户注册时间，14 位时间字符 yyyymmddHHMMSS
     */
    @JsonProperty("mchnt_usr_rgstr_tm")
    private String mchntUsrRgstrTm;

    /**
     * 收单端注册账户邮箱地址
     * C
     * 收单端用户注册邮箱
     */
    @JsonProperty("mchnt_usr_rgstr_email")
    private String mchntUsrRgstrEmail;

    /**
     * 收货省
     * C
     * 收货地-省，注意需转换为银联清算地区代码
     */
    @JsonProperty("rcv_province")
    private String rcvProvince;

    /**
     * 收货市
     * C
     * 收货地-市，注意需转换为银联清算地区代码
     */
    @JsonProperty("rcv_city")
    private String rcvCity;

    /**
     * 商品类型
     * C
     * 商品类别：虚拟（1），非虚拟（2），不确定（0）
     */
    @JsonProperty("goods_class")
    private String goodsClass;

    public String getDeviceMode() {
        return deviceMode;
    }

    public void setDeviceMode(String deviceMode) {
        this.deviceMode = deviceMode;
    }

    public String getDeviceLanguage() {
        return deviceLanguage;
    }

    public void setDeviceLanguage(String deviceLanguage) {
        this.deviceLanguage = deviceLanguage;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

    public String getExtensiveDeviceLocation() {
        return extensiveDeviceLocation;
    }

    public void setExtensiveDeviceLocation(String extensiveDeviceLocation) {
        this.extensiveDeviceLocation = extensiveDeviceLocation;
    }

    public String getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    public String getDeviceSimNumber() {
        return deviceSimNumber;
    }

    public void setDeviceSimNumber(String deviceSimNumber) {
        this.deviceSimNumber = deviceSimNumber;
    }

    public String getAccountIdHash() {
        return accountIdHash;
    }

    public void setAccountIdHash(String accountIdHash) {
        this.accountIdHash = accountIdHash;
    }

    public String getRiskScore() {
        return riskScore;
    }

    public void setRiskScore(String riskScore) {
        this.riskScore = riskScore;
    }

    public String getRiskReasonCode() {
        return riskReasonCode;
    }

    public void setRiskReasonCode(String riskReasonCode) {
        this.riskReasonCode = riskReasonCode;
    }

    public String getMchntUsrRgstrTm() {
        return mchntUsrRgstrTm;
    }

    public void setMchntUsrRgstrTm(String mchntUsrRgstrTm) {
        this.mchntUsrRgstrTm = mchntUsrRgstrTm;
    }

    public String getMchntUsrRgstrEmail() {
        return mchntUsrRgstrEmail;
    }

    public void setMchntUsrRgstrEmail(String mchntUsrRgstrEmail) {
        this.mchntUsrRgstrEmail = mchntUsrRgstrEmail;
    }

    public String getRcvProvince() {
        return rcvProvince;
    }

    public void setRcvProvince(String rcvProvince) {
        this.rcvProvince = rcvProvince;
    }

    public String getRcvCity() {
        return rcvCity;
    }

    public void setRcvCity(String rcvCity) {
        this.rcvCity = rcvCity;
    }

    public String getGoodsClass() {
        return goodsClass;
    }

    public void setGoodsClass(String goodsClass) {
        this.goodsClass = goodsClass;
    }
}
