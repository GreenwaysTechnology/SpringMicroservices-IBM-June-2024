package com.ibm.spring.core.beans.xml.extensions.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class CustomerPropertyMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-propertyplaceholder-config.xml");
        Customer customer = context.getBean(Customer.class);
        System.out.println(customer.getId() + " " + customer.getName());
    }
}
