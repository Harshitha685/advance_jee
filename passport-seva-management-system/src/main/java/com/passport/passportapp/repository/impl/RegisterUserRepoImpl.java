package com.passport.passportapp.repository.impl;

import com.passport.passportapp.dto.UserDto;
import com.passport.passportapp.repository.RegisterUserRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterUserRepoImpl implements RegisterUserRepo {
    @Override
    public boolean saveUser(UserDto dto) {
        System.out.println(dto);
        boolean userRegistered = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/passport_details", "root", "Harshitha@12"
            );
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO passport_table (userId, givenName, surName, dob, email, loginId, password, confirmPassword, hintQuestion, answer) " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
            );

            ps.setInt(1, dto.getUserId());
            ps.setString(2, dto.getGivenName());
            ps.setString(3, dto.getSurName());
            ps.setString(4, dto.getDob());
            ps.setString(5, dto.getEmail());
            ps.setString(6, dto.getLoginId());
            ps.setString(7, dto.getPassword());
            ps.setString(8, dto.getConfirmPassword());
            ps.setString(9, dto.getHintQuestion());
            ps.setString(10, dto.getAnswer());

            ps.executeUpdate();
            userRegistered = true;

            ps.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return userRegistered;
    }
}


