package com.hotlel.demo.bean.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName(value = "detail_msg")
public class DetailMsg {

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
    @TableField(value = "start_money")
    private BigDecimal startMoney;

    //项目介绍id
    @TableField(value = "project_show_id")
    private Integer projectShowId;

    //品牌故事
    @TableField(value = "brand_story")
    private String brandStory;

    //地理位置id
    private Integer areaId;

    //信息披露
    @TableField(value = "message_announce")
    private String messageAnnounce;

    //投资方案id
    @TableField(value = "invest_scheme_id")
    private Integer investSchemeId;

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

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getMessageAnnounce() {
        return messageAnnounce;
    }

    public void setMessageAnnounce(String messageAnnounce) {
        this.messageAnnounce = messageAnnounce;
    }

    public BigDecimal getStartMoney() {
        return startMoney;
    }

    public void setStartMoney(BigDecimal startMoney) {
        this.startMoney = startMoney;
    }

    public Integer getProjectShowId() {
        return projectShowId;
    }

    public void setProjectShowId(Integer projectShowId) {
        this.projectShowId = projectShowId;
    }

    public String getBrandStory() {
        return brandStory;
    }

    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory;
    }

    public Integer getInvestSchemeId() {
        return investSchemeId;
    }

    public void setInvestSchemeId(Integer investSchemeId) {
        this.investSchemeId = investSchemeId;
    }
}
