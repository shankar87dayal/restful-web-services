package com.learn.m_s.rest.webservice.restfulwebservices.helloworld;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

//REST API
@RestController
public class HelloWorldController {

    private MessageSource messageSource;
    public HelloWorldController(MessageSource messageSource){
        this.messageSource = messageSource;
    }

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

    //Path variable
    // /users/{id}/todos/{id}   => /users/1/todos/200
    // /hello-world/path-variable/{name}
    // /hello-world/path-variable/Raushan

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean  helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean (String.format("Hello_world, %s", name));

    }

    @GetMapping(path = "/hello-world-Internationalized")
    public String helloWorldInternationalized() {
        Locale local = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message",null,"Default message",local);
//        return "Hello_world";

        // 1:good.morning.message



//        Example: en - English (Good Morning)
//        Example: nl - Dutch (Goedemorgen)
//        Example: fr - French (Bonjour)
//        Example: de - Deutsch (Guten Morgen)

    }
}
