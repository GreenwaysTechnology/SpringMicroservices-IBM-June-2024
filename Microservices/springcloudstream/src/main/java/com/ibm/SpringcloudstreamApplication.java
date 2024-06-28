package com.ibm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringcloudstreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudstreamApplication.class, args);
    }

    //producer which sends messages via functional
    //stringSupplier is function name , if you dont configure, then function name would be topic
    //name
    @Bean
    public Supplier<UUID> stringSupplier() {
        return () -> {
            var uuid = UUID.randomUUID();
            return uuid;
        };
    }

	//Consumer

    @Bean
    public Consumer<UUID> stringConsumer() {
        return uuid -> {
            System.out.println("Received: " + uuid);
        };
    }

    @Bean
    public Consumer<Stock> stockEventConsumer() {
        return stock -> {
            System.out.println("Received: " + stock);
        };
    }
}
