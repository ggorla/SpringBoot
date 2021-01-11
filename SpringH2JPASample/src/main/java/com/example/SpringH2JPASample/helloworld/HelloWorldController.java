package com.example.SpringH2JPASample.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //GET
    //URI -/hello-word
    //Method - "Hello World"

    @GetMapping( path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    //
    @GetMapping( path = "/hello-world-Bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    //Path Variable
    @GetMapping( path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s",name));
    }


}
