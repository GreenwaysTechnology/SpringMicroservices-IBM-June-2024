package com.ibm.spring.core.beans.xml.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryMain {
    public static void main(String[] args) {
        //UserService userService =new UserService();
//        UserService userService = UserService.getInstance();
//        System.out.println(userService.getUserInfo());

        ApplicationContext context = new ClassPathXmlApplicationContext("beans-factorymethod.xml");
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.getUserInfo());

    }
}
