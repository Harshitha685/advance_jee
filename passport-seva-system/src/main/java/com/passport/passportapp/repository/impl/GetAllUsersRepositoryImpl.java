package com.passport.passportapp.repository.impl;

import com.passport.passportapp.dto.UserDto;
import com.passport.passportapp.repository.GetAllUsersRepository;

import java.sql.*;

public class GetAllUsersRepositoryImpl implements GetAllUsersRepository {

    UserDto userDtos[];
    int index;

    @Override
    public UserDto[] fetchAllUsers() {
        int count = 1;
        ResultSet rs = null;
        PreparedStatement pstmt = null;
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/passport", "root", "Harshitha@12");
            pstmt = connection.prepareStatement("select * from user_table");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                count++;
            }
            userDtos = new UserDto[count];
            System.out.println("Just init size for UserDtos array");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("Started collecting ths data");
                UserDto userDto = new UserDto();
                userDto.setUserId(rs.getInt(1));
                userDto.setGivenName(rs.getString(2));
                userDto.setSurName(rs.getString(3));
                userDto.setEmailId(rs.getString(4));
                userDto.setPassword(rs.getString(5));
                userDto.setConfirmPassword(rs.getString(6));
                System.out.println("done");
                userDtos[index] = userDto;
                index++;
            }
            rs.close();
            pstmt.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return userDtos;
        }

    }
}

