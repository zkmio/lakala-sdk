package com.lkl.laop.sdk.notification;

/**
 * @author nxj
 * @date 2024/5/13 17:20
 * @description 拉卡拉通知响应实体
 * 响应失败,拉卡拉会重复通知;详情请参考拉卡拉开放平台官方文档
 */
public class NotificationResult {
    private String code;
    private String message;


    public static NotificationResult ok() {
        NotificationResult result = new NotificationResult();
        result.setCode("SUCCESS");
        result.setMessage("执行成功");
        return result;
    }

    public static NotificationResult fail() {
        NotificationResult result = new NotificationResult();
        result.setCode("FAIL");
        result.setMessage("失败");
        return result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
