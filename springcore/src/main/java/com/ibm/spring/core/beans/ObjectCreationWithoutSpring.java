package com.ibm.spring.core.beans;

public class ObjectCreationWithoutSpring {
    public static void main(String[] args) {
        GreeterService greeterService = new GreeterService();
        System.out.println(greeterService.sayHello());
    }
}
