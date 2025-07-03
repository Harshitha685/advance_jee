package com.passport.passportapp.registerservice.impl;

import com.passport.passportapp.dto.UserDto;
import com.passport.passportapp.registerservice.UserRegisterService;
import com.passport.passportapp.repository.impl.RegisterUserServiceImpl;
import com.passport.passportapp.repository.UserRegisterServiceRepo;

public class UserRegisterValidate implements UserRegisterService {

    UserRegisterServiceRepo userRegisterServiceRepo;

    public UserRegisterValidate(){
         userRegisterServiceRepo = new RegisterUserServiceImpl();
    }

    @Override
    public boolean validAndSaveUser(UserDto dto) {
        boolean userValid = false;
        boolean isgivenNameValid = false;
        boolean issurNameValid = false;
        boolean ispasswordValid = false;
        boolean isconfirmPasswordValid = false;

        if (dto.getGivenName() != null && !dto.getGivenName().isEmpty()) {
            isgivenNameValid = true;
        }
        if (dto.getSurName() != null && !dto.getSurName().isEmpty()) {
            issurNameValid = true;
        }

        if (dto.getPassword() != null && !dto.getPassword().isEmpty()) {
            ispasswordValid = true;
        }

        if (dto.getConfirmPassword() != null && !dto.getConfirmPassword().isEmpty() && dto.getConfirmPassword().equals(dto.getPassword())) {
            isconfirmPasswordValid = true;
        }


        if(isgivenNameValid && issurNameValid && ispasswordValid && isconfirmPasswordValid){
            //set user id dynamicallly
          userValid = userRegisterServiceRepo.saveUser(dto);
        }
        return userValid;
    }
}
