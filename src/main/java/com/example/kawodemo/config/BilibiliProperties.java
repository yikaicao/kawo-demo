package com.example.kawodemo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "open.bilibili")
public class BilibiliProperties {

    @Getter
    @Setter
    private String clientId;

}
