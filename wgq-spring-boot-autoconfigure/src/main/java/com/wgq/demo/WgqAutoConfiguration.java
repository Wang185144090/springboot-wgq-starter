package com.wgq.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

//存在指定属性，当前配置才会生效
@ConditionalOnProperty(value = "wgq.name")
@EnableConfigurationProperties(WgqProperties.class)
//存在指定类，当前配置才会生效
@ConditionalOnClass(ServiceOperate.class)
public class WgqAutoConfiguration {

    @Resource
    private WgqProperties wgqProperties;

    @Bean
    public ServiceOperate serviceOperate() {
        return new ServiceOperate(wgqProperties.getName());
    }
}
