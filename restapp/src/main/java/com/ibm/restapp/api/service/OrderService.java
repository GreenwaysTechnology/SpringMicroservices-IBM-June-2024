package com.ibm.restapp.api.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public String findAll() {
        return "orders";
    }

    public String findById() {
        return "Orders By Id";
    }

    public String create() {
        return "Orders Create";
    }

    public String update() {
        return "Orders Update";
    }

    public String remove() {
        return "Orders Remove";
    }


}
