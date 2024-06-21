package com.ibm.spring.boot.clr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CRLBean {
    public static void main(String[] args) {
        SpringApplication.run(CRLBean.class);
    }

    @Bean
    public CommandLineRunner runner() {
        return args -> {
            System.out.println("CommandLine Bean is created");
        };
    }
}
