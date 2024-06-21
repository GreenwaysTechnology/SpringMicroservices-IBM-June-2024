package com.ibm.spring.boot.clr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CLRMain implements CommandLineRunner {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CLRMain.class);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("new init");
    }
}
