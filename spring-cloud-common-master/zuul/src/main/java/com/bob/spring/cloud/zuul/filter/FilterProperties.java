package com.bob.spring.cloud.zuul.filter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 白名单配置
 *
 * @author Administrator
 * @create 2018-10-27 20:32
 */
@RefreshScope
@ConfigurationProperties(prefix = "alvis")
public class FilterProperties {

    private List<String> filter = new ArrayList<>();

    public List<String> getFilter() {
        return filter;
    }

    public void setFilter(List<String> filter) {
        this.filter = filter;
    }

}
