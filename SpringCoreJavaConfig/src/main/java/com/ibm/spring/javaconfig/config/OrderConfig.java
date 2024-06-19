package com.ibm.spring.javaconfig.config;

import com.ibm.spring.javaconfig.di.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfig {

    @Bean
    public OrderService createOrder() {
        return new OrderService();
    }
}
