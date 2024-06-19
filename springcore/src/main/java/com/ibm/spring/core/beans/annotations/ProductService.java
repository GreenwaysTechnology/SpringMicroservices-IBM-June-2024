package com.ibm.spring.core.beans.annotations;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service
public class ProductService {

    public List<String> getProducts() {
        return List.of("p1", "p2", "p3");
    }
}
