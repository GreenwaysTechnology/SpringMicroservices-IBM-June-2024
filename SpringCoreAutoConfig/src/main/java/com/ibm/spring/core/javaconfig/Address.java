package com.ibm.spring.core.javaconfig;

public class Address {
    private  String city;

    public Address() {
    }

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {

        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }

    public void setCity(String city) {
        this.city = city;
    }
}
