package com.bob.spring.cloud.zuul.config;

import com.bob.spring.cloud.zuul.filter.WhiteListZuulFilter;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class ZuulFilterConfiguration {
    @Bean
    public WhiteListZuulFilter getWhiteListZuulFilter(){
        return new WhiteListZuulFilter();
    }
}
