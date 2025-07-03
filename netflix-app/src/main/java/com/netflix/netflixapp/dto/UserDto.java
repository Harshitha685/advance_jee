package com.netflix.netflixapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class UserDto {
    private String fullName;
    private String email;
    private String mobile;
    private String password;
    private String plan;
}
