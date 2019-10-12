package com.qf.dao;

import com.qf.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.Map;

@Mapper
public interface UserMapper {
    User findUserByUsername(String username);

    void deleteCodeByEmail(String sendTo);

    Integer findByUsername(String username);

    User checkCode(String email);

    void saveUser(User user);

    void updateUser(User user);

    void updatePic(User user);


}
