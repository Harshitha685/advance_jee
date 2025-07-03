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
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/passport_details","root","Harshitha@12");
            PreparedStatement pstmt = connection.prepareStatement("select * from passport_table");

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                count ++;
            }
            userDtos = new UserDto[count];
            System.out.println("Just init size for UserDtos array");
            rs = pstmt.executeQuery();
            while (rs.next()){
                System.out.println("Started collecting ths data");
                UserDto userDto = new UserDto();
                userDto.setUserId(rs.getInt(1));
                userDto.setGivenName(rs.getString(2));
                userDto.setSurName(rs.getString(3));
                userDto.setEmail(rs.getString(5));
                userDto.setPassword(rs.getString(7));
                userDto.setConfirmPassword(rs.getString(8));
                userDto.setDob(rs.getString(4));
                userDto.setLoginId(rs.getString(6));
                userDtos[index] = userDto;
                index ++;
            }
            rs.close();
            pstmt.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return userDtos;
    }
}
