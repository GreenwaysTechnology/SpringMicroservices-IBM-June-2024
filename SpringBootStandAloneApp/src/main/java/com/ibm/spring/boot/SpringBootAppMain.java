package com.ibm.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootAppMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootAppMain.class);
    }
}
