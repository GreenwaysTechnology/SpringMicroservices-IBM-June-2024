package com.ibm.restapp.api;

import com.ibm.restapp.api.service.GreeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Resource
@RestController //@RestController--->@Controller---@Component
@RequestMapping("api/greet")
public class GreeterController {

    @Autowired
    private GreeterService greeterService;

    //API
    @GetMapping
    public String sayHello() {
        return greeterService.sayHello();
    }
}
