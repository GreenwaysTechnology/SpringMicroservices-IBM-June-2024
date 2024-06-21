package com.ibm.spring.boot.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Project {

    @Autowired
    private Environment environment;

    public String projectInfo() {
        return environment.getProperty("project.name", "Default Project");
    }
}
