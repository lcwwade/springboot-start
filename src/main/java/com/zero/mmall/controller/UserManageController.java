package com.zero.mmall.controller;

import com.zero.mmall.common.Constants;
import com.zero.mmall.common.ServerResponse;
import com.zero.mmall.pojo.User;
import com.zero.mmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 *
 * @author: zero
 * @description: user manage controller
 * @time: 2019-08-07
 * @version: []
 */
@Controller
@RequestMapping("/userManage")
public class UserManageController {

    @Resource
    public UserService userService;

    public ServerResponse<User> login(String username, String password, HttpSession session){
        ServerResponse<User> response = UserService.login(username,password);
        if(response.isSuccess()){
            User user = response.getData();
            if(user.getRole() == Constants.Role.ROLE_ADMIN){
                //说明登录的是管理员
                session.setAttribute(Constants.CURRENT_USER,user);
                return response;
            }else{
                return ServerResponse.createByErrorMessage("not Administrator,no login");
            }
        }
        return response;
    }


}
