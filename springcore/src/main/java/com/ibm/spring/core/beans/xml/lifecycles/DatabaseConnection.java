package com.ibm.spring.core.beans.xml.lifecycles;

public class DatabaseConnection {

    public void init() {
        System.out.println("Database is being initalized");
    }

    public void destroy() {
        System.out.println("Database is being destroyed");
    }
}
