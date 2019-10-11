package com.qf.service.impl;

import com.qf.dao.HospitalRespository;
import com.qf.domain.Hospital;
import com.qf.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/9
 * @Time: 14:46
 */
@Service
public class HospitalServiceImpl implements HospitalService {
    @Autowired
    private HospitalRespository hospitalRespository;

    @Override
    public List<Hospital> findAllHospital() {
        return hospitalRespository.findAll();
    }

    @Override
    public Hospital insertHospital(Hospital hospital) {

        if(hospital.getH_name()!=""){
            Hospital hospital1 = hospitalRespository.save(hospital);
            return hospital1;
        }else {
            return null;
        }
    }

    @Override
    public Hospital updateHospital(Hospital hospital) {
        return hospitalRespository.saveAndFlush(hospital) ;
    }

    @Override
    public Hospital selectHospitalById(Integer hid) {
        Optional<Hospital> byId = hospitalRespository.findById(hid);
            if (byId.isPresent()){
                Hospital hospital2 = byId.get();

                return hospital2;
        }
        return  null;
    }

    @Override
    public void deleteHospital(Integer hid) {
        hospitalRespository.deleteById(hid);
    }
}
