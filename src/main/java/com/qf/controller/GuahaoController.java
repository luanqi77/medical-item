package com.qf.controller;

import com.qf.domain.Guahao;
import com.qf.domain.History;
import com.qf.domain.User;
import com.qf.service.GuahaoService;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Company: Facebook
 * @Author: 高健
 * @Date: 2019/10/9
 * @Time: 15:28
 */
@RestController
public class GuahaoController {
    @Autowired
    private GuahaoService guahaoService;
    @Autowired
    private UserService userService;
    @RequestMapping("/findAllGuahao")
    public List<Guahao> findAllGuahao(){
        return guahaoService.findAllGuahao();
    }

    @RequestMapping("/insertGuahao")
    public Guahao insertGuahao(@RequestBody Guahao guahao){
       return guahaoService.insertGuahao(guahao);
    }

    @RequestMapping("deleteGuahao")
    public void deleteHistory(@RequestBody Guahao guahao){
     guahaoService.deleteGuahao(guahao);
    }

    @RequestMapping("selectGuahaoById")
    public Guahao selectById(@RequestBody Guahao guahao){
        Guahao guahao1 = guahaoService.selectGuahaoById(guahao.getGid());
        System.out.println(guahao1);
        return guahao1;
    }
    @RequestMapping("updateGuahao")
    public Guahao updateGuahao(@RequestBody Guahao guahao){
        return guahaoService.updateGuahao(guahao);
    }

    @RequestMapping("/insertOneGuahao")
    public String insertOneGuahao(@RequestBody Guahao guahao){
        return guahaoService.insertOneGuahao(guahao);
    }

}
