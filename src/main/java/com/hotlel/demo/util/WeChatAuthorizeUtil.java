package com.hotlel.demo.util;

import com.hotlel.demo.config.WechatConfig;
import com.hotlel.demo.constant.WeiXinOAuthColumn;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


@Slf4j
@Component
public class WeChatAuthorizeUtil {

    private static String ENCODE = "UTF-8";

    @Resource
    private WechatConfig wechatConfig;

    // 微信授权 用户无感知 url（也就是用户不用点授权也能获取openID（不包含昵称、地区等），前提：在公众号内）
    public String getOAuthCodeUrl_BASE() throws UnsupportedEncodingException {
        return WeiXinOAuthColumn.OAUTH_CODE_URI
                .replace("APPID", wechatConfig.getAppId())
                .replace("REDIRECT_URI", URLEncoder.encode(wechatConfig.getFirstCodeRedirectUrl(), ENCODE))
                .replace("SCOPE", WeiXinOAuthColumn.SNSAPI_BASE)
                .replace("STATE", WeiXinOAuthColumn.STATE);
    }

    // 微信授权 用户有感知 url（也就是需要用户点击授权才行）
    public String getOAuthCodeUrl_USER() throws UnsupportedEncodingException {
        return WeiXinOAuthColumn.OAUTH_CODE_URI
                .replace("APPID", wechatConfig.getAppId())
                .replace("REDIRECT_URI", URLEncoder.encode(wechatConfig.getLoginCodeRedirectUrl(), ENCODE))
                .replace("SCOPE", WeiXinOAuthColumn.SNSAPI_USERINFO)
                .replace("STATE", WeiXinOAuthColumn.STATE);
    }

    // 微信授权 获取用户openID url( 也就是：通过code换取网页授权access_token)
    public String getAccessTokenUrl(String code) {
        return WeiXinOAuthColumn.OAUTH_ACCESS_TOKEN_URI
                .replace("APPID", wechatConfig.getAppId())
                .replace("SECRET", wechatConfig.getSecretKey())
                .replace("CODE", code);
    }

    // 微信授权 获取用户信息( 也就是：拉取用户信息(需scope为 snsapi_userinfo))
    public String getUserInfoUrl(String accessToken, String openid) {
        return WeiXinOAuthColumn.OAUTH_USER_INFO_URI
                .replace("ACCESS_TOKEN", accessToken)
                .replace("OPENID", openid);
    }
}
