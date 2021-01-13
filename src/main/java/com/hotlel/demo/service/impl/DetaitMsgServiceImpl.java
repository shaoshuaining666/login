package com.hotlel.demo.service.impl;

import com.hotlel.demo.bean.entity.DetaitMsg;
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
    public void addDetaitMsg(DetaitMsg detaitMsg) {
        detaitMsgMapper.insert(detaitMsg);
    }

    @Override
    public List<DetaitMsg> getDetaitMsg() {
        return detaitMsgMapper.selectList(null);
    }

    @Override
    public void deleteDetaitMsg(Integer id) {
        detaitMsgMapper.deleteById(id);
    }

    @Override
    public void updateDetaitMsg(DetaitMsg detaitMsg) {
        detaitMsgMapper.updateById(detaitMsg);
    }
}
