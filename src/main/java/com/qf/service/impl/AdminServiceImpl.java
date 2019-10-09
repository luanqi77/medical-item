package com.qf.service.impl;

import com.qf.dao.AdminMapper;
import com.qf.dao.AdminResponsitory;
import com.qf.domain.Admin;
import com.qf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @PackageName:com.qf.service.impl;
 * @ClassName:AdminServiceImpl;
 * @author:马浩雲
 * @date2019/10/71:02
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Override
    public Admin findByName(String adminName) {
        return adminMapper.findByName(adminName);
    }
}
