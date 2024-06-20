package com.ibm.spring.core.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloService helloService = context.getBean(HelloService.class);
        System.out.println(helloService.sayHello());
        Customer customer = context.getBean(Customer.class);
        System.out.println(customer);
    }
}
