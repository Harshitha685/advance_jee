package com.irctc.irctcsystem.service;

import com.irctc.irctcsystem.dto.UserDto;
import com.irctc.irctcsystem.repo.RegisterUserRepo;
import com.irctc.irctcsystem.repo.RegisterUserRepoImpl;

public class RegisterUserValid implements RegisterUserService{

    RegisterUserRepo registerUserRepo;

    public RegisterUserValid(){
        registerUserRepo = new RegisterUserRepoImpl();
    }
    @Override
    public boolean validAndSaveUser(UserDto dto) {
        boolean userValid = false;
        boolean isfullNameValid = false;
        boolean isemailValid = false;
        boolean ismobileValid = false;
        boolean ispasswordValid = false;
        boolean isidProofNumber = false;
        boolean isidProofFileName = false;
        boolean istravelClass = false;
        boolean isfoodPreference = false;

        if (dto.getFullName() != null && !dto.getFullName().isEmpty()) {
            isfullNameValid = true;
        }
        if (dto.getEmail() != null && !dto.getEmail().isEmpty()) {
            isemailValid = true;
        }

        if (dto.getPassword() != null && !dto.getPassword().isEmpty()) {
            ispasswordValid = true;
        }

        if (dto.getMobile() != null && !dto.getMobile().isEmpty() ) {
            ismobileValid = true;
        }

        if (dto.getIdProofFileName() != null && !dto.getIdProofFileName().isEmpty() ) {
            isidProofFileName = true;
        }

        if (dto.getIdProofNumber() != null && !dto.getIdProofNumber().isEmpty() ) {
            isidProofNumber = true;
        }

        if (dto.getTravelClass() != null && !dto.getTravelClass().isEmpty() ) {
            istravelClass = true;
        }

        if (dto.getFoodPreference() != null && !dto.getFoodPreference().isEmpty() ) {
            isfoodPreference = true;
        }


        if(isfullNameValid && isemailValid && ispasswordValid && ismobileValid && isidProofFileName && isidProofNumber && istravelClass && isfoodPreference){
            //set user id dynamicallly
            userValid = registerUserRepo.saveUser(dto);
        }
        return userValid;

    }
}
