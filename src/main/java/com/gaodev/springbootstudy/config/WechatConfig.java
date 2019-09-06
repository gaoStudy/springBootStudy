package com.gaodev.springbootstudy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 微信配置类
 */

@Configuration
@PropertySource(value="classpath:application.properties")
public class WechatConfig {

    @Value("${wechatpay.user.app.app_id}")
    private String appId;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
