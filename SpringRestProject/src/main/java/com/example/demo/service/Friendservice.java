package com.example.demo.service;

import com.example.demo.model.Friend;
import org.springframework.data.repository.CrudRepository;

public interface Friendservice extends CrudRepository<Friend, Integer> {

    Iterable<Friend> findByFirstNameAndLastName(String firstname, String lastName);
    Iterable<Friend> findByLastName( String lastName);
    Iterable<Friend> findByFirstName(String firstname);
}
