package com.zero.mmall.common;

/**
 * @author: zero
 * @description: []
 * @time: 2019-08-08
 * @version: []
 */
public interface Constants {

    String CURRENT_USER = "currentUser";
    String EMAIL = "email";
    String USERNAME = "username";

    interface Role{
        int ROLE_CUSTOMER = 0; //普通用户
        int ROLE_ADMIN = 1;//管理员
    }
}
