package com.qf.dao;

import com.qf.domain.News;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description:
 * @Company: 憨憨互联
 * @Author: 张朝
 * @Date: 2019/10/8
 * @Time: 11:17
 */
public interface NewsResponsitory extends JpaRepository<News,Integer>{
    News findByNid(Integer nid);
}
