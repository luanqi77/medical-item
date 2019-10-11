package com.qf.service;

import com.qf.domain.Docter;
import com.qf.response.ResponseUser;

public interface DoctorService {
    ResponseUser DoctorFindAll(Integer page, Integer size);
    Docter findById(Integer did);
    Docter updateDate(Docter docter);

    Docter selectDocter(Integer did);
}
