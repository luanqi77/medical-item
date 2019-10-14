package com.qf.controller;

import com.qf.domain.Admin;
import com.qf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @PackageName:com.qf.controller;
 * @ClassName:AdminController;
 * @author:马浩雲
 * @date2019/10/70:54
 */
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/adminLogin", method = RequestMethod.POST)
    public String login(@RequestBody Admin admin ) {
        Admin byName = adminService.findByName(admin.getAdminName());
        if (byName != null) {
            String password = byName.getPassword();
            if (password != null) {
                if (admin.getPassword().equals(password)) {
                    return "ok";
                }
            }
        }
        return "账号密码错误！";
    }

}
