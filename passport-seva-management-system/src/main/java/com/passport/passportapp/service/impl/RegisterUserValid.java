package com.passport.passportapp.service.impl;

import com.passport.passportapp.dto.UserDto;
import com.passport.passportapp.repository.RegisterUserRepo;
import com.passport.passportapp.repository.impl.RegisterUserRepoImpl;
import com.passport.passportapp.service.RegisterUserService;

public class RegisterUserValid implements RegisterUserService {

    RegisterUserRepo registerUserRepo;
    public RegisterUserValid(){
        registerUserRepo = new RegisterUserRepoImpl();
    }
    @Override
    public boolean validAndSaveUser(UserDto dto) {
        boolean userValid = false;
        boolean isGivenNameValid = false;
        boolean isSurNameValid = false;
        boolean isDobValid = false;
        boolean isEmailValid = false;
        boolean isLoginIdValid = false;
        boolean isPasswordValid = false;
        boolean isConfirmPasswordValid = false;
        boolean isHintQuestionValid = false;
        boolean isAnswerValid = false;


        if (dto.getGivenName() != null && !dto.getGivenName().isEmpty()) {
            isGivenNameValid = true;
        }

        if (dto.getSurName() != null && !dto.getSurName().isEmpty()) {
            isSurNameValid = true;
        }

        if (dto.getDob() != null && !dto.getDob().isEmpty()) {
            isDobValid = true;
        }

        if (dto.getEmail() != null && !dto.getEmail().isEmpty()) {
            isEmailValid = true;
        }

        if (dto.getLoginId() != null && !dto.getLoginId().isEmpty()) {
            isLoginIdValid = true;
        }

        if (dto.getPassword() != null && !dto.getPassword().isEmpty()) {
            isPasswordValid = true;
        }

        if (dto.getConfirmPassword() != null && !dto.getConfirmPassword().isEmpty()
                && dto.getConfirmPassword().equals(dto.getPassword())) {
            isConfirmPasswordValid = true;
        }

        if (dto.getHintQuestion() != null && !dto.getHintQuestion().isEmpty()) {
            isHintQuestionValid = true;
        }

        if (dto.getAnswer() != null && !dto.getAnswer().isEmpty()) {
            isAnswerValid = true;
        }


        if (isGivenNameValid && isSurNameValid && isEmailValid && isLoginIdValid &&
                isPasswordValid && isConfirmPasswordValid && isHintQuestionValid && isAnswerValid && isDobValid) {

            userValid = registerUserRepo.saveUser(dto);
        }

        return userValid;

    }
}
