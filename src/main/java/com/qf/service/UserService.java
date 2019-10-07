package com.qf.service;

import com.qf.domain.User;

public interface UserService {

    String login(User user);

    String sendMail(String email);

    String checkUsername(String username);

    User checkCode(String email);

    String regist(User user);
}
