package com.qf.response;

import lombok.Data;

import java.util.List;

/**
 * @PackageName:com.itqf.response;
 * @ClassName:ResponseUser;
 * @author:马浩雲
 * @date2019/9/2519:20
 */
@Data
public class ResponseUser<T> {
    private List<T> list;
    private Long total;
}
