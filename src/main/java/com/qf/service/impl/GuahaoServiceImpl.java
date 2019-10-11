package com.qf.service.impl;

import com.qf.dao.GuahaoRespository;
import com.qf.dao.UserResponsitory;
import com.qf.domain.Guahao;
import com.qf.domain.User;
import com.qf.service.GuahaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/9
 * @Time: 15:09
 */
@Service
public class GuahaoServiceImpl implements GuahaoService {
    @Autowired
    private GuahaoRespository guahaoRespository;
    @Autowired
    private UserResponsitory userResponsitory;
    @Override
    public List<Guahao> findAllGuahao() {
        return guahaoRespository.findAll();
    }

    @Override
    public Guahao insertGuahao(Guahao guahao) {
        if(guahao.getDepartment()!=""){
            Guahao guahao2 = guahaoRespository.save(guahao);
            return guahao2;
        }else {
            return null;
        }
    }

    @Override
    public Guahao updateGuahao(Guahao guahao) {
        return guahaoRespository.saveAndFlush(guahao);
    }

    @Override
    public Guahao selectGuahaoById(Integer gid) {
        Optional<Guahao> byId = guahaoRespository.findById(gid);
        if (byId.isPresent()){
            Guahao guahao1 = byId.get();

            return guahao1;
        }
        return  null;
    }

    @Override
    public void deleteGuahao(Guahao guahao) {
        guahaoRespository.deleteById(guahao.getGid());
    }

    @Override
    public String insertOneGuahao(Guahao guahao) {
        if (!guahao.getGname().isEmpty()){
            Guahao save = guahaoRespository.save(guahao);
            return "ok";
        }else {
            return "fail";
        }

    }

}
