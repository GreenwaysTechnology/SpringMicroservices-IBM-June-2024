package com.ibm.controller;

import com.ibm.entity.Customer;
import com.ibm.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public ResponseEntity<Customer> findById(@PathVariable("id") Long id) {
        Optional<Customer> customer = repository.findById(id);
        //Test customer is available in the database or not
        if (customer.isPresent()) {
            return new ResponseEntity<>(customer.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("{id}")
//    @RequestMapping("{id}")
    public ResponseEntity<Customer> remove(@PathVariable("id") Long id) {
        Optional<Customer> customer = repository.findById(id);
        //Test customer is available in the database or not
        if (customer.isPresent()) {
            //delete logic
            repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<Customer> update(@PathVariable("id") Long id, @RequestBody Customer customer) {
        Optional<Customer> customerFound = repository.findById(id);
        //Test customer is available in the database or not
        if (customerFound.isPresent()) {
            //update logic
            Customer tmpCustomer = customerFound.get();
            //call setters
            tmpCustomer.setFirstName(customer.getFirstName());
            tmpCustomer.setLastName(customer.getLastName());
            //update logic
            Customer updatedCustomer = repository.save(tmpCustomer);
            return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //INSERT
    @PostMapping
    public ResponseEntity<Customer> save(@RequestBody Customer customer) {

        try {
            Customer savedCustomer = repository.save(customer);
            return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
