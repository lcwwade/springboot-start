package com.zero.gogo.controller;

import com.zero.gogo.common.Constants;
import com.zero.gogo.pojo.User;
import com.zero.gogo.common.ServerResponse;
import com.zero.gogo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * User controller
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

    public ServerResponse<User> login(String username, String password, HttpSession session) {
        // ServerResponse<User> response = UserService.login(username,password);
        ServerResponse<User> response = null;
        if (response.isSuccess()) {
            User user = response.getData();
            if (user.getRole() == Constants.Role.ROLE_ADMIN) {
                // 说明登录的是管理员
                session.setAttribute(Constants.CURRENT_USER, user);
                return response;
            } else {
                return ServerResponse.createByErrorMessage("not Administrator,no login");
            }
        }
        return response;
    }

}
