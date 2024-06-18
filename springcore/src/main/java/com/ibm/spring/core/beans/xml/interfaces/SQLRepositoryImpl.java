package com.ibm.spring.core.beans.xml.interfaces;

import java.util.List;

public class SQLRepositoryImpl implements Repository{
    @Override
    public List<String> findAll() {
        return List.of("CREATE","UPDATE","SELECT","DELETE");
    }
}
