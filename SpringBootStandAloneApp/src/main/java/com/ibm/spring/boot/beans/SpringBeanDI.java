package com.ibm.spring.boot.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBeanDI {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBeanDI.class);
        HelloService helloService = context.getBean(HelloService.class);
        System.out.println(helloService.sayHello());

        Customer customer = context.getBean(Customer.class);
        System.out.println(customer);

    }

    @Bean
    public Customer customer() {
        return new Customer(1, "Subramanian");
    }

    @Bean
    public Address address() {
        return new Address("coimbatore");
    }
}
