package com.afge.ribbon.config.ribbon;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.RoundRobinRule;
import com.netflix.loadbalancer.Server;

/**
 * @author: lyf
 * @date: 2019/7/15
 * @description:
 */
public class MyRule extends RoundRobinRule {
    @Override
    public Server choose(Object key) {
        System.out.println("MyRule choose " + key + " ... ");
        return super.choose(key);
    }

    @Override
    public void setLoadBalancer(ILoadBalancer lb) {
        System.out.println("MyRule setLoadBalancer  ... ");
        super.setLoadBalancer(lb);
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        System.out.println("MyRule getLoadBalancer  ... ");
        return super.getLoadBalancer();
    }

    @Override
    public void initWithNiwsConfig(IClientConfig clientConfig) {
//        clientConfig.
        super.initWithNiwsConfig(clientConfig);
    }
}
