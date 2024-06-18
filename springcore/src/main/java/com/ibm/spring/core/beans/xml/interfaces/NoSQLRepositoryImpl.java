package com.ibm.spring.core.beans.xml.interfaces;

import java.util.List;

public class NoSQLRepositoryImpl implements Repository {
    @Override
    public List<String> findAll() {
        return List.of("SET", "GET");
    }
}
