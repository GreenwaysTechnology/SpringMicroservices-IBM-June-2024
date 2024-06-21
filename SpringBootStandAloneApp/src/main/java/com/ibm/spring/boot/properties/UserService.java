package com.ibm.spring.boot.properties;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Value("${users.name}")
    private String userName;
    @Value("${users.message}")
    private String message;

    @Autowired
    private Environment environment;

    //inject configuration class
    @Autowired
    private AppConfiguration appConfiguration;


    public String sayHello() {
        return message + " " + userName;
    }

    public String getInfo() {
        return environment.getProperty("users.info", "This is default info");
    }

    public String getConfig() {
        return appConfiguration.getName() + " " + appConfiguration.getAuthor();
    }


}
