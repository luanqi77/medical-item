package com.qf.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * @PackageName:com.qf.domain;
 * @ClassName:Admin;
 * @author:马浩雲
 * @date2019/10/70:48
 */
@Data
@Entity
@Table(name="admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    private int adminId;
    @Column(name = "admin_name")
    private String adminName;
    private String password;
    private String sex;
    private Integer age;
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    @Column(name="create_time")
    private Date createTime;

    private String pic;





}
