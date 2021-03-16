package com.shang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author shang
 * @PackageName:com.shang
 * @ClassName:SpringCloudConsumer
 * @Description:
 * @date 2021/3/16 19:35
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudConsumer {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumer.class,args);
    }
}
