package com.qf.utils;


import com.qf.dao.UserMapper;
import com.qf.dao.UserResponsitory;
import com.qf.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Random;

@Component
public class EmailUtils {
    @Value("594138543@qq.com")
    private String from;
    @Resource
    private JavaMailSender javaMailSender;
    @Resource
    private UserMapper userMapper;
    @Autowired
    private UserResponsitory userResponsitory;
    public String sendMail(String sendTo){

            SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
            simpleMailMessage.setSubject("注册验证码");
            String code=randomCode();
            simpleMailMessage.setText(code);
            simpleMailMessage.setFrom(from);
            simpleMailMessage.setTo(sendTo);

        try {
            javaMailSender.send(simpleMailMessage);
            User user=new User();
            user.setCode(code);
            user.setEmail(sendTo);

            userMapper.deleteCodeByEmail(sendTo);
            userResponsitory.save(user);
            return  code;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String randomCode(){
        Random random=new Random();
        StringBuffer str=new StringBuffer();
        for (int i=0;i<6;i++){
            int i1 = random.nextInt(9);
            str.append(i1);
        }
        return str.toString();
    }
}
