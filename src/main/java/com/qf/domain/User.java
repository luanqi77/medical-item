package com.qf.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;
    private String username;
    private String password;
    private String name;
    private String sex;
    private Integer age;
    @Column(name = "create_time")
    private Date createTime;
    private String address;
    private String email;
    private String pic;
    private String code;

    private String checkPass;


}
