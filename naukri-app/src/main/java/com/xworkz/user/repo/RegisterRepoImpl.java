package com.xworkz.user.repo;

import com.xworkz.user.userregister.dto.UserDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterRepoImpl implements RegisterRepo {
    @Override
    public boolean saveUser(UserDto dto) {
        boolean userRegistered = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/naukri", "root", "Harshitha@12");

            PreparedStatement statement = conn.prepareStatement(
                    "INSERT INTO naukri_table (userId, fullName, email, mobile, password, qualification) VALUES (?, ?, ?, ?, ?, ?)");

            statement.setInt(1, dto.getUserId());
            statement.setString(2, dto.getFullName());
            statement.setString(3, dto.getEmail());
            statement.setString(4, dto.getMobile());
            statement.setString(5, dto.getPassword());
            statement.setString(6, dto.getQualification());
            int rows = statement.executeUpdate();
            System.out.println("Rows inserted: " + rows);
            userRegistered = true;


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.err.println("SQL Error: " + e.getMessage());
        }

        return userRegistered;
    }
}

