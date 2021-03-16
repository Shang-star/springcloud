package com.shang.controller;

import com.shang.pojo.Dept;
import com.shang.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shang
 * @PackageName:com.shang.controller
 * @ClassName:DeptController
 * @Description: 提供Restful服务
 * @date 2021/3/16 19:04
 */
@RestController
public class DeptController {

    @Autowired
    DeptService deptService;
    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/depts")
    public List<Dept> findAll() {
        return deptService.findAll();
    }

    // 获取注册的服务
    @GetMapping("/dept/discovery")
    public Object discovery() {
        // 获取微服务清单
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            System.out.println(service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCOLUD-PROVIDER-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println(
                    instance.getHost() + "\t"
                    + instance.getPort()+ "\t"
                    + instance.getUri() + "\t"
                    + instance.getInstanceId()
            );
        }
        return discoveryClient;
    }
}
