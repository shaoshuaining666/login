package com.hotlel.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@ConfigurationProperties(prefix = "jwt.config")
@Configuration
@Data
public class JwtConfig {

    /**
     * jwt 超时时间
     */
    private long outTime;

    /**
     * jwt 自己加的盐（字符串）
     */
    private String securityKey;

    public long getOutTime() {
        return outTime;
    }

    public void setOutTime(long outTime) {
        this.outTime = outTime;
    }

    public String getSecurityKey() {
        return securityKey;
    }

    public void setSecurityKey(String securityKey) {
        this.securityKey = securityKey;
    }
}
