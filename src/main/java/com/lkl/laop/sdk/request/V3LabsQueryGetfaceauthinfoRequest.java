package com.lkl.laop.sdk.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lkl.laop.sdk.enums.FunctionCodeEnum;

/**
 * @author nxj
 * @date 2023/11/22 17:32
 * @description 微信刷脸授权信息获取
 */
public class V3LabsQueryGetfaceauthinfoRequest extends V3CommRequest{

    /**
     * 商户号
     * M
     * 拉卡拉分配的商户号
     */
    @JsonProperty("merchant_no")
    private String merchantNo;

    /**
     * 终端号
     * M
     * 拉卡拉分配的终端号
     */
    @JsonProperty("term_no")
    private String termNo;

    /**
     * 门店名称
     * M
     */
    @JsonProperty("store_name")
    private String storeName;

    /**
     * 门店Id
     * M
     */
    @JsonProperty("store_id")
    private String storeId;

    /**
     * 初始化数据
     * M
     * 初始化数据。由微信人脸SDK的接口返回。
     */
    @JsonProperty("rawdata")
    private String rawdata;

    /**
     * 子商户appid
     * C
     * 子商户绑定的公众号/小程序 appid
     */
    @JsonProperty("sub_app_id")
    private String subAppId;

    /**
     * 附加字段
     * C
     * 附加字段。字段格式使用Json
     */
    @JsonProperty("attach")
    private String attach;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getTermNo() {
        return termNo;
    }

    public void setTermNo(String termNo) {
        this.termNo = termNo;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getRawdata() {
        return rawdata;
    }

    public void setRawdata(String rawdata) {
        this.rawdata = rawdata;
    }

    public String getSubAppId() {
        return subAppId;
    }

    public void setSubAppId(String subAppId) {
        this.subAppId = subAppId;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    @Override
    public FunctionCodeEnum getFunctionCode() {
        return FunctionCodeEnum.API_V3_LABS_QUERY_GETFACEAUTHINFO;
    }
}
