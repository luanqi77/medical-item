package com.qf.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/8
 * @Time: 11:26
 */
@Entity
@Table(name = "yao")
@Data
public class Yao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer yid;
    private String y_name;
    private String address;
    private String pic;
    private String des;
}
