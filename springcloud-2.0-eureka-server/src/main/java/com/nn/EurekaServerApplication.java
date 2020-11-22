package com.nn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description
 * @Author 白起
 * @Data 2020/11/22 23:50
 */
@SpringBootApplication
@EnableEurekaServer // 启用eureka server
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
