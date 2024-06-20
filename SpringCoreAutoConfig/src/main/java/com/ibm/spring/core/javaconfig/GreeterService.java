package com.ibm.spring.core.javaconfig;

import org.springframework.stereotype.Service;

@Service
public class GreeterService {


    public String sayGreet() {
        return "Greet";
    }
}
