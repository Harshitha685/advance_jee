package com.amazon.amazonapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private int amazonId;
    private String fullName;
    private String email;
    private String mobile;
    private String gender;
    private String password;
    private String dob;
}
