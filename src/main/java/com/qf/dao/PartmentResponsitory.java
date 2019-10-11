package com.qf.dao;

import com.qf.domain.Partment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @PackageName:com.qf.dao;
 * @ClassName:PartmentResponsitory;
 * @author:马浩雲
 * @date2019/10/820:01
 */
public interface PartmentResponsitory extends JpaRepository<Partment,Integer> {
}
