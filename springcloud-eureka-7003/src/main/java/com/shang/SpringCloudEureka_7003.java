package com.shang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author shang
 * @PackageName:com.shang
 * @ClassName:SpringCloudEureka
 * @Description:
 * @date 2021/3/16 20:13
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEureka_7003 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEureka_7003.class,args);
    }
}
