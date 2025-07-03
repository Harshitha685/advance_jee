package com.xworkz.zeptoapp.exception;

public class PasswordNotFoundException extends Exception {
    public PasswordNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
