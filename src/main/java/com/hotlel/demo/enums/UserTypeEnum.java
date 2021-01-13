package com.hotlel.demo.enums;

/**
 * Create By LB on 2020/7/15.
 */
public enum UserTypeEnum {

    WEI_XIN_USER(1, "普通用户"),
    BACKEND_MANAGER(2, "管理员");

    private int userType;

    private String desc;

    UserTypeEnum(int userType, String desc) {
        this.userType = userType;
        this.desc = desc;
    }

    public int getUserType() {
        return userType;
    }

    public String getDesc() {
        return desc;
    }
}
