package com.afge.ribbon.service;

import com.afge.ribbon.config.ribbon.NeverRetryConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: lyf
 * @date: 2019/7/15
 * @description:
 */
@FeignClient(name = "afge-ribbon-service",configuration = NeverRetryConfig.class)
public interface AfgeRibbonService {
    @RequestMapping("/test/one")
    void test(@RequestParam String id);
}
