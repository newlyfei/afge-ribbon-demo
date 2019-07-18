package com.afge.ribbon.config.ribbon;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.niws.loadbalancer.NIWSDiscoveryPing;
import feign.Contract;
import feign.Request;
import feign.RetryableException;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author: lyf
 * @date: 2019/7/15
 * @description:
 */
@Configuration
public class MyDefaultRibbonConfig {
    /**
     * 负载均衡规则
     * @return
     */
    @Bean
    public IRule ribbonRule() {
        return new MyRule();
    }

    @Bean
    public IPing ribbonPing() {
        return new MyPingUrl(new NIWSDiscoveryPing());
    }

    /**
     * feign取消重试
     * @return
     */
    @Bean
    Retryer feignRetryer() {
        return Retryer.NEVER_RETRY;
    }

//    @Bean
//    public Retryer feignRetryer() {
//        Integer maxPeriod=1;    //重试秒数
//        Integer maxAttempts=5;  //最大重试次数
//        return new Retryer.Default(100,1,0);
//    }

    /**
     * feign请求超时设置
     * @param env
     * @return
     */
    @Bean
    Request.Options requestOptions(ConfigurableEnvironment env){
        int ribbonReadTimeout = env.getProperty("ribbon.ReadTimeout", int.class, 6000);
        int ribbonConnectionTimeout = env.getProperty("ribbon.ConnectTimeout", int.class, 3000);

        return new Request.Options(ribbonConnectionTimeout, ribbonReadTimeout);
    }



//    @Bean
//    public Contract feignContract() {
//        System.out.println("Contract.Default...");
//        return new Contract.Default();  //采用Feign自有注解，默认使用springmvc注解
//    }
}
