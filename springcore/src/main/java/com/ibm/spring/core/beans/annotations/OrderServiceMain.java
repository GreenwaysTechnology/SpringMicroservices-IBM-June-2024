package com.ibm.spring.core.beans.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderServiceMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        OrderService orderService = context.getBean(OrderService.class);
        System.out.println(orderService.getProducts());

    }
}
