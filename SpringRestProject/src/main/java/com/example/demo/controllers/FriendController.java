package com.example.demo.controllers;

import com.example.demo.model.Friend;
import com.example.demo.service.Friendservice;
import com.example.demo.util.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationException;
import java.util.Optional;

@RestController
public class FriendController {
    @Autowired
    Friendservice friendservice;

    @PostMapping("/friend")
    Friend create(@RequestBody Friend friend) throws ValidationException {
        if(friend.getId()==0 && friend.getFirstName()!=null && friend.getLastName()!= null)
            return friendservice.save(friend);
        else throw  new ValidationException("Friend Cannot be Created");
    }


    @GetMapping("/friend")
    Iterable<Friend> read(){
        return friendservice.findAll();
    }

    @PutMapping("/friend")
    ResponseEntity<Friend> update(@RequestBody Friend friend){
        if(friendservice.findById(friend.getId()).isPresent())
            return  new ResponseEntity(friendservice.save(friend), HttpStatus.OK);
        else
            return  new ResponseEntity(friend, HttpStatus.OK);
    }

    @DeleteMapping("/friend/{id}")
    void delete(@PathVariable Integer id){
        friendservice.deleteById(id);
    }

    @GetMapping("/friend/{id}")
    Optional<Friend> findByID(@PathVariable Integer id){
        return  friendservice.findById(id);
    }

    @GetMapping("/friend/search")
    Iterable<Friend> findByQuery(@RequestParam(value = "first", required = false) String firstName, @RequestParam(value = "last", required = false) String lastName)
    {
        if(firstName!= null && lastName!= null)
            return friendservice.findByFirstNameAndLastName(firstName,lastName);
        else if(firstName!=null)
            return friendservice.findByFirstName(firstName);
        else if(lastName!=null)
            return friendservice.findByLastName(lastName);
        else
            return friendservice.findAll();

    }

}
