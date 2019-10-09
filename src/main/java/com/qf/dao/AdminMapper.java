package com.qf.dao;

import com.qf.domain.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * @PackageName:com.qf.dao;
 * @ClassName:AdminMapper;
 * @author:马浩雲
 * @date2019/10/79:12
 */
@Mapper
public interface AdminMapper {
    Admin findByName(String adminName);

}
