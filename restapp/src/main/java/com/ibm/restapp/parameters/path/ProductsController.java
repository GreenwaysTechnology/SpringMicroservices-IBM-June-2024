package com.ibm.restapp.parameters.path;

import com.ibm.restapp.entity.Product;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductsController {

    @GetMapping
    public String findAll() {
        return "products";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestBody Product product) {
        System.out.println(product);
        return "saved";
    }

    @GetMapping
    @RequestMapping("{id}")
    public String findById(@PathVariable("id") Long id) {
        return "Product  " + id;
    }

    @GetMapping
    @RequestMapping("filter")
    public String filter(@RequestParam("category") String category, @RequestParam("pricegreaterthan") Long pricegreterthan, @RequestParam("pricelessthan") Long pricelessthan) {
        return category + pricegreterthan + pricelessthan;
    }
}
