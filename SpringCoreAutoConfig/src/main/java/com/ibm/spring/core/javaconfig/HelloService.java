package com.ibm.spring.core.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    private GreeterService greeterService;

    public String sayHello() {
        return greeterService.sayGreet();
    }
}
