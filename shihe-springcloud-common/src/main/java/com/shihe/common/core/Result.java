package com.shihe.common.core;

import lombok.Data;

import java.io.Serializable;

/**
 * 形式二
 * @param <T>
 */
@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private long timestamp;

    private String code;

    private String msg;

    private T data;


    public Result(T data, StatusCode statusCode) {
        this.code = statusCode.getCode();
        this.msg = statusCode.getMessage();
        this.timestamp = System.currentTimeMillis();
        this.data = data;
    }

    public Result(StatusCode errcode) {
        this.code = errcode.getCode();
        this.msg = errcode.getMessage();
        this.timestamp = System.currentTimeMillis();
    }

    public Result(String code, String msg, T data) {
        this.timestamp = System.currentTimeMillis();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result() {
    }
}
