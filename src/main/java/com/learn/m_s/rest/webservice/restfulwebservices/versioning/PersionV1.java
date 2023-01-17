package com.learn.m_s.rest.webservice.restfulwebservices.versioning;

public class PersionV1 {
    private String name;

    public PersionV1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PersionV1{" +
                "name='" + name + '\'' +
                '}';
    }
}
