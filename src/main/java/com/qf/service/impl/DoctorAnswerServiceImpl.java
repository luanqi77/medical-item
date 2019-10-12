package com.qf.service.impl;

import com.qf.dao.DoctorAnswerResponsitory;
import com.qf.domain.DoctorAnswer;
import com.qf.response.ResponseUser;
import com.qf.service.DoctorAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName:com.qf.service.impl;
 * @ClassName:DoctorAnswerServiceImpl;
 * @author:马浩雲
 * @date2019/10/910:59
 */
@Service
public class DoctorAnswerServiceImpl implements DoctorAnswerService {

    @Autowired
    private DoctorAnswerResponsitory doctorAnswerResponsitory;

    @Override
    public ResponseUser DoctorAnswerFindAll(Integer page, Integer size) {
        PageRequest of = PageRequest.of(page - 1, size);

        Page<DoctorAnswer> all = doctorAnswerResponsitory.findAll(of);

        List<DoctorAnswer> content = all.getContent();
        long totalElements = all.getTotalElements();

        ResponseUser responseUser = new ResponseUser();
        responseUser.setList(content);
        responseUser.setTotal(totalElements);
        return responseUser;
    }

    @Override
    public void delDoctorAnswerById(Integer aid) {
        if (aid != null) {

            doctorAnswerResponsitory.deleteById(aid);
        }
    }

    @Override
    public DoctorAnswer selectAnswer(Integer qid) {
        return doctorAnswerResponsitory.findDoctorAnswerByQid(qid);
    }

    @Override
    public List<DoctorAnswer> findByDid(Integer did) {
        return doctorAnswerResponsitory.findByDid(did);
    }

    @Override
    public DoctorAnswer addanswered(DoctorAnswer answer) {
        return doctorAnswerResponsitory.save(answer);
    }
}
