package com.hotlel.demo.controller;

import com.hotlel.demo.bean.common.JsonData;
import com.hotlel.demo.bean.entity.DetailMsg;
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

   /* @RequestMapping("addDetaitMsg")
    public JsonData addDetaitMsg(DetailMsg detaitMsg){
        return JsonData.success();
    }*/

    @RequestMapping("getDetaitMsg")
    public JsonData getDetaitMsg(){
        List<DetailMsg> detailMsgList = detaitMsgService.getDetaitMsg();
        return JsonData.success(detailMsgList);
    }

    @RequestMapping("deleteDetaitMsg")
    public JsonData deleteDetaitMsg(Integer id){
        detaitMsgService.deleteDetaitMsg(id);
        return JsonData.success();
    }

    @RequestMapping("updateDetaitMsg")
    public JsonData updateDetaitMsg(DetailMsg detailMsg){
        detaitMsgService.updateDetaitMsg(detailMsg);
        return JsonData.success();
    }

    @RequestMapping("addDetaitMsg")
    public JsonData uploadFile(@RequestBody MultipartFile photo, DetailMsg detailMsg){
        File file = FileReadName.readFiles(photo);

        try {
            String s = FilesUtils.fileUpload(file);
            detailMsg.setPhoto(s);
            detaitMsgService.addDetaitMsg(detailMsg);
            System.out.println(s);
            return JsonData.success(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return JsonData.success("上传OSS失败");
    }
}
