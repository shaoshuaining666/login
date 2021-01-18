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
@TableName(value = "invest_scheme_show")
public class InvestSchemeShow {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    //方案名称
    private String name;

    //个人最多限购
    @TableField(value = "max_buy")
    private Integer maxBuy;

    //单价
    private BigDecimal price;

    //现金回报
    @TableField(value = "cash_back")
    private BigDecimal cashBack;

    //消费回报
    @TableField(value = "consumption_back")
    private BigDecimal consumptionBack;

    //额外福利
    @TableField(value = "additional_welfare")
    private String additionalWelfare;

    //退出机制
    @TableField(value = "exit_mechanism")
    private String exitMechanism;

    //方案总份数
    private Integer sum;

    //方案剩余份数
    private Integer surplus;

    //开放认购时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @TableField(value = "open_day")
    private Date openDay;

    //是否认购  0：否 1：是
    private Integer subscription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaxBuy() {
        return maxBuy;
    }

    public void setMaxBuy(Integer maxBuy) {
        this.maxBuy = maxBuy;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCashBack() {
        return cashBack;
    }

    public void setCashBack(BigDecimal cashBack) {
        this.cashBack = cashBack;
    }

    public BigDecimal getConsumptionBack() {
        return consumptionBack;
    }

    public void setConsumptionBack(BigDecimal consumptionBack) {
        this.consumptionBack = consumptionBack;
    }

    public String getAdditionalWelfare() {
        return additionalWelfare;
    }

    public void setAdditionalWelfare(String additionalWelfare) {
        this.additionalWelfare = additionalWelfare;
    }

    public String getExitMechanism() {
        return exitMechanism;
    }

    public void setExitMechanism(String exitMechanism) {
        this.exitMechanism = exitMechanism;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getSurplus() {
        return surplus;
    }

    public void setSurplus(Integer surplus) {
        this.surplus = surplus;
    }

    public Date getOpenDay() {
        return openDay;
    }

    public void setOpenDay(Date openDay) {
        this.openDay = openDay;
    }

    public Integer getSubscription() {
        return subscription;
    }

    public void setSubscription(Integer subscription) {
        this.subscription = subscription;
    }
}
