package com.ibm.restapp.response;

import com.ibm.restapp.entity.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customers")
public class Customers {

    List<Customer> customers;

    @Bean
    public CommandLineRunner commandLineRunner() {
        return (arg) -> {
            customers = List.of(
                    new Customer(1, "Subramanian", "Coimbatore"),
                    new Customer(2, "Murugan", "Coimbatore"),
                    new Customer(3, "Karthik", "Chennai"),
                    new Customer(4, "Ram", "Delhi")
            );
        };
    }


//    @PostMapping
////    @ResponseStatus(HttpStatus.CREATED)
//    public Customer create(@RequestBody Customer customer) {
//        return customer;
//    }

    @PostMapping
    public ResponseEntity<Customer> create(@RequestBody Customer customer) {
        return ResponseEntity.status(201)
                .header("name", "IBM")
                .header("location", "Bangalore")
                .contentType(MediaType.APPLICATION_JSON)
                .body(customer);
    }

    @GetMapping
    public List<Customer> findAll() {
        return customers;
    }

    @DeleteMapping
    @RequestMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        System.out.println("deleting by id : " + id);
    }

    @GetMapping
    @RequestMapping("single")
    public Customer findBySingleCustomer() {
        return new Customer(1, "Subramanian", "Coimbatore");
    }
}
