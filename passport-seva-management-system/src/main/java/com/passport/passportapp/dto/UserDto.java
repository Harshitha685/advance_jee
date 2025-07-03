package com.passport.passportapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private int UserId;
    private String givenName;
    private String surName;
    private String dob;
    private String email;
    private String loginId;
    private String password;
    private String confirmPassword;
    private String hintQuestion;
    private String answer;

}
