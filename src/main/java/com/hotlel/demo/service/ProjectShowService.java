package com.hotlel.demo.service;

import com.hotlel.demo.bean.entity.ProjectShow;

import java.util.List;

public interface ProjectShowService {
    void addProjectShow(ProjectShow projectShow);

    List<ProjectShow> getProjectShow();

    void deleteProjectShow(Integer id);

    void updateProjectShow(ProjectShow projectShow);
}
