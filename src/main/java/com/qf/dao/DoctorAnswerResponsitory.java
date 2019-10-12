package com.qf.dao;

import com.qf.domain.DoctorAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorAnswerResponsitory extends JpaRepository<DoctorAnswer,Integer> {
    DoctorAnswer findDoctorAnswerByQid(Integer qid);

    List<DoctorAnswer> findByDid(Integer did);

}
