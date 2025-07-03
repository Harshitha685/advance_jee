package com.xworkz.zeptoapp.exception;

public class PhoneNoNotFoundException extends RuntimeException{

    public PhoneNoNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
