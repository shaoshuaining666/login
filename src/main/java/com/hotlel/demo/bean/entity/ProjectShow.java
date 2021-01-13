package com.hotlel.demo.bean.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName(value = "projectshow")
public class ProjectShow {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    //公司
    private String company;

    //项目估值
    private BigDecimal valueofmoney;

    //筹集规模
    private BigDecimal raisescale;

    //起投金额
    private BigDecimal minmoney;

    //每人限投
    private BigDecimal maxmoney;

    //投资期限
    private String investortime;

    //提前退出窗口期
    private String earlyexit;

    //方案id
    private Integer investschemeId;

    //建筑状况id
    private Integer housestatusId;

    //项目特色
    private String projectfea;

    //风控措施
    private String riskmeasure;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public BigDecimal getValueofmoney() {
        return valueofmoney;
    }

    public void setValueofmoney(BigDecimal valueofmoney) {
        this.valueofmoney = valueofmoney;
    }

    public BigDecimal getRaisescale() {
        return raisescale;
    }

    public void setRaisescale(BigDecimal raisescale) {
        this.raisescale = raisescale;
    }

    public BigDecimal getMinmoney() {
        return minmoney;
    }

    public void setMinmoney(BigDecimal minmoney) {
        this.minmoney = minmoney;
    }

    public BigDecimal getMaxmoney() {
        return maxmoney;
    }

    public void setMaxmoney(BigDecimal maxmoney) {
        this.maxmoney = maxmoney;
    }

    public String getInvestortime() {
        return investortime;
    }

    public void setInvestortime(String investortime) {
        this.investortime = investortime;
    }

    public String getEarlyexit() {
        return earlyexit;
    }

    public void setEarlyexit(String earlyexit) {
        this.earlyexit = earlyexit;
    }

    public Integer getInvestschemeId() {
        return investschemeId;
    }

    public void setInvestschemeId(Integer investschemeId) {
        this.investschemeId = investschemeId;
    }

    public Integer getHousestatusId() {
        return housestatusId;
    }

    public void setHousestatusId(Integer housestatusId) {
        this.housestatusId = housestatusId;
    }

    public String getProjectfea() {
        return projectfea;
    }

    public void setProjectfea(String projectfea) {
        this.projectfea = projectfea;
    }

    public String getRiskmeasure() {
        return riskmeasure;
    }

    public void setRiskmeasure(String riskmeasure) {
        this.riskmeasure = riskmeasure;
    }
}
