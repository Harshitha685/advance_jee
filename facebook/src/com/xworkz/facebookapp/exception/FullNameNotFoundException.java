package com.xworkz.facebookapp.exception;

public class FullNameNotFoundException extends RuntimeException{
    public FullNameNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
