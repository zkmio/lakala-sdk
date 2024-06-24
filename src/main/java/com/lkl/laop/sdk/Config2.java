package com.lkl.laop.sdk;

import org.apache.http.conn.HttpClientConnectionManager;

import java.io.Serializable;

/**
 * @author nxj
 * @date 2024/5/13 10:55
 * @description 支持证书以字符串格式传入
 */
public class Config2 implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 拉卡拉appId
     */
    protected String appId;
    /**
     * 商户证书序列号
     */
    protected String serialNo;
    /**
     * 商户私钥信息地址
     */
    protected String priKey;
    /**
     * 拉卡拉支付平台证书(用于拉卡拉响应验签)
     */
    protected String lklCer;
    /**
     * 拉卡拉支付平台证书2(用于拉卡拉通知推送验签)
     */
    protected String lklNotifyCer;
    /**
     * 拉卡拉报文加密对称性密钥
     */
    protected String sm4Key;
    /**
     * 连接超时时间
     */
    protected Integer connectTimeout;
    /**
     * 建立连接后超时时间
     */
    protected Integer readTimeout;
    /**
     * 读取数据超时时间
     */
    protected Integer socketTimeout;

    /**
     * API服务地址
     */
    protected String serverUrl;

    /**
     * 自定义http连接
     */
    protected HttpClientConnectionManager httpClientConnectionManager;

    public Config2() {
    }

    public Config2(String appId, String serialNo, String priKey, String lklCer, String lklNotifyCer, String serverUrl) {
        this.appId = appId;
        this.serialNo = serialNo;
        this.priKey = priKey;
        this.lklCer = lklCer;
        this.lklNotifyCer = lklNotifyCer;
        this.serverUrl = serverUrl;
    }

    public Config2(String appId, String serialNo, String priKey, String lklCer, String notifyLklCer, String sm4Key, String serverUrl) {
        this.appId = appId;
        this.serialNo = serialNo;
        this.priKey = priKey;
        this.lklCer = lklCer;
        this.lklNotifyCer = notifyLklCer;
        this.sm4Key = sm4Key;
        this.serverUrl = serverUrl;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getPriKey() {
        return priKey;
    }

    public void setPriKey(String priKey) {
        this.priKey = priKey;
    }

    public String getLklCer() {
        return lklCer;
    }

    public void setLklCer(String lklCer) {
        this.lklCer = lklCer;
    }

    public String getLklNotifyCer() {
        return lklNotifyCer;
    }

    public void setLklNotifyCer(String lklNotifyCer) {
        this.lklNotifyCer = lklNotifyCer;
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public Integer getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    public Integer getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(Integer socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public String getSm4Key() {
        return sm4Key;
    }

    public void setSm4Key(String sm4Key) {
        this.sm4Key = sm4Key;
    }

    public HttpClientConnectionManager getHttpClientConnectionManager() {
        return httpClientConnectionManager;
    }

    public void setHttpClientConnectionManager(HttpClientConnectionManager httpClientConnectionManager) {
        this.httpClientConnectionManager = httpClientConnectionManager;
    }
}
