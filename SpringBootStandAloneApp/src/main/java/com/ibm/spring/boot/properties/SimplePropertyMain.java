package com.ibm.spring.boot.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SimplePropertyMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext context=SpringApplication.run(SimplePropertyMain.class);
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.sayHello());

        System.out.println(userService.getInfo());

        System.out.println(userService.getConfig());
    }
}
