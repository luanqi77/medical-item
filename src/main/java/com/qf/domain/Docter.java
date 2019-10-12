package com.qf.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * @PackageName:com.qf.domain;
 * @ClassName:Docter;
 * @author:马浩雲
 * @date2019/10/70:27
 */
@Data
@Entity
@Table(name = "docter")
public class Docter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int did;
    private int pid;
    private String dname;
    private String password;
    private String sex;
    private Integer age;
    @Column(name="create_time")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date createTime;
    private Integer workyears;
    private String email;
    @Column(name="work_time")
    private Date workTime;

    private String pic;
    private String experience;
    private String realname;

}
