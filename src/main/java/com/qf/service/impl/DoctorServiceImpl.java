package com.qf.service.impl;

import com.qf.dao.DoctorResponsitory;
import com.qf.domain.Docter;
import com.qf.domain.User;
import com.qf.response.ResponseUser;
import com.qf.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @PackageName:com.qf.service.impl;
 * @ClassName:DoctorServiceImpl;
 * @author:马浩雲
 * @date2019/10/716:45
 */
@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorResponsitory doctorResponsitory;



    @Override
    public ResponseUser DoctorFindAll(Integer page, Integer size) {
        PageRequest of = PageRequest.of(page - 1, size);

        Page<Docter> all = doctorResponsitory.findAll(of);

        List<Docter> content = all.getContent();
        long totalElements = all.getTotalElements();

        ResponseUser responseUser = new ResponseUser();
        responseUser.setList(content);
        responseUser.setTotal(totalElements);
        return responseUser;
    }

    @Override
    public Docter findById(Integer did) {
        Optional<Docter> byId = doctorResponsitory.findById(did);
        if (byId.isPresent()) {

            return byId.get();
        }
        return null;
    }

    @Override
    public Docter updateDate(Docter docter) {

        return doctorResponsitory.saveAndFlush(docter);
    }
}
