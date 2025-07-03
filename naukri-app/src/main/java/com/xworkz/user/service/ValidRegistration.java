package com.xworkz.user.service;

import com.xworkz.user.repo.RegisterRepo;
import com.xworkz.user.repo.RegisterRepoImpl;
import com.xworkz.user.userregister.dto.UserDto;

public class ValidRegistration implements RegisterService{

    RegisterRepo registerRepo;
    public ValidRegistration(){
        registerRepo = new RegisterRepoImpl();
    }
    @Override
    public boolean validAndSaveUser(UserDto dto) {
        boolean userValid = false;
        boolean isfullNameValid = false;
        boolean isemailIdValid = false;
        boolean ispasswordValid = false;
        boolean ismobileValid = false;
        boolean isqualificationValid = false;
//        boolean isskillsValid = false;
//        boolean isexperienceValid = false;
//        boolean isresumeValid = false;

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

        if(dto.getQualification() != null && !dto.getQualification().isEmpty()) {
            isqualificationValid = true;
        }

//        if(dto.getExperience() != null && !dto.getExperience().isEmpty()) {
//            isexperienceValid = true;
//        }
//
//        if(dto.getSkills() != null && !dto.getSkills().isEmpty()) {
//            isskillsValid = true;
//        }
//
//        if(dto.getResume() != null && !dto.getResume().isEmpty()) {
//            isresumeValid = true;
//        }


        if(isfullNameValid && isemailIdValid && ispasswordValid && isqualificationValid && ismobileValid ){
            //set user id dynamicallly
            userValid = registerRepo.saveUser(dto);
        }
        return userValid;
    }
}
