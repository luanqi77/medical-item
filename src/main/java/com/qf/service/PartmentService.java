package com.qf.service;


import com.qf.domain.Partment;
import com.qf.response.ResponseUser;

import java.util.List;


public interface PartmentService {
    ResponseUser findAll(Integer page, Integer size);
    Partment findById(Integer pid);
    Partment updateDate(Partment partment);
    public List<Partment> findAll();

    Partment findByPid(Integer pid);
}
