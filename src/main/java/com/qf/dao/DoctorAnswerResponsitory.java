package com.qf.dao;

import com.qf.domain.DoctorAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorAnswerResponsitory extends JpaRepository<DoctorAnswer,Integer> {
}
