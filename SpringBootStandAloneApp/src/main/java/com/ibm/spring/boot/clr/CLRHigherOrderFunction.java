package com.ibm.spring.boot.clr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CLRHigherOrderFunction {
    public static void main(String[] args) throws Exception {
        runner().run("");
    }

    public static CommandLineRunner runner() {
//        return new CommandLineRunner() {
//            @Override
//            public void run(String... args) throws Exception {
//                System.out.println("test");
//            }
//        };
        return argstmp -> System.out.println("runner");
    }
}
