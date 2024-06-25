package com.ibm;

import com.ibm.entity.Customer;
import com.ibm.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringjparestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringjparestApplication.class, args);
    }

    @Bean
    public CommandLineRunner create(CustomerRepository customerRepository) {
        return args -> {
            //insert rows into table
//            Customer customer = new Customer();
//            customer.setFirstName("Subramanian");
//            customer.setLastName("Murugan");
            customerRepository.save(new Customer("Subramanian", "Murugan"));
            customerRepository.save(new Customer("Murugan", "Palanisamy"));
            customerRepository.save(new Customer("Geetha", "Subramnaian"));

        };
    }

}
