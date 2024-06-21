package com.ibm.spring.boot.beans;

import org.springframework.stereotype.Service;

@Service
public class GreeterService {

    public String sayGreet(){
        return "Greet";
    }
}
