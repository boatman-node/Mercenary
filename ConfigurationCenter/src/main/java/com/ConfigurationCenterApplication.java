package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/*配置中心*/
@SpringBootApplication
@EnableEurekaClient
public class ConfigurationCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigurationCenterApplication.class,args);
    }
}
