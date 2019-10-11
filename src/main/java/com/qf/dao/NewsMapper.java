package com.qf.dao;

import com.qf.domain.News;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/8
 * @Time: 17:16
 */
@Mapper
public interface NewsMapper {
    List<News> findAllNews();

    Integer insertNews(News news);

    void deleteNews(Integer nid);

    Integer updateNews(News news);

    News selectNewsById(Integer nid);

}
