package com.example.springboot02.exception;

public class UserNotExistException extends RuntimeException {


    public UserNotExistException(){
        super("user is not exist");
    }
}
