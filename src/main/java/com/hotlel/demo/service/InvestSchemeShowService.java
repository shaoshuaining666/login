package com.hotlel.demo.service;

import com.hotlel.demo.bean.entity.InvestSchemeShow;

import java.util.List;

public interface InvestSchemeShowService {
    void addInvestSchemeShow(InvestSchemeShow investSchemeShow);

    List<InvestSchemeShow> getInvestSchemeShow();

    void deleteInvestSchemeShow(Integer id);

    void updateInvestSchemeShow(InvestSchemeShow investSchemeShow);
}
