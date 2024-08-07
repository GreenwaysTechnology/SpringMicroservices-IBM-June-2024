package com.ibm.spring.boot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConditionalBeanMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConditionalBeanMain.class);
    }
}
