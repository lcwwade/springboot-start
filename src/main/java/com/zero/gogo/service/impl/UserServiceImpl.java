package com.zero.gogo.service.impl;

import com.zero.gogo.pojo.User;
import com.zero.gogo.service.UserService;
import com.zero.gogo.util.MD5Util;
import com.zero.gogo.common.ServerResponse;
import org.springframework.stereotype.Service;

/**
 * @author: zero
 * @description: []
 * @time: 2019-08-08
 * @version: []
 */
@Service
public class UserServiceImpl implements UserService {


    @Override
    public ServerResponse<User> login(String username, String password) {
        //int resultCount = userMapper.checkUsername(username);
        //模拟
        int resultCount = 0;
        if(resultCount == 0 ){
            return ServerResponse.createByErrorMessage("用户名不存在");
        }

        String md5Password = MD5Util.MD5EncodeUtf8(password);
//        User user  = userMapper.selectLogin(username,md5Password);
        User user  = new User();
        if(user == null){
            return ServerResponse.createByErrorMessage("密码错误");
        }

        user.setPassword(org.apache.commons.lang3.StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功",user);
    }

    @Override
    public ServerResponse<String> register(User user) {
        return null;
    }

    @Override
    public ServerResponse<String> checkValid(String str, String type) {
        return null;
    }

    @Override
    public ServerResponse selectQuestion(String username) {
        return null;
    }

    @Override
    public ServerResponse<String> checkAnswer(String username, String question, String answer) {
        return null;
    }

    @Override
    public ServerResponse<String> forgetResetPassword(String username, String passwordNew, String forgetToken) {
        return null;
    }

    @Override
    public ServerResponse<String> resetPassword(String passwordOld, String passwordNew, User user) {
        return null;
    }

    @Override
    public ServerResponse<User> updateInformation(User user) {
        return null;
    }

    @Override
    public ServerResponse<User> getInformation(Integer userId) {
        return null;
    }

    @Override
    public ServerResponse checkAdminRole(User user) {
        return null;
    }
}
