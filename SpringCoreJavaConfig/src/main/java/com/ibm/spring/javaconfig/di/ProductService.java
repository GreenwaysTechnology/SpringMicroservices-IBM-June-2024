package com.ibm.spring.javaconfig.di;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    public List<String> getProducts() {
        return List.of("p1", "p2");
    }
}
