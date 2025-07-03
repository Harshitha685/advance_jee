package com.xworkz.ajioapp.exception;

public class PasswordNotFoundException extends RuntimeException {
    public PasswordNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
