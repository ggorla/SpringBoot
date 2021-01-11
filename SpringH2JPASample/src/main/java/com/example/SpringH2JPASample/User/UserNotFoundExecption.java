package com.example.SpringH2JPASample.User;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundExecption extends RuntimeException {
    public UserNotFoundExecption(String s) {
    }

    public UserNotFoundExecption() {
    }
}
