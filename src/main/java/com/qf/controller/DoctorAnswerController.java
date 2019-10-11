package com.qf.controller;

import com.qf.domain.DoctorAnswer;
import com.qf.response.ResponseUser;
import com.qf.service.DoctorAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @PackageName:com.qf.controller;
 * @ClassName:DoctorAnswerController;
 * @author:马浩雲
 * @date2019/10/910:29
 */
@RestController
public class DoctorAnswerController {

    @Autowired
    private DoctorAnswerService doctorAnswerService;

    @RequestMapping("DoctorAnswerFindAll/{page}/{size}")
    public ResponseUser DoctorAnswerFindAll(@PathVariable("page")Integer page, @PathVariable("size")Integer size){
        return doctorAnswerService.DoctorAnswerFindAll(page,size);
    }
    @RequestMapping("delDoctorAnswerById")
    public int delDoctorAnswerById(@RequestBody DoctorAnswer doctorAnswer){

        doctorAnswerService.delDoctorAnswerById(doctorAnswer.getAid());
        return 1;
    }
}
