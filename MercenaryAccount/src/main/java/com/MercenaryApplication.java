package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MercenaryApplication {
    public static void main(String[] args) {
        SpringApplication.run(MercenaryApplication.class,args);
    }
}
