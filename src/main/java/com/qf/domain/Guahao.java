package com.qf.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/9
 * @Time: 14:59
 */
@Entity
@Data
@Table(name = "guahao")
public class Guahao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    private Integer uid;
    private String gname;
    private Integer age;

    private Date g_time;
    private String syn;
    private String department;
    private String g_doctor;
    private String status;
}
