package com.ibm.spring.core.beans.xml.lifecycles;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans-beanLifecycles.xml");
//        context.getBean(DatabaseConnection.class);
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans-beanLifecycles.xml");
        context.getBean(DatabaseConnection.class);
        context.registerShutdownHook();
    }
}
