package com.qf.controller;

import com.qf.domain.Yao;
import com.qf.service.YaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/8
 * @Time: 11:43
 */
@RestController
public class YaoController {
    @Autowired
    private YaoService yaoService;

    @RequestMapping("/findAllYao")
    public List<Yao> findAllYao(){
        return yaoService.findAllYao();
    }
    @RequestMapping("/insertYao")
    Yao insert(@RequestBody Yao yao){
//        System.out.println(yao);
        Yao yao1 = yaoService.insertYao(yao);
        System.out.println(yao1);
        return yao1;
    }
    @RequestMapping("deleteYao")
    public void delete(@RequestBody Yao yao){
        System.out.println(yao);
         yaoService.deleteYao(yao);
    }
    @RequestMapping("selectYaoById")
    public Yao selectYaoById(@RequestBody Yao yao){
        Yao yao1 = yaoService.selectYaoById(yao.getYid());
        System.out.println(yao1);
        return yao1;
    }
    @RequestMapping("updateYao")
    public Yao updateYao(@RequestBody Yao yao){
        return yaoService.updateYao(yao);
    }

    @RequestMapping("/findYao")
    public List<Yao> findAll(){
        List<Yao> all = yaoService.findAll();
        System.out.println(all);
        return all;
    }
}
