package com.ibm.spring.javaconfig.config;

import com.ibm.spring.javaconfig.di.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {
    @Bean
    public ProductService createProduct() {
        return new ProductService();
    }
}

