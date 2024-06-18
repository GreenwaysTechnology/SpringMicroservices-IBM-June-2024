package com.ibm.spring.core.beans.xml;

import com.ibm.spring.core.beans.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerSpringBean {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-constructorInjection.xml");
        Customer customer = context.getBean(Customer.class);
        System.out.println(customer);

    }
}
