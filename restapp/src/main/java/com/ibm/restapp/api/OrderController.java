package com.ibm.restapp.api;

import com.ibm.restapp.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public String findAll() {
        return orderService.findAll();
    }

    @GetMapping
    @RequestMapping("id")
    public String findById() {
        return orderService.findById();
    }

    @PostMapping
    public String create() {
        return orderService.create();
    }

    @PutMapping
    public String update() {
        return orderService.update();
    }

    @DeleteMapping
    public String remove() {
        return orderService.remove();
    }
}
