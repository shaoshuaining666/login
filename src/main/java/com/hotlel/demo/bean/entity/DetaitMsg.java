package com.hotlel.demo.bean.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName(value = "detaitmsg")
public class DetaitMsg {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    //图片
    private String photo;

    //状态     1：预约中 0：认购中
    private Integer status;

    //状态截止日期
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date datetime;

    //名称
    private String name;

    //介绍
    private String introduce;

    //预约进度
    private Double course;

    //目标
    private BigDecimal target;

    //已预约
    private BigDecimal reserevd;

    //起投金额
    private BigDecimal startmoney;

    //项目介绍id
    private Integer projectshowId;

    //品牌故事
    private String brandstory;

    //地理位置id
    private Integer areaId;

    //信息披露
    private String messagep;

    //投资方案id
    private Integer investschemeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Double getCourse() {
        return course;
    }

    public void setCourse(Double course) {
        this.course = course;
    }

    public BigDecimal getTarget() {
        return target;
    }

    public void setTarget(BigDecimal target) {
        this.target = target;
    }

    public BigDecimal getReserevd() {
        return reserevd;
    }

    public void setReserevd(BigDecimal reserevd) {
        this.reserevd = reserevd;
    }

    public BigDecimal getStartmoney() {
        return startmoney;
    }

    public void setStartmoney(BigDecimal startmoney) {
        this.startmoney = startmoney;
    }

    public Integer getProjectshowId() {
        return projectshowId;
    }

    public void setProjectshowId(Integer projectshowId) {
        this.projectshowId = projectshowId;
    }

    public String getBrandstory() {
        return brandstory;
    }

    public void setBrandstory(String brandstory) {
        this.brandstory = brandstory;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getMessagep() {
        return messagep;
    }

    public void setMessagep(String messagep) {
        this.messagep = messagep;
    }

    public Integer getInvestschemeId() {
        return investschemeId;
    }

    public void setInvestschemeId(Integer investschemeId) {
        this.investschemeId = investschemeId;
    }
}
