package com.hotlel.demo.controller;

import com.hotlel.demo.bean.common.JsonData;
import com.hotlel.demo.bean.entity.AreaShow;
import com.hotlel.demo.service.AreaShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("areashow")
@RestController
public class AreaShowController {

    @Autowired
    private AreaShowService areaShowService;

    @RequestMapping("addAreaShow")
    public JsonData addAreaShow(AreaShow areaShow){
        areaShowService.addProjectShow(areaShow);
        return JsonData.success();
    }

    @RequestMapping("getAreaShow")
    public JsonData getAreaShow(){
        List<AreaShow> areaShowList = areaShowService.getAreaShow();
        return JsonData.success(areaShowList);
    }

    @RequestMapping("deleteAreaShow")
    public JsonData deleteAreaShow(Integer id){
        areaShowService.deleteAreaShow(id);
        return JsonData.success();
    }

    @RequestMapping("updateAreaShow")
    public JsonData updateAreaShow(AreaShow areaShow){
        areaShowService.updateAreaShow(areaShow);
        return JsonData.success();
    }
}
