package com.qf.controller;

import com.qf.domain.News;
import com.qf.service.NewsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/8
 * @Time: 19:17
 */
@RestController
public class NewsController {

    @Autowired
    private NewsService newsService;


    @RequestMapping("/findAllNews")
    public List<News> findAllNews(){
        return newsService.findAllNews();
    }

    @RequestMapping("/insertNews")//增加数据
    public Integer insertNews(@RequestBody News news){
        System.out.println(news);
        Integer hsa=newsService.insertNews(news);

        return  hsa;

    }

    @RequestMapping("/deleteNews")//删除
    public void deleteNews(@RequestBody News news){
        newsService.deleteNews(news.getNid());
    }

    @RequestMapping("/selectNewsById")
    public News selectNewsById(@RequestBody News news){

        News news1 = newsService.selectNewsById(news.getNid());
        System.out.println(news1);
        return news1;
    }

    @RequestMapping(value = "/updateNews",method = RequestMethod.POST)//修改
    public Integer updateNews(@RequestBody News news){
        Integer integer = newsService.updateNews(news);
        return integer;
    }

}
