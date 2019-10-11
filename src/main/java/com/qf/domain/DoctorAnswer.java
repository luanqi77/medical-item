package com.qf.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * @PackageName:com.qf.domain;
 * @ClassName:DoctorAnswer;
 * @author:马浩雲
 * @date2019/10/910:24
 */
@Entity
@Table(name="doctor_answer")
@Data
public class DoctorAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer aid;

    private Integer did;

    private String  answer;

    @Column(name="create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    private String state;

    private  Integer uid;
    private  Integer qid;

}
