package com.amazon.amazonapp.service.impl;

import com.amazon.amazonapp.dto.UserDto;
import com.amazon.amazonapp.repo.UserRegisterRepo;
import com.amazon.amazonapp.repo.impl.UserRegisterRepoImpl;
import com.amazon.amazonapp.service.UserRegisterService;

public class UserRegisterServiceValidate implements UserRegisterService {

    UserRegisterRepo repo;
    public UserRegisterServiceValidate() {
        repo = new UserRegisterRepoImpl();
    }

    @Override
    public boolean validAndSaveUser(UserDto dto) {
        boolean userValid = false;
        boolean isfullNameValid = false;
        boolean isemailIdValid = false;
        boolean ispasswordValid = false;
        boolean ismobileValid = false;
        boolean isdobValid = false;

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

        if(dto.getDob() != null && !dto.getDob().isEmpty()) {
            isdobValid = true;
        }

        if(isfullNameValid && isemailIdValid && ispasswordValid && isdobValid && ismobileValid){
            //set user id dynamicallly
            userValid = repo.saveUser(dto);
        }
        return userValid;
    }
}


