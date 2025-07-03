package com.xworkz.zeptoapp.exception;

public class EmailNotFoundException extends RuntimeException{

    public EmailNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
