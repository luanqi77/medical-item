package com.qf.service.impl;

import com.qf.dao.PartmentResponsitory;
import com.qf.domain.Partment;
import com.qf.response.ResponseUser;
import com.qf.service.PartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @PackageName:com.qf.service.impl;
 * @ClassName:PartmentServiceImpl;
 * @author:马浩雲
 * @date2019/10/820:02
 */
@Service
public class PartmentServiceImpl implements PartmentService {

    @Autowired
    private PartmentResponsitory partmentResponsitory;

    @Override
    public ResponseUser findAll(Integer page, Integer size) {
        PageRequest of = PageRequest.of(page - 1, size);

        Page<Partment> all = partmentResponsitory.findAll(of);

        if (all != null) {
            List<Partment> content = all.getContent();
            long totalElements = all.getTotalElements();

            ResponseUser responseUser = new ResponseUser();
            responseUser.setList(content);
            responseUser.setTotal(totalElements);
            return responseUser;
        }

        return null;
    }

    @Override
    public Partment findById(Integer pid) {
        Optional<Partment> byId = partmentResponsitory.findById(pid);
        if (byId.isPresent()) {
            return byId.get();
        }
        return null;
    }

    @Override
    public Partment updateDate(Partment partment) {
        return partmentResponsitory.saveAndFlush(partment);

    }

    @Override
    public List<Partment> findAll() {
        return partmentResponsitory.findAll();
    }

    @Override
    public Partment findByPid(Integer pid) {
        Optional<Partment> byId = partmentResponsitory.findById(pid);
        Partment partment = byId.get();
        return partment;
    }
}
