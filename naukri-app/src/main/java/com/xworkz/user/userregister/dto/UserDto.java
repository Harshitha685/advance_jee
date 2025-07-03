package com.xworkz.user.userregister.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class UserDto {
    private int userId;
    private String fullName;
    private String email;
    private String mobile;
    private String password;
    private String qualification;
//    private String experience;
//    private String skills;
//    private String resume;

}
