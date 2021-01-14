package com.hotlel.demo.controller;

import com.hotlel.demo.bean.common.JsonData;
import com.hotlel.demo.bean.entity.DetaitMsg;
import com.hotlel.demo.service.DetaitMsgService;
import com.hotlel.demo.util.FileReadName;
import com.hotlel.demo.util.FilesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
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

    @RequestMapping("uploadFile")
    public JsonData uploadFile(@RequestBody MultipartFile multipartFile){
        File file = FileReadName.readFiles(multipartFile);
//        String lastName = file.getName().substring(file.getName().lastIndexOf("."));
//        String fileName = UUID.randomUUID().toString() + lastName;
        StringBuffer url = new StringBuffer();

        try {
            String s = FilesUtils.fileUpload(file);
            url.append(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(url);
        return JsonData.success(url);
    }
}
