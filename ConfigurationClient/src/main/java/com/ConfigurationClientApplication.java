package com;

import javafx.application.Application;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigurationClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigurationClientApplication.class,args);
    }
    @Value("${foo}")
    String foo;
    @GetMapping("/foo")
    public String hi(){
       return foo;
    }
}
