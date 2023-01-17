package com.learn.m_s.rest.webservice.restfulwebservices.versioning;

public class Name {
    private String firstName;
    private String lasrName;

    public Name(String firstName, String lasrName) {
        this.firstName = firstName;
        this.lasrName = lasrName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLasrName() {
        return lasrName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", lasrName='" + lasrName + '\'' +
                '}';
    }
}
