package com.ibm.spring.boot.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class YAMLMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext context= SpringApplication.run(YAMLMain.class);
        Project project= context.getBean(Project.class);
        System.out.println(project.projectInfo());

    }
}
