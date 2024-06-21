package com.ibm.spring.boot.clr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;


interface Command {
    void create();
}

//implementation
class Robotics implements Command {
    @Override
    public void create() {
        System.out.println("Create ");
    }
}

@SpringBootApplication
public class CLRFunctional {
    public static void main(String[] args) throws Exception {
        Robotics robotics = new Robotics();
        robotics.create();

        //anonymous inner class pattern
        Command mycommand = new Command() {
            @Override
            public void create() {
                System.out.println("create");
            }
        };
        mycommand.create();

//        Command command = new Command() {
//            @Override
//            public void create() {
//                System.out.println("create");
//            }
//        };
        Command command = () -> {
            System.out.println("create");
        };
        command.create();
//        CommandLineRunner runner = new CommandLineRunner() {
//            @Override
//            public void run(String... args) throws Exception {
//                System.out.println("runner");
//            }
//        };
//        runner.run("");

        CommandLineRunner runner = tmpargs -> {
            System.out.println("runner");
        };
        runner.run("");
    }

}
