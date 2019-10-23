package com.gaodev.springbootstudy.common;

/**
 * 返回编码枚举
 * <p>
 * @Author LeifChen
 * @Date 2019-02-26
 */
public enum ResponseStatusCode {

    // 成功
    SUCCESS(0, "SUCCESS"),
    // 失败
    ERROR(1, "ERROR"),
    // 参数不合法
    ILLEGAL_ARGUMENT(2, "ILLEGAL_ARGUMENT"),
    // 需要登录
    NEED_LOGIN(10, "NEED_LOGIN");

    private final int code;
    private final String message;

    ResponseStatusCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
