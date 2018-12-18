package com.bob.spring.cloud.zuul.filter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.util.Assert;

/**
 * 白名单配置
 *
 * @author Administrator
 * @create 2018-10-27 20:32
 */
@RefreshScope
@ConfigurationProperties(prefix = "zuul")
public class WhiteListProperties {

    /**
     * key : serviceId
     * value: IP Set
     */
    private Map<String, List<String>> whiteList = new HashMap<>();

    public Map<String, List<String>> getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(Map<String, List<String>> whiteList) {
        this.whiteList = whiteList;
    }
    private List<String> filter = new ArrayList<>();

    public List<String> getFilter() {
        return filter;
    }

    public void setFilter(List<String> filter) {
        this.filter = filter;
    }
    /**
     * @param address
     * @return
     */
    public boolean inWhiteList(String serviceId, String address) {
        Assert.notNull(serviceId, "服务名称不能为空");
        List<String> addrList = whiteList.get(serviceId);

        System.out.println(whiteList);
        whiteList.keySet().stream().forEach(x->System.out.println(x));

        return addrList != null && addrList.contains(address);
    }
}
