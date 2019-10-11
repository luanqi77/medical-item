package com.qf.service.impl;

import com.qf.dao.NewsMapper;
import com.qf.domain.News;
import com.qf.service.NewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/8
 * @Time: 19:07
 */
@Service
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsMapper newsMapper;

    @Override
    public List<News> findAllNews() {
        return newsMapper.findAllNews();
    }

    @Override
    public void deleteNews(Integer nid) {
        newsMapper.deleteNews(nid);
    }

    @Override
    public Integer updateNews(News news) {
        Integer news1 = newsMapper.updateNews(news);
        return news1;
    }

    @Override
    public Integer insertNews(News news) {

        if(news.getTitle()!=""){
            Integer res=newsMapper.insertNews(news);
            return res;
        }else {
            return null;
        }
    }

    @Override
    public News selectNewsById(Integer nid) {
        return newsMapper.selectNewsById(nid);
    }


}
