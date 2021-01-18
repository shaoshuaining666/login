package com.hotlel.demo.bean.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "area_show")
public class AreaShow {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    //城市
    private String city;

    //详细地址
    @TableField(value = "detail_area")
    private String detailArea;

    //经度
    private String longitude;

    //纬度
    private String latitude;

    //项目周边
    @TableField(value = "project_surroundings")
    private String projectSurroundings;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDetailArea() {
        return detailArea;
    }

    public void setDetailArea(String detailArea) {
        this.detailArea = detailArea;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getProjectSurroundings() {
        return projectSurroundings;
    }

    public void setProjectSurroundings(String projectSurroundings) {
        this.projectSurroundings = projectSurroundings;
    }
}
