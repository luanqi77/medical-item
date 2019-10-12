package com.qf.service;

import com.qf.domain.DoctorAnswer;
import com.qf.response.ResponseUser;

import java.util.List;

public interface DoctorAnswerService {
    ResponseUser DoctorAnswerFindAll(Integer page, Integer size);
    void delDoctorAnswerById(Integer aid);

    DoctorAnswer selectAnswer(Integer qid);

    List<DoctorAnswer> findByDid(Integer did);

    DoctorAnswer addanswered(DoctorAnswer answer);
}
