package com.learn.m_s.rest.webservice.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    //JPA/Hibernate  > Database
    //UserDaoService > Static List

    private static List<User> users = new ArrayList<>();
    static {
        users.add(new User(1, "shivam", LocalDate.now().minusYears(20)));
        users.add(new User(1, "Hari om", LocalDate.now().minusYears(25)));
        users.add(new User(1, "ajay", LocalDate.now().minusYears(18)));
    }

    public  List<User> findAll() {
        return users;
    }
}
