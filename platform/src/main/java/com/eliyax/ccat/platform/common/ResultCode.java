package com.eliyax.ccat.platform.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 统一返回结果枚举
 *
 * @author Eliyax
 * @date 2020/8/23 10:11
 */
@AllArgsConstructor
@Getter
public enum ResultCode {
    /**
     * 统一返回 code 和 msg
     */
    FAILED(-100, "系统错误"),
    SUCCESS(0, "success"),
    UNAUTHORIZED(101, "获取登录用户信息失败"),
    PARAM_ERROR(102, "参数错误"),
    USER_NO_PERMITION(103, "当前用户无该接口权限"),
    ;

    private final int code;
    private final String msg;
}
