package com.hotlel.demo.enums;

import lombok.Getter;

@Getter
public enum HotelEnum {
    PARAM_ERROR(1,"参数不合法!!"),

    DEV_USER_EXISTS(21,"开发者用户名已经存在!!"),

    DEV_USER_REGISTER_ERROR(22,"注册账号失败!!"),

    DEV_USER_ACTIVE_ERROR(23,"已经激活或者用户已经失效!!"),

    DEV_USER_NOT_EXISTS(24,"用户不存在!!"),
    DEV_USER_PASSWORD_ERROR(25,"用户名密码不正确"),
    DEV_USER_NOT_ACTIVE(26,"用户名未激活"),
    PIC_TOO_BIG(26,"图片过大了"),
    PIC_EXISTS(27,"图片不存在"),
    PIC_TYPE_ERROR(28,"图片类型错误"),
    PIC_ALREADY_BROKEN(29,"图片已将损坏"),
    APP_BASE_ADD_ERROR(30,"信息添加失败"),
    APK_EXIST(31,"图片不存在"),
    APK_BIG(32,"图片过大了"),
    APK_TYPE(33,"图片类型不匹配");




    private Integer code;

    private String msg;

    HotelEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
