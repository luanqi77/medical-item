package com.qf.service.impl;

import com.qf.dao.YaoRespository;
import com.qf.domain.Yao;
import com.qf.service.YaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/8
 * @Time: 11:51
 */
@Service
public class YaoServiceImpl implements YaoService {
    @Autowired
    private YaoRespository yaoRespository;

    @Override
    public List<Yao> findAllYao() {
        return yaoRespository.findAll();
    }

    @Override
    public Yao insertYao(Yao yao) {
        //System.out.println(yao.getY_name()+"=------------------=");
        if(yao.getY_name()!=""){
            Yao save = yaoRespository.save(yao);
            return save;
        }else {
            return null;
        }
    }

    @Override
    public Yao updateYao(Yao yao) {
        return yaoRespository.saveAndFlush(yao);
    }

    @Override
    public Yao selectYaoById(Integer yid) {
        Optional<Yao> byId = yaoRespository.findById(yid);

        if (byId.isPresent()){
            Yao yao1 = byId.get();
            return yao1;
        }
         return  null;
    }

    @Override
    public void deleteYao(Yao yao) {
       yaoRespository.deleteById(yao.getYid());
    }
}
