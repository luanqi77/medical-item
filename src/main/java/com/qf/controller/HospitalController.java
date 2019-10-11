package com.qf.controller;

import com.qf.domain.History;
import com.qf.domain.Hospital;
import com.qf.response.ResponseUser;
import com.qf.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/9
 * @Time: 15:18
 */
@RestController
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;

    @RequestMapping("/findAllHospital")
    public List<Hospital> findAllHospital(){
        return hospitalService.findAllHospital();
    }

    @RequestMapping("/insertHospital")
    public Hospital insertHospital(@RequestBody Hospital hospital){
       return hospitalService.insertHospital(hospital);

    }

    @RequestMapping("deleteHospital")
    public void deleteHospital(@RequestBody Hospital hospital){
       hospitalService.deleteHospital(hospital.getHid());

    }

    @RequestMapping("selectHospitalById")
    public Hospital selectHospitalById(@RequestBody Hospital hospital){
        Hospital hospital1 = hospitalService.selectHospitalById(hospital.getHid());
        System.out.println(hospital1);
        return hospital1;
    }
    @RequestMapping("updateHospital")
    public Hospital updateHospital(@RequestBody Hospital hospital){
        return hospitalService.updateHospital(hospital);
    }

    @RequestMapping(value = "/selectHospital/{page}/{size}",method = RequestMethod.GET)
    public ResponseUser selectHospital(@PathVariable("page")Integer page, @PathVariable("size")Integer size){
        System.out.println(hospitalService.selectHospital(page,size));
        return hospitalService.selectHospital(page,size);
    }

}
