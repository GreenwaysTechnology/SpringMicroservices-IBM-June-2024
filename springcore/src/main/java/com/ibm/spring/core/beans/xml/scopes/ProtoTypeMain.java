package com.ibm.spring.core.beans.xml.scopes;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProtoTypeMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-prototypescope.xml");
        //getBean returns new Instance
        HelloService helloService1 = context.getBean(HelloService.class);
        System.out.println("helloService1 " + helloService1.hashCode());
        HelloService helloService2 = context.getBean(HelloService.class);
        System.out.println("helloService2 " + helloService2.hashCode());
        HelloService helloService3 = context.getBean(HelloService.class);
        System.out.println("helloService3 " + helloService3.hashCode());


    }
}
