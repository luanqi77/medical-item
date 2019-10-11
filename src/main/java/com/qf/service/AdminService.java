package com.qf.service;

import com.qf.domain.Admin;

/**
 * @PackageName:com.qf.service;
 * @ClassName:AdminService;
 * @author:马浩雲
 * @date2019/10/71:01
 */
public interface AdminService {
   Admin findByName(String adminName);
}
