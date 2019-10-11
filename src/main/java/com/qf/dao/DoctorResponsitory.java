package com.qf.dao;

import com.qf.domain.Docter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorResponsitory extends JpaRepository<Docter,Integer> {

        Docter findDocterByDid(Integer did);
}
