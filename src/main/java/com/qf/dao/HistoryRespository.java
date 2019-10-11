package com.qf.dao;

import com.qf.domain.History;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/9
 * @Time: 11:37
 */
public interface HistoryRespository extends JpaRepository<History,Integer> {
}
