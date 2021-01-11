package com.example.SpringH2JPASample.execption;

import com.example.SpringH2JPASample.User.UserNotFoundExecption;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.function.EntityResponse;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExecptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handelAllExecption(Exception ex, WebRequest request){

        ExecptionResponse execptionResponse =  new ExecptionResponse( new Date(), ex.getMessage(), request.getDescription(false));

        return new ResponseEntity(execptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }


    @ExceptionHandler(UserNotFoundExecption.class)
    public final ResponseEntity<Object> handeluserNotFoundExecption(UserNotFoundExecption ex, WebRequest request){

        ExecptionResponse execptionResponse =  new ExecptionResponse( new Date(), ex.getMessage(), request.getDescription(false));

        return new ResponseEntity(execptionResponse, HttpStatus.NOT_FOUND);
    }

}
