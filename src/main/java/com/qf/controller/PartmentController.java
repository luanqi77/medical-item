package com.qf.controller;

import com.qf.domain.Partment;
import com.qf.response.ResponseUser;
import com.qf.service.PartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @PackageName:com.qf.controller;
 * @ClassName:Partment;
 * @author:马浩雲
 * @date2019/10/819:57
 */
@RestController
public class PartmentController {

    @Autowired
    private PartmentService partmentService;


    @RequestMapping(value = "/partmentFindAll/{page}/{size}", method = RequestMethod.GET)
    public ResponseUser UserFindAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        //System.out.println("进来了");
        ResponseUser all = partmentService.findAll(page, size);
        //System.out.println(all);
        return all;
    }

    @RequestMapping(value = "/PartmentSelectById")
    public Partment UserSelectById(@RequestBody Partment partment) {
        // System.out.println(partment.getPid());
        // Partment byId = partmentService.findById(partment.getPid());
        // System.out.println(byId);
        //return byId;
        return partmentService.findById(partment.getPid());
    }
    @RequestMapping("updatePartment")
    public Partment updatePartment(@RequestBody Partment partment){
        return partmentService.updateDate(partment);

    }
}
