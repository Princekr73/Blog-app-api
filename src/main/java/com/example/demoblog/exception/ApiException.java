package com.example.demoblog.exception;

public class ApiException extends RuntimeException{

    public ApiException(String message){
        super(message);
    }
    public ApiException(){

    }
}
