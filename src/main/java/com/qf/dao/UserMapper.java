package com.qf.dao;

import com.qf.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findUserByUsername(String username);

    void deleteCodeByEmail(String sendTo);

    Integer findByUsername(String username);

    User checkCode(String email);

    void saveUser(User user);

    void updateUser(User user);
}
