package com.ibm.spring.core.beans;

public class ObjectCreationsWithoutSpring {
    public static void main(String[] args) {
        Customer customer = new Customer();
        //populate data via setters
        customer.setId(1);
        customer.setName("Subramanian");
        System.out.println(customer.getId() + customer.getName());

        //poupluate data via constructors
        Customer customer1 = new Customer(2,"Murugan");
        System.out.println(customer1.getId() + customer1.getName());

    }
}
