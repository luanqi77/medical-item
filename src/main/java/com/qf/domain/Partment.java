package com.qf.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @PackageName:com.qf.domain;
 * @ClassName:Partment;
 * @author:马浩雲
 * @date2019/10/819:59
 */
@Entity
@Table(name="partment")
@Data
public class Partment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;
    private String name;
}
