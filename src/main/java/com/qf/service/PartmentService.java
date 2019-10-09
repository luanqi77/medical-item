package com.qf.service;


import com.qf.domain.Partment;
import com.qf.response.ResponseUser;


public interface PartmentService {
    ResponseUser findAll(Integer page, Integer size);
    Partment findById(Integer pid);
    Partment updateDate(Partment partment);
}
