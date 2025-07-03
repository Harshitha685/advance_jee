package com.amazon.amazonapp.repo.impl;

import com.amazon.amazonapp.dto.UserDto;
import com.amazon.amazonapp.repo.UserRegisterRepo;

import java.sql.*;

public class UserRegisterRepoImpl implements UserRegisterRepo {
    @Override
    public boolean saveUser(UserDto dto) {
       // System.out.println(dto);
        boolean userRegistered = false;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon","root","Harshitha@12");
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO amazon_table (amazon_id, full_name, email, gender, mobile, password, dob) VALUES (?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, dto.getAmazonId());
            ps.setString(2, dto.getFullName());
            ps.setString(3, dto.getEmail());
            ps.setString(4, dto.getGender());
            ps.setString(5, dto.getMobile());
            ps.setString(6, dto.getPassword());
            ps.setString(7, dto.getDob());

            ps.executeUpdate();

            userRegistered = true;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        System.out.println(dto);
        return userRegistered;

    }
}
