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
@TableName(value = "investschemeshow")
public class InvestSchemeShow {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    //方案名称
    private String name;

    //个人最多限购
    private Integer maxbuy;

    //单价
    private BigDecimal price;

    //现金回报
    private BigDecimal cashback;

    //消费回报
    private BigDecimal conback;

    //额外福利
    private String welfare;

    //退出机制
    private String exitmechanism;

    //方案总份数
    private Integer sum;

    //方案剩余份数
    private Integer surplus;

    //开放认购时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date openday;

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

    public Integer getMaxbuy() {
        return maxbuy;
    }

    public void setMaxbuy(Integer maxbuy) {
        this.maxbuy = maxbuy;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCashback() {
        return cashback;
    }

    public void setCashback(BigDecimal cashback) {
        this.cashback = cashback;
    }

    public BigDecimal getConback() {
        return conback;
    }

    public void setConback(BigDecimal conback) {
        this.conback = conback;
    }

    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare;
    }

    public String getExitmechanism() {
        return exitmechanism;
    }

    public void setExitmechanism(String exitmechanism) {
        this.exitmechanism = exitmechanism;
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

    public Date getOpenday() {
        return openday;
    }

    public void setOpenday(Date openday) {
        this.openday = openday;
    }
}
