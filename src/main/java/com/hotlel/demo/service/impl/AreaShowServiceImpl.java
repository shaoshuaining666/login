package com.hotlel.demo.service.impl;

import com.hotlel.demo.bean.entity.AreaShow;
import com.hotlel.demo.mapper.AreaShowMapper;
import com.hotlel.demo.service.AreaShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaShowServiceImpl implements AreaShowService {

    @Autowired
    private AreaShowMapper areaShowMapper;

    @Override
    public void addProjectShow(AreaShow areaShow) {
        areaShowMapper.insert(areaShow);
    }

    @Override
    public List<AreaShow> getAreaShow() {
        return areaShowMapper.selectList(null);
    }

    @Override
    public void deleteAreaShow(Integer id) {
        areaShowMapper.deleteById(id);
    }

    @Override
    public void updateAreaShow(AreaShow areaShow) {
        areaShowMapper.updateById(areaShow);
    }
}
