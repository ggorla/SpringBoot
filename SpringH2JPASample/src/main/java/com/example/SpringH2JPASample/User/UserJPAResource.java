package com.example.SpringH2JPASample.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class UserJPAResource {

    @Autowired
    private  UserDaoService service;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private  ChallengeDaoService challengeService;

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/jpa/users")
    public List<User> retriveAllUser(){
        return userRepository.findAll();
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
    @GetMapping("/jpa/users/{id}")
    public EntityModel<User> retriveUser(@PathVariable int id){
        User user = service.findOne(id);
        if(user == null)
            throw new UserNotFoundExecption("Id"+id);
        EntityModel<User> resource = EntityModel.of(user);
        WebMvcLinkBuilder linkTo = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).retriveAllUser());
        resource.add(linkTo.withRel("all-users"));
        return resource;
    }


    @GetMapping("/interviews/{interviewId}")
    public ResponseEntity<Challenge> retriveInterview(@PathVariable int interviewId){
        Optional<Challenge> serviceOptional = challengeService.getInterview(interviewId);
        //checking for interview id present or not
        if(!serviceOptional.isPresent()){
            return  ResponseEntity.notFound().build();
        }
        return  ResponseEntity.ok().body(service.getInterviewId(id));
    }


    //where the resources was created and the return the create 201 status code.
    @PostMapping("/jpa/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user){
        User savedUser = userRepository.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
         return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/jpa/users/{id}")
    public void  deleteUser(@PathVariable int id){
         userRepository.deleteById(id);

    }

    @GetMapping("/jpa/users/{id}/posts")
    public List<Post> retriveAllUsers(@PathVariable int id){
        Optional<User> userOptional = userRepository.findById(id);
        if(!userOptional.isPresent()){
            throw new UserNotFoundExecption("id-"+id);
        }
        return userOptional.get().getPosts();
    }

    @PostMapping("/jpa/users/{id}/posts")
    public  ResponseEntity<Object> createPost(@PathVariable int id, @RequestBody Post post){
        Optional<User> userOptional = userRepository.findById(id);
        if(!userOptional.isPresent()){
            throw new UserNotFoundExecption("id-"+ id);
        }
        User user = userOptional.get();
        post.setUser((user));

        postRepository.save(post);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(post.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

}
