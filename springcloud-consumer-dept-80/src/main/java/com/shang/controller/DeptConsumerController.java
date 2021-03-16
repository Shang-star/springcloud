package com.shang.controller;

import com.shang.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author shang
 * @PackageName:com.shang.conf
 * @ClassName:DeptConsumerController
 * @Description:
 * @date 2021/3/16 19:29
 */
@RestController
public class DeptConsumerController {

    @Autowired
    RestTemplate restTemplate; // 提供多种远程访问http服务的方法，简单的Restful模板

    private final static String REST_URL_PREFIX = "http://localhost:8081";
    private final static String REST_URL_PREFIX_RIBBON = "http://SPRINGCOLUD-PROVIDER-DEPT";// SPRINGCOLUD-PROVIDER-DEPT服务的id

    @GetMapping("/dept/list")
    public List<Dept> findAll() {
        return restTemplate.getForObject(REST_URL_PREFIX+"/depts",List.class);
    }

    @GetMapping("/ribbon/dept/list")
    public List<Dept> findAllByRibbon() {
        return restTemplate.getForObject(REST_URL_PREFIX_RIBBON+"/depts",List.class);
    }

}
