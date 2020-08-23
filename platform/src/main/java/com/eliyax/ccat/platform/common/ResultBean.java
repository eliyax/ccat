package com.eliyax.ccat.platform.common;

import lombok.Getter;

import java.io.Serializable;

/**
 * 统一的返回封装
 *
 * @author Eliyax
 * @date 2020/8/23 10:11
 */
@Getter
public class ResultBean<T> implements Serializable {

    /**
     * 返回的信息(主要出错的时候使用)
     */
    private String msg;

    /**
     * 接口返回码, 0表示成功, 其他看对应的定义
     * 0   : 成功
     * >0 : 表示已知的异常(例如提示错误等, 需要调用地方单独处理)
     * <0 : 表示未知的异常(不需要单独处理, 调用方统一处理)
     */
    private int code;

    /**
     * 返回的数据
     */
    private T data;

    private ResultBean(String msg, int code, T data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public static <T> ResultBean success() {
        return new ResultBean<T>(ResultCode.SUCCESS.getMsg(), ResultCode.SUCCESS.getCode(), null);
    }

    public static <T> ResultBean success(T data) {
        return new ResultBean<T>(ResultCode.SUCCESS.getMsg(), ResultCode.SUCCESS.getCode(), data);
    }

    public static <T> ResultBean fail(ResultCode resultCode) {
        return new ResultBean<T>(resultCode.getMsg(), resultCode.getCode(), null);
    }

    public static <T> ResultBean fail(ResultCode resultCode, T data) {
        return new ResultBean<T>(resultCode.getMsg(), resultCode.getCode(), data);
    }

}
