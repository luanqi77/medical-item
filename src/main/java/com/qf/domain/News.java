package com.qf.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/8
 * @Time: 17:03
 */
@Data
public class News {
   // @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nid;

    private String title;

    private String text;

//    @DateTimeFormat(pattern = "yyyy/MM/dd")
    //@Column(name = "create_time")
    private Date createTime;

    private String author;
}
