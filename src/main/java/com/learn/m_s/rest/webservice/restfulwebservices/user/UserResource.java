package com.learn.m_s.rest.webservice.restfulwebservices.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    private UserDaoService service;
    public UserResource(UserDaoService service){
        this.service =service;
    }
    //Get /users
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }

    // GET /users
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        return service.findOne(id);
    }

//Post /users
    @PostMapping("/users")
    public void createUser(@RequestBody User user){
        service.save(user);
    }

}
