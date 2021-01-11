package com.example.SpringH2JPASample.helloworld;

public class HelloWorldBean {
    private  String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMesage(String mesage){
        this.message= message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "mesage='" + message + '\'' +
                '}';
    }
}
