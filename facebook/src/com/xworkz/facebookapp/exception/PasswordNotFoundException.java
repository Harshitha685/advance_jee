package com.xworkz.facebookapp.exception;

public class PasswordNotFoundException extends Throwable {
    public PasswordNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
