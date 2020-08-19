package com.ll.aa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients //允许服务调用
@EnableEurekaClient
@SpringBootApplication
public class AaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AaApplication.class, args);
    }

}
