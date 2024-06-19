package com.ibm.spring.javaconfig;

import com.ibm.spring.javaconfig.config.AppConfig;
import com.ibm.spring.javaconfig.di.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloService helloService = context.getBean(HelloService.class);
        System.out.println(helloService.sayHello());

        OrderService orderService = context.getBean(OrderService.class);
        System.out.println(orderService.getProducts());

    }
}
