package com.qf.service;

import com.qf.domain.Guahao;

import java.util.List;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/9
 * @Time: 15:06
 */
public interface GuahaoService {
    List<Guahao> findAllGuahao();

    Guahao insertGuahao(Guahao guahao);

    Guahao updateGuahao(Guahao guahao);

    Guahao selectGuahaoById(Integer gid);

    void deleteGuahao(Guahao guahao);
}
