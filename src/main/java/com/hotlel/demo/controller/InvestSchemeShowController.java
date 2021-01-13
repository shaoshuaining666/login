package com.hotlel.demo.controller;

import com.hotlel.demo.bean.common.JsonData;
import com.hotlel.demo.bean.entity.InvestSchemeShow;
import com.hotlel.demo.service.InvestSchemeShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("investschemeshow")
@RestController
public class InvestSchemeShowController {

    @Autowired
    private InvestSchemeShowService investSchemeShowService;

    @RequestMapping("addInvestSchemeShow")
    public JsonData addInvestSchemeShow(InvestSchemeShow investSchemeShow){
        investSchemeShowService.addInvestSchemeShow(investSchemeShow);
        return JsonData.success();
    }

    @RequestMapping("getInvestSchemeShow")
    public JsonData getInvestSchemeShow(){
        List<InvestSchemeShow> investSchemeShowList = investSchemeShowService.getInvestSchemeShow();
        return JsonData.success(investSchemeShowList);
    }

    @RequestMapping("deleteInvestSchemeShow")
    public JsonData deleteInvestSchemeShow(Integer id){
        investSchemeShowService.deleteInvestSchemeShow(id);
        return JsonData.success();
    }

    @RequestMapping("updateInvestSchemeShow")
    public JsonData updateInvestSchemeShow(InvestSchemeShow investSchemeShow){
        investSchemeShowService.updateInvestSchemeShow(investSchemeShow);
        return JsonData.success();
    }
}
