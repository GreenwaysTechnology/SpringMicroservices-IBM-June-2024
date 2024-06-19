package com.ibm.spring.core.beans.xml.extensions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-beanextensions.xml");
        HelloService hello = context.getBean(HelloService.class);
    }
}
