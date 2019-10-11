package com.qf.service.impl;

import com.qf.dao.HistoryRespository;
import com.qf.domain.History;
import com.qf.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/9
 * @Time: 11:46
 */
@Service
public class HistoryServiceImpl implements HistoryService {
    @Autowired
    private HistoryRespository historyRespository;

    @Override
    public List<History> findAllHistory() {
        return historyRespository.findAll();
    }

    @Override
    public History insertHistory(History history) {
        if(history.getDescription()!=""){
            History history1 = historyRespository.save(history);
            return history1;
        }else {
            return null;
        }

    }

    @Override
    public History updateHistory(History history) {
        return historyRespository.saveAndFlush(history);
    }

    @Override
    public History selectHistoryById(Integer hid) {
        Optional<History> byId = historyRespository.findById(hid);
        if (byId.isPresent()){
            History history2 = byId.get();

            return history2;
        }
        return  null;
    }

    @Override
    public void deleteHistory(Integer hid) {
        historyRespository.deleteById(hid);
    }
}
