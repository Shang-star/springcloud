package com.shang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author shang
 * @PackageName:com.shang
 * @ClassName:SpringCloudStarter
 * @Description:
 * @date 2021/3/16 19:08
 */
@SpringBootApplication
@EnableEurekaClient // 服务启动自动注册到eureka中
@EnableDiscoveryClient // 服务发现
public class SpringCloudProvider_8002 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvider_8002.class,args);
    }
}
