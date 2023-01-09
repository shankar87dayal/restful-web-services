package com.learn.m_s.rest.webservice.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//REST API
@RestController
public class HelloWorldController {

    //URL- hello-world

    //Return - Hello_world

    //    @RequestMapping(method = RequestMethod.GET,path ="/hello-world" )
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello_world";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean  helloWorldBean() {
        return new HelloWorldBean ("Hello_world");

    }
}
