package com.ibm.spring.javaconfig.config;

import com.ibm.spring.javaconfig.HelloService;
import com.ibm.spring.javaconfig.di.OrderService;
import com.ibm.spring.javaconfig.di.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//<beans> ==@Configuration
@Configuration
//@Import({HelloConfig.class, OrderConfig.class, ProductConfig.class})
public class AppConfig {
    //    <bean id="hello" class="com.ibm.spring.javaconfig.config.HelloService/>
//    @Bean
//    public HelloService helloService() {
//        return new HelloService();
//    }
//
//    //productservice
//    @Bean
//    public ProductService createProduct() {
//        return new ProductService();
//    }
//
//    @Bean
//    public OrderService createOrder() {
//        return new OrderService();
//    }
}
