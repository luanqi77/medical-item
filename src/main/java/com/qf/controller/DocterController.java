package com.qf.controller;

import com.qf.domain.Docter;
import com.qf.response.ResponseUser;
import com.qf.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @PackageName:com.qf.controller;
 * @ClassName:DoctorController;
 * @author:马浩雲
 * @date2019/10/716:40
 */
@RestController
public class DocterController {

    @Autowired
    private DoctorService doctorService;


    @RequestMapping("/DocterFindAll/{page}/{size}")
    public ResponseUser DocterFindAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        return doctorService.DoctorFindAll(page, size);
    }

    @RequestMapping("/DoctorSelectById")
    public Docter DoctorSelectById(@RequestBody Docter docter) {
        // System.out.println(docter.getDid());
        return doctorService.findById(docter.getDid());
    }

    @RequestMapping("updateDoctor")
    public Docter updateDoctor(@RequestBody Docter docter) {
        return doctorService.updateDate(docter);
    }


}
