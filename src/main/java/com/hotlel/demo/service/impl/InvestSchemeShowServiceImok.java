package com.hotlel.demo.service.impl;

import com.hotlel.demo.bean.entity.InvestSchemeShow;
import com.hotlel.demo.mapper.InvestSchemeShowMapper;
import com.hotlel.demo.service.InvestSchemeShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestSchemeShowServiceImok implements InvestSchemeShowService {

    @Autowired
    private InvestSchemeShowMapper investSchemeShowMapper;


    @Override
    public void addInvestSchemeShow(InvestSchemeShow investSchemeShow) {
        investSchemeShowMapper.insert(investSchemeShow);
    }

    @Override
    public List<InvestSchemeShow> getInvestSchemeShow() {
        return investSchemeShowMapper.selectList(null);
    }

    @Override
    public void deleteInvestSchemeShow(Integer id) {
        investSchemeShowMapper.deleteById(id);
    }

    @Override
    public void updateInvestSchemeShow(InvestSchemeShow investSchemeShow) {
        investSchemeShowMapper.updateById(investSchemeShow);
    }
}
