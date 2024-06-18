package com.ibm.spring.core.beans.xml;

import com.ibm.spring.core.beans.GreeterService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreeterSpringBean {
    public static void main(String[] args) {
        //initialize the spring container by reading beans-greeter.xml file
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-greeter.xml");
        //Beans are created already by spring container, get the bean from the container
        GreeterService greeterService = context.getBean(GreeterService.class);
        //Use the bean
        System.out.println(greeterService.sayHello());

    }
}
