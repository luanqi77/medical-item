package com.qf.controller;

import com.qf.domain.Docter;
import com.qf.domain.DoctorAnswer;
import com.qf.response.ResponseUser;
import com.qf.service.DoctorAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


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

    @RequestMapping("/getanswers")
    public List<DoctorAnswer> getanswers(@RequestBody Docter did){
        List<DoctorAnswer> byDid = doctorAnswerService.findByDid(did.getDid());
        return byDid;
    }

    @RequestMapping("/addanswered")
    public Integer addanswered(@RequestBody DoctorAnswer answer){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String createTime = df.format(new Date());// new Date()为获取当前系统时间
        Date date = null;
        try {
            date = df.parse(createTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        answer.setCreateTime(date);
        answer.setState("未阅读");
        DoctorAnswer addanswered = doctorAnswerService.addanswered(answer);
        if (addanswered!=null){
            return 1;
        }else{
            return 0;
        }

    }
}
