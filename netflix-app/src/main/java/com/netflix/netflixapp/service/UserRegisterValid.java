package com.netflix.netflixapp.service;

import com.netflix.netflixapp.dto.UserDto;
import com.netflix.netflixapp.repo.RegisterUserImpl;
import com.netflix.netflixapp.repo.RegisterUserRepo;

public class UserRegisterValid implements UserRegisterService{

   RegisterUserRepo registerUserRepo;
    public UserRegisterValid() {
        registerUserRepo = new RegisterUserImpl();
    }
    @Override
    public boolean validAndSaveUser(UserDto dto) {
        boolean userValid = false;
        boolean isfullNameValid = false;
        boolean isemailIdValid = false;
        boolean ispasswordValid = false;
        boolean ismobileValid = false;
        boolean isplanValid = false;

        if (dto.getFullName() != null && !dto.getFullName().isEmpty()) {
            isfullNameValid = true;
        }
        if (dto.getEmail() != null && !dto.getEmail().isEmpty()) {
            isemailIdValid = true;
        }

        if (dto.getPassword() != null && !dto.getPassword().isEmpty()) {
            ispasswordValid = true;
        }

        if (dto.getMobile() != null && !dto.getMobile().isEmpty()) {
            ismobileValid = true;
        }

        if(dto.getPlan() != null && !dto.getPlan().isEmpty()) {
            isplanValid = true;
        }

        if(isfullNameValid && isemailIdValid && ispasswordValid && isplanValid && ismobileValid){
            //set user id dynamicallly
            userValid = registerUserRepo.saveUser(dto);
        }
        return userValid;
    }
}

