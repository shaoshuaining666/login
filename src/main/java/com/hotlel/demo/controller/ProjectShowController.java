package com.hotlel.demo.controller;

import com.hotlel.demo.bean.common.JsonData;
import com.hotlel.demo.bean.entity.ProjectShow;
import com.hotlel.demo.service.ProjectShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("projectshow")
@RestController
public class ProjectShowController {

    @Autowired
    private ProjectShowService projectShowService;

    @RequestMapping("addProjectShow")
    public JsonData addProjectShow(ProjectShow projectShow){
        projectShowService.addProjectShow(projectShow);
        return JsonData.success();
    }

    @RequestMapping("getProjectShow")
    public JsonData getProjectShow(){
        List<ProjectShow> projectShowList = projectShowService.getProjectShow();
        return JsonData.success(projectShowList);
    }

    @RequestMapping("deleteProjectShow")
    public JsonData deleteProjectShow(Integer id){
        projectShowService.deleteProjectShow(id);
        return JsonData.success();
    }

    @RequestMapping("updateProjectShow")
    public JsonData updateProjectShow(ProjectShow projectShow){
        projectShowService.updateProjectShow(projectShow);
        return JsonData.success();
    }
}
