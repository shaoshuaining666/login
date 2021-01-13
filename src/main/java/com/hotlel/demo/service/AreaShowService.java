package com.hotlel.demo.service;

import com.hotlel.demo.bean.entity.AreaShow;

import java.util.List;

public interface AreaShowService {
    void addProjectShow(AreaShow areaShow);

    List<AreaShow> getAreaShow();

    void deleteAreaShow(Integer id);

    void updateAreaShow(AreaShow areaShow);
}
