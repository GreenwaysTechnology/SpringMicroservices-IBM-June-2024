package com.ibm.spring.core.beans.xml.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceTypeInjection {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Order order=context.getBean(Order.class);
        System.out.println(order);

    }
}
