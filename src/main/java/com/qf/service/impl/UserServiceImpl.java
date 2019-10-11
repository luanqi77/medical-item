package com.qf.service.impl;

import com.qf.dao.UserMapper;
import com.qf.domain.User;
import com.qf.service.UserService;
import com.qf.utils.EmailUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Autowired
    private EmailUtils emailUtils;

    @Override
    public String login(User user) {

        try {
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
            subject.login(token);
            if (subject.isAuthenticated()){
                return "main";
            }else {
                return "fail";
            }
        } catch (Exception e) {
            System.out.println("登录失败，密码错误");
            e.printStackTrace();
        }
        return "login";
    }

    @Override
    public String sendMail(String email) {
        String s = emailUtils.sendMail(email);
            if (!s.isEmpty()){
                return "success";
            }
             return "fail";
    }

    @Override
    public String checkUsername(String username) {
        Integer byUsername = userMapper.findByUsername(username);
        if (byUsername==0){
            return "yes";
        }
        return "no";
    }

    @Override
    public User checkCode(String email) {
        return userMapper.checkCode(email);
    }

    @Override
    public String regist(User user) {
        if (user.getUsername()!=null&&!user.getUsername().isEmpty()){
            Integer byUsername = userMapper.findByUsername(user.getUsername());
            User user1 = userMapper.checkCode(user.getEmail());
            if (user.getCode().equals(user1.getCode())){
                if (byUsername==0){

                    ByteSource source = ByteSource.Util.bytes(user.getUsername());
                    SimpleHash simpleHash=new SimpleHash("MD5",user.getPassword(),source,1024);
                    user.setPassword(simpleHash.toString());
                    userMapper.updateUser(user);
                    return "success";
                }
            }
        }
                return "fail";
    }
}