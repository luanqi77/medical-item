package com.qf.controller;

import com.qf.domain.History;
import com.qf.domain.Yao;
import com.qf.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/9
 * @Time: 11:58
 */
@RestController
public class HistoryController {
    @Autowired
    private HistoryService historyService;

    @RequestMapping("/findAllHistory")
    public List<History> findAllHistory(){
        return historyService.findAllHistory();
    }

    @RequestMapping("/insertHistory")
    public History insertHistory(@RequestBody History history){
      return historyService.insertHistory(history);
    }

    @RequestMapping("deleteHistory")
    public void deleteHistory(@RequestBody History history){
        System.out.println(history);
        historyService.deleteHistory(history.getHid());
    }

    @RequestMapping("selectHistoryById")
    public History selectById(@RequestBody History history){
        History history1 = historyService.selectHistoryById(history.getHid());
        System.out.println(history1);
        return history1;
    }
    @RequestMapping("updateHistory")
    public History updateHistory(@RequestBody History history){
        return historyService.updateHistory(history);
    }
}
