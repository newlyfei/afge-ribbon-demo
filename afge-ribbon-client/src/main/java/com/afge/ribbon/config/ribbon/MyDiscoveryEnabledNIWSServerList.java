package com.afge.ribbon.config.ribbon;

import com.netflix.niws.loadbalancer.DiscoveryEnabledNIWSServerList;
import com.netflix.niws.loadbalancer.DiscoveryEnabledServer;

import java.util.List;

/**
 * @author: lyf
 * @date: 2019/7/15
 * @description:
 */
public class MyDiscoveryEnabledNIWSServerList extends DiscoveryEnabledNIWSServerList {

    public List<DiscoveryEnabledServer> getInitialListOfServers() {
        System.out.println("MyDiscoveryEnabledNIWSServerList getInitialListOfServers  ... ");
        return super.getInitialListOfServers();
    }

    @Override
    public List<DiscoveryEnabledServer> getUpdatedListOfServers(){
        System.out.println("MyDiscoveryEnabledNIWSServerList getUpdatedListOfServers  ... ");
        return super.getUpdatedListOfServers();
    }
}
