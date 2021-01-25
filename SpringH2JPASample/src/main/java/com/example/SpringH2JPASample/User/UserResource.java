package com.example.SpringH2JPASample.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private  UserDaoService service;

    @GetMapping("/users")
    public List<User> retriveAllUser(){
        return service.findAll();
    }

   /*
    -- commenting due to Hateoas implmentaion
    @GetMapping("/users/{id}")
    public User retriveUser(@PathVariable int id){
        User user =  service.findOne(id);
        if(user ==null)
            throw  new UserNotFoundExecption("id-" + id);

        Resource

        return user;
    }

    */
    @GetMapping("/users/{id}")
    public EntityModel<User> retriveUser(@PathVariable int id){
        User user = service.findOne(id);
        if(user == null)
            throw new UserNotFoundExecption("Id"+id);
        EntityModel<User> resource = EntityModel.of(user);
        WebMvcLinkBuilder linkTo = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).retriveAllUser());
        resource.add(linkTo.withRel("all-users"));
        return resource;
    }

    //where the resources was created and the return the create 201 status code.
    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user){
        User savedUser = service.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
         return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/users/{id}")
    public void  deleteUser(@PathVariable int id){
        User user = service.deleteById(id);

        if(user == null){
            throw  new UserNotFoundExecption("id -"+id);
        }

    }

}
