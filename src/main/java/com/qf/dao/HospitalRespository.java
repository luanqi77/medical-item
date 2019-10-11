package com.qf.dao;

import com.qf.domain.History;
import com.qf.domain.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/9
 * @Time: 14:34
 */
public interface HospitalRespository extends JpaRepository<Hospital,Integer> {
}
