package com.qf.controller;

import com.qf.domain.Docter;
import com.qf.domain.Partment;
import com.qf.response.ResponseUser;
import com.qf.service.DoctorService;
import com.qf.service.PartmentService;
import com.qf.utils.EmailUtils;
import com.qf.utils.UploadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
    @Autowired
    private EmailUtils emailUtils;
    @Autowired
    private UploadUtils uploadUtils;
    @Autowired
    private PartmentService partmentService;


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

    @RequestMapping("/docterlogin")
    public Integer docterlogin(@RequestBody Docter docters){
        Docter docters1 = doctorService.selectByDname(docters.getDname());
        if (docters1 ==null){
            System.out.println("777");
            return null;
        }
        System.out.println(docters.getDname());
        System.out.println(docters.getPassword());
        System.out.println(docters1);
        if(docters.getPassword().equals(docters1.getPassword())){
            System.out.println("666");
            return docters1.getDid();
        }else{
            System.out.println("777");
            return null;
        }
    }

    @RequestMapping("/getcode")
    public String getCode(@RequestBody Docter email){
        String ainemail = email.getEmail();
        System.out.println(ainemail);
        String code = emailUtils.sendMail(ainemail);
        if (!(code.equals(""))){
            return code;
        }else{
            return null;
        }
    }

    @RequestMapping("/checkdname")
    public Integer checkdoctername(@RequestBody Docter dname){
        System.out.println(dname);
        Docter docters = doctorService.selectByDname(dname.getDname());
        if(docters !=null){
            return 0;
        }else{
            return 1;
        }
    }

    @RequestMapping("/uploadpic")
    public String uploadpic(@RequestParam MultipartFile file){
        System.out.println(file);
        String res = uploadUtils.upload(file);
        if (res!=null){
            System.out.println("666");
            System.out.println(res);
            return res;
        }else{
            System.out.println(res);
            return null;
        }
    }

    @RequestMapping("/docterregist")
    public Integer docterregist(@RequestBody Docter newdocter){
        Docter docteradd = doctorService.docteradd(newdocter);
        if(docteradd!=null){
            return 1;
        }else {
            return 0;
        }
    }

    @RequestMapping("/selectbydid")
    public Docter selectbydid(@RequestBody Docter did){
        Docter docters = doctorService.selectByDid(did.getDid());
        return docters;
    }

    @RequestMapping("/getpart")
    public String getpart(@RequestBody Partment pid){
        System.out.println(pid);
        Partment byPid = partmentService.findByPid(pid.getPid());
        return byPid.getName();
    }

    @RequestMapping("/docterupdate")
    public Integer docterupdate(@RequestBody Docter docter){
        Docter docter1 = doctorService.updateDocter(docter);
        if (docter1!=null){
            return 1;
        }else{
            return 0;
        }
    }


}
