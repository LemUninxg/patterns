package com.design.patterns.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 工厂模式获取
 */
@Component
public class StrategyFactory {

    private Set<PayService> payServices;

    private final Map<String, PayService> payServiceMap = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        for (PayService crawMatchService : payServices) {
            payServiceMap.put(crawMatchService.getPlatform(), crawMatchService);
        }
    }

    public PayService getPayServiceImpl(String component) {
        PayService demoService = payServiceMap.get(component);
        if (demoService == null) {
            throw new RuntimeException("策略模式没找到对应实现类");
        }
        return demoService;
    }

    @Autowired
    public void setPayServices(Set<PayService> payServices) {
        this.payServices = payServices;
    }
}
