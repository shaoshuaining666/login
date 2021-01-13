package com.hotlel.demo.service.impl;

import com.hotlel.demo.bean.entity.ProjectShow;
import com.hotlel.demo.mapper.ProjectShowMapper;
import com.hotlel.demo.service.ProjectShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectShowServiceImpl implements ProjectShowService {

    @Autowired
    private ProjectShowMapper projectShowMapper;


    @Override
    public void addProjectShow(ProjectShow projectShow) {
        projectShowMapper.insert(projectShow);
    }

    @Override
    public List<ProjectShow> getProjectShow() {
        return projectShowMapper.selectList(null);
    }

    @Override
    public void deleteProjectShow(Integer id) {
        projectShowMapper.deleteById(id);
    }

    @Override
    public void updateProjectShow(ProjectShow projectShow) {
        projectShowMapper.updateById(projectShow);
    }
}
