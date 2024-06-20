package com.ibm.spring.core.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.ibm.spring.core")
public class AppConfig {

    @Bean
    public Address address() {
        return new Address("Coimbatore");
    }

    @Bean
    public Customer create() {
        return new Customer(1, "Subramanian");
    }
}
