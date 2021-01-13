package com.hotlel.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Lb on 2020/3/10
 */
@Data
@Configuration
@ConfigurationProperties("wechat")
public class WechatConfig {

    /**
     * 公众号APPid
     */
    private String appId;

    /**
     *  公众号secretKey
     */
    private String secretKey;

    /**
     *  跳转地址
     */
    private String firstCodeRedirectUrl;

    /**
     *  跳转地址
     */
    private String loginCodeRedirectUrl;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getFirstCodeRedirectUrl() {
        return firstCodeRedirectUrl;
    }

    public void setFirstCodeRedirectUrl(String firstCodeRedirectUrl) {
        this.firstCodeRedirectUrl = firstCodeRedirectUrl;
    }

    public String getLoginCodeRedirectUrl() {
        return loginCodeRedirectUrl;
    }

    public void setLoginCodeRedirectUrl(String loginCodeRedirectUrl) {
        this.loginCodeRedirectUrl = loginCodeRedirectUrl;
    }
}
