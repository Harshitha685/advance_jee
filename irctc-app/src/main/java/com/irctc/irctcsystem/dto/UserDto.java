package com.irctc.irctcsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String fullName;
    private String email;
    private String mobile;
    private String password;
    private String idProofNumber;
    private String idProofFileName;
    private String travelClass;
    private String foodPreference;
}
