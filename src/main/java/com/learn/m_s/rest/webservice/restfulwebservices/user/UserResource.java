package com.learn.m_s.rest.webservice.restfulwebservices.user;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import static  org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.net.URI;
import java.util.List;
import jakarta.validation.Valid;

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
    //http://localhost:9995/users
//     EntityModel
//    WebMvcLinkBuilder
    @GetMapping("/users/{id}")
    public EntityModel<User> retrieveUser(@PathVariable int id) {
      User user=  service.findOne(id);

      if (user == null)
          throw new UserNotFoundException("id: "+id);
        EntityModel<User> entityModel = EntityModel.of(user);
        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieveAllUsers());
        entityModel.add(link.withRel("all-user"));
        return entityModel;
    }

//Post /users
    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user){
       User savedUser = service.save(user);
       // users/4 => /users /{id} , user.getId
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    // Delete /users
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id) {
        service.deleteById(id);
    }


}
