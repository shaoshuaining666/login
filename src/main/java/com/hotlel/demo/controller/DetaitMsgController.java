package com.hotlel.demo.controller;

import com.hotlel.demo.bean.common.JsonData;
import com.hotlel.demo.bean.entity.DetaitMsg;
import com.hotlel.demo.service.DetaitMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("detaitmsg")
@RestController
public class DetaitMsgController {

    @Autowired
    private DetaitMsgService detaitMsgService;

    @RequestMapping("addDetaitMsg")
    public JsonData addDetaitMsg(DetaitMsg detaitMsg){
        detaitMsgService.addDetaitMsg(detaitMsg);
        return JsonData.success();
    }

    @RequestMapping("getDetaitMsg")
    public JsonData getDetaitMsg(){
        List<DetaitMsg> detaitMsgList = detaitMsgService.getDetaitMsg();
        return JsonData.success(detaitMsgList);
    }

    @RequestMapping("deleteDetaitMsg")
    public JsonData deleteDetaitMsg(Integer id){
        detaitMsgService.deleteDetaitMsg(id);
        return JsonData.success();
    }

    @RequestMapping("updateDetaitMsg")
    public JsonData updateDetaitMsg(DetaitMsg detaitMsg){
        detaitMsgService.updateDetaitMsg(detaitMsg);
        return JsonData.success();
    }
}
