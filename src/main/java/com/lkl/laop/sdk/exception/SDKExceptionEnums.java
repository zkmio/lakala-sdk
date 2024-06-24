package com.lkl.laop.sdk.exception;

/**
 * SDKExceptionEnums
 *
 * @author zhangqiang
 * @version 1.0
 * 2021/10/11 15:26
 **/
public enum SDKExceptionEnums implements ExceptionEnums {
    POST_ERROR("SDK000001", "网络连接异常"),
    RES_IS_NULL("SDK000002", "返回数据为空"),
    BAD_REQ("SDK000003", "请求异常"),
    SM4_INIT_FAIL("SDK000004", "未初始化SM4"),
    INITIALIZE_KEYSTORE_ERROR("SDK000007", "初始化文件异常"),
    FILE_READ_FAIL_EXCEPTION("SDK000008", "文件读取失败"),
    CHECK_FAIL("SDK000009", "字段校验异常"),
    ERROR("SDK999999", "未知异常"),
    ;

    private String code;
    private String message;

    private SDKExceptionEnums(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}