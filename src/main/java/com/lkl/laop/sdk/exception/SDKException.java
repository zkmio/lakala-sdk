package com.lkl.laop.sdk.exception;

/**
 * SDKException
 *
 * @author zhangqiang
 * @version 1.0
 * 2021/10/11 15:25
 **/
public class SDKException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * 错误编码
     */
    private String code;


    public SDKException(String message, Throwable cause) {
        super(message, cause);
    }

    public SDKException(String message) {
        super(message);
    }

    public SDKException(Throwable cause) {
        super(cause);
    }

    public SDKException(String code, String message) {
        super(message);
        this.code = code;
    }

    public SDKException(ExceptionEnums err) {
        super(err.getMessage());
        this.code = err.getCode();
    }

    public SDKException(ExceptionEnums err, String errInfo) {
        super(err.getMessage() + "[" + errInfo + "]");
        this.code = err.getCode();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
