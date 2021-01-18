package com.hotlel.demo.bean.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName(value = "project_show")
public class ProjectShow {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    //公司
    private String company;

    //项目估值
    @TableField(value = "value_of_money")
    private BigDecimal valueOfMoney;

    //筹集规模
    @TableField(value = "raise_scale")
    private BigDecimal raiseScale;

    //起投金额
    @TableField(value = "min_money")
    private BigDecimal minMoney;

    //每人限投
    @TableField(value = "max_money")
    private BigDecimal maxMoney;

    //投资期限
    @TableField(value = "investment_horizon")
    private String investmentHorizon;

    //提前退出窗口期
    @TableField(value = "exit_early")
    private String exitEarly;

    //方案id
    @TableField(value = "invest_scheme_id")
    private Integer investSchemeId;

    //建筑状况id
    @TableField(value = "house_status_id")
    private Integer houseStatusId;

    //项目特色
    @TableField(value = "project_feature")
    private String projectFeature;

    //风控措施
    @TableField(value = "risk_control_measures")
    private String riskControlMeasures;

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

    public BigDecimal getValueOfMoney() {
        return valueOfMoney;
    }

    public void setValueOfMoney(BigDecimal valueOfMoney) {
        this.valueOfMoney = valueOfMoney;
    }

    public BigDecimal getRaiseScale() {
        return raiseScale;
    }

    public void setRaiseScale(BigDecimal raiseScale) {
        this.raiseScale = raiseScale;
    }

    public BigDecimal getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(BigDecimal minMoney) {
        this.minMoney = minMoney;
    }

    public BigDecimal getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(BigDecimal maxMoney) {
        this.maxMoney = maxMoney;
    }

    public String getInvestmentHorizon() {
        return investmentHorizon;
    }

    public void setInvestmentHorizon(String investmentHorizon) {
        this.investmentHorizon = investmentHorizon;
    }

    public String getExitEarly() {
        return exitEarly;
    }

    public void setExitEarly(String exitEarly) {
        this.exitEarly = exitEarly;
    }

    public Integer getInvestSchemeId() {
        return investSchemeId;
    }

    public void setInvestSchemeId(Integer investSchemeId) {
        this.investSchemeId = investSchemeId;
    }

    public Integer getHouseStatusId() {
        return houseStatusId;
    }

    public void setHouseStatusId(Integer houseStatusId) {
        this.houseStatusId = houseStatusId;
    }

    public String getProjectFeature() {
        return projectFeature;
    }

    public void setProjectFeature(String projectFeature) {
        this.projectFeature = projectFeature;
    }

    public String getRiskControlMeasures() {
        return riskControlMeasures;
    }

    public void setRiskControlMeasures(String riskControlMeasures) {
        this.riskControlMeasures = riskControlMeasures;
    }
}
