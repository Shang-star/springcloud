package com.shang.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author shang
 * @PackageName:com.shang.conf
 * @ClassName:Config
 * @Description:
 * @date 2021/3/16 19:32
 */
@Configuration
public class Config {

    // 配置负载均衡实现RestTemplate
    @Bean
    @LoadBalanced //ribbon
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
