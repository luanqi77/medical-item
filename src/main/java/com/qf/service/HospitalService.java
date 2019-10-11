package com.qf.service;



import com.qf.domain.Hospital;
import com.qf.response.ResponseUser;

import java.util.List;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/9
 * @Time: 14:36
 */
public interface HospitalService {
    List<Hospital> findAllHospital();

    Hospital insertHospital(Hospital hospital);

    Hospital updateHospital(Hospital hospital);

    Hospital selectHospitalById(Integer hid);

    void deleteHospital(Integer hid);

    ResponseUser selectHospital(Integer page, Integer size);
}
