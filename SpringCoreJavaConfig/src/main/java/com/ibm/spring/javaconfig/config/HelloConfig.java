package com.ibm.spring.javaconfig.config;

import com.ibm.spring.javaconfig.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {

    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}
