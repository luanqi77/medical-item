package com.qf.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/9
 * @Time: 14:26
 */
@Entity
@Data
@Table(name = "hospital")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hid;
    private String h_name;
    private String h_address;
    private String h_tel;
    private String doctor;
    private Integer beds;
    private String pic;
    private String description;
    private String level;
    private String special;
    private String comment;
}
