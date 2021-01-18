package com.hotlel.demo.service;

import com.hotlel.demo.bean.entity.DetailMsg;

import java.util.List;

public interface DetaitMsgService {
    void addDetaitMsg(DetailMsg detailMsg);

    List<DetailMsg> getDetaitMsg();

    void deleteDetaitMsg(Integer id);

    void updateDetaitMsg(DetailMsg detailMsg);
}
