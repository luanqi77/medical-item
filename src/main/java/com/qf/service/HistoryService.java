package com.qf.service;

import com.qf.domain.History;
import com.qf.domain.Yao;

import java.util.List;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/9
 * @Time: 11:39
 */
public interface HistoryService {
    List<History> findAllHistory();

    History insertHistory(History history);

    History updateHistory(History history);

    History selectHistoryById(Integer hid);

    void deleteHistory(Integer hid);
}
