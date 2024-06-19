package com.ibm.spring.javaconfig.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    //field injection
    @Autowired
    private ProductService productService;


    public List<String> getProducts() {
        return productService.getProducts();
    }

}
