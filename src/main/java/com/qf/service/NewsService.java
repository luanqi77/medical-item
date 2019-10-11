package com.qf.service;

import com.qf.domain.News;

import java.util.List;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/8
 * @Time: 19:01
 */

public interface NewsService {
    List<News> findAllNews();

    void deleteNews(Integer nid);

    Integer updateNews(News news);

    Integer insertNews(News news);

    News selectNewsById(Integer nid);
}
