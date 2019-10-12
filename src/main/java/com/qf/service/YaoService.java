package com.qf.service;

import com.qf.domain.Yao;

import java.util.List;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/8
 * @Time: 11:50
 */

public interface YaoService {
    List<Yao> findAllYao();

    Yao insertYao(Yao yao);

    Yao updateYao(Yao yao);

    Yao selectYaoById(Integer yid);

    void deleteYao(Yao yao);

    public List<Yao> findAll();
}
