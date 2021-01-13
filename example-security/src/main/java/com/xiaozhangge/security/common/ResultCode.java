package com.xiaozhangge.security.common;

import lombok.Getter;

/**
 * Created by xiaozhangge on 2019-03-25.
 */
@Getter
public enum ResultCode {

    /**
     * 请求返回状态码和说明信息
     */
    SUCCESS(200, "成功"),
    BAD_REQUEST(400, "参数或者语法不对"),
    UNAUTHORIZED(401, "认证失败"),
    LOGIN_ERROR(401, "登陆失败，用户名或密码错误"),
    NO_TOKEN(401, "认证失败，缺少头部token值"),
    NO_ROLE_RESOURCES(407, "认证失败，该用户没有角色信息"),
    TOKEN_INVALID(401, "认证失败，token值认证失败"),
    FORBIDDEN(403, "权限不足,禁止访问"),
    NOT_FOUND(404, "请求的资源不存在"),
    OPERATE_ERROR(405, "操作失败，请求操作的资源不存在"),
    TIME_OUT(408, "请求超时"),
    SERVER_ERROR(500, "服务器内部错误");

    private int code;
    private String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
