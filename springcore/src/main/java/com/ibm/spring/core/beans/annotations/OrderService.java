package com.ibm.spring.core.beans.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service
public class OrderService {

    @Autowired
    private ProductService productService;

    public List<String> getProducts() {
        return productService.getProducts();
    }
}
