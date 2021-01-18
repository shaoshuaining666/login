package com.hotlel.demo.service.impl;

import com.hotlel.demo.bean.entity.DetailMsg;
import com.hotlel.demo.mapper.DetaitMsgMapper;
import com.hotlel.demo.service.DetaitMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetaitMsgServiceImpl implements DetaitMsgService {

    @Autowired
    private DetaitMsgMapper detaitMsgMapper;

    @Override
    public void addDetaitMsg(DetailMsg detailMsg) {
        detaitMsgMapper.insert(detailMsg);
    }

    @Override
    public List<DetailMsg> getDetaitMsg() {
        return detaitMsgMapper.selectList(null);
    }

    @Override
    public void deleteDetaitMsg(Integer id) {
        detaitMsgMapper.deleteById(id);
    }

    @Override
    public void updateDetaitMsg(DetailMsg detailMsg) {
        detaitMsgMapper.updateById(detailMsg);
    }
}
