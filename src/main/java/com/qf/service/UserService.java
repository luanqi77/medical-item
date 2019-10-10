package com.qf.service;

import com.qf.domain.User;
import com.qf.response.ResponseUser;

public interface UserService {

    String login(User user);

    String sendMail(String email);

    String checkUsername(String username);

    User checkCode(String email);

    String regist(User user);

    User selectOne(String username);

    String updateUser(User user);

    Integer selectUid(String username);

    //马浩雲写service部分
    ResponseUser UserFindAll(Integer page, Integer size);
    User UserSelectById(Integer userId);
    User  updateData(User user);


    //马浩雲写service部分__________
}
