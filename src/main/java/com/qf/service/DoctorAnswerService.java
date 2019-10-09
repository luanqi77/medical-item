package com.qf.service;

import com.qf.response.ResponseUser;

public interface DoctorAnswerService {
    ResponseUser DoctorAnswerFindAll(Integer page,Integer size);
    void delDoctorAnswerById(Integer aid);
}
