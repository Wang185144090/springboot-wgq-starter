package com.wgq.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("wgq")
public class WgqProperties {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
