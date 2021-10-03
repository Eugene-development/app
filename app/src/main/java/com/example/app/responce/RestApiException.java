package com.example.app.responce;

public class RestApiException extends RuntimeException{
    public RestApiException(String message){
        super(message);
    }
}
