package com.afge.ribbon.config.ribbon;

import feign.Retryer;
import org.springframework.context.annotation.Bean;

/**
 * @author: lyf
 * @date: 2019/7/15
 * @description:
 */
public class NeverRetryConfig {
    /**
     * feign取消重试
     * @return
     */
    @Bean
    Retryer feignRetryer() {
        return Retryer.NEVER_RETRY;
    }

}
