package com.qf.controller;

import com.qf.domain.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.nio.cs.US_ASCII;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestBody User user){
        return userService.login(user);
    }

    @RequestMapping("/sendMail")
    public String sendMail(@RequestParam("email") String email){
        if (!email.isEmpty()){
            return userService.sendMail(email);
        }
            return "fail";
    }

    @RequestMapping("/checkUsername")
    public String checkUsername(@RequestBody User user){
        return userService.checkUsername(user.getUsername());
    }

    @RequestMapping("/checkCode")
    public String checkCode(@RequestBody User user){
        if (!user.getEmail().isEmpty()){
        User user1 = userService.checkCode(user.getEmail());
            if (user.getCode().equals(user1.getCode())){
                return "yes";
            }
            return  "no";
            }
        return  "no";
    }

    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    public String regist(@RequestBody User user){
        return userService.regist(user);
    }

}