package com.gaodev.springbootstudy.common;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * 统一返回结果
 当前实体类在返回前端的时候忽略字段属性为null的字段，使其为null字段不显示
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class JsonResult<T> implements Serializable {

    private int code;
    private String message;
    private T data;

    private JsonResult(int code) {
        this.code = code;
    }

    private JsonResult(int code, T data) {
        this.code = code;
        this.data = data;
    }

    private JsonResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private JsonResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @JsonIgnore
    public boolean isSuccess() {
        return this.code == ResponseStatusCode.SUCCESS.getCode();
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public static <T> JsonResult<T> success() {
        return new JsonResult<>(ResponseStatusCode.SUCCESS.getCode());
    }

    public static <T> JsonResult<T> success(String msg) {
        return new JsonResult<>(ResponseStatusCode.SUCCESS.getCode(), msg);
    }

    public static <T> JsonResult<T> success(T data) {
        return new JsonResult<>(ResponseStatusCode.SUCCESS.getCode(), data);
    }

    public static <T> JsonResult<T> success(String msg, T data) {
        return new JsonResult<>(ResponseStatusCode.SUCCESS.getCode(), msg, data);
    }

    public static <T> JsonResult<T> error() {
        return new JsonResult<>(ResponseStatusCode.ERROR.getCode(), ResponseStatusCode.ERROR.getMessage());
    }

    public static <T> JsonResult<T> error(String errorMessage) {
        return new JsonResult<>(ResponseStatusCode.ERROR.getCode(), errorMessage);
    }

    public static <T> JsonResult<T> error(int errorCode, String errorMessage) {
        return new JsonResult<>(errorCode, errorMessage);
    }
}
