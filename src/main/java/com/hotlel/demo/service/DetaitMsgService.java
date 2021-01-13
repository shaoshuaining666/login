package com.hotlel.demo.service;

import com.hotlel.demo.bean.entity.DetaitMsg;

import java.util.List;

public interface DetaitMsgService {
    void addDetaitMsg(DetaitMsg detaitMsg);

    List<DetaitMsg> getDetaitMsg();

    void deleteDetaitMsg(Integer id);

    void updateDetaitMsg(DetaitMsg detaitMsg);
}
