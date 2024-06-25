package com.ibm.nonblocking.mono;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("hello")
public class GreeterController {

    //Non blocking api
    @GetMapping
    public Mono<String> sayHello() {
        System.out.println(Thread.currentThread().getName());
        return Mono.just("Hello");
    }

    @GetMapping
    @RequestMapping("messages")
    public Mono<List<String>> greetings() {
        return Mono.just(List.of("Hello","Hai"));
    }

}
