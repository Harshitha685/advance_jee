package com.amazon.amazonapp.repo.impl;

import com.amazon.amazonapp.dto.UserDto;
import com.amazon.amazonapp.repo.GetUsersRepository;

import java.sql.*;

public class GetUsersRepositoryImpl implements GetUsersRepository {
    UserDto userDtos[];
    int index;
    @Override
    public UserDto[] fetchAllUsers() {
        UserDto[] userDtos = new UserDto[0];
        int count = 1;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "Harshitha@12");
            PreparedStatement pstmt = connection.prepareStatement("select * from amazon_table");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count++;
            }
            userDtos = new UserDto[count];
            System.out.println("Just init size for UserDtos array");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("Started collecting ths data");
                UserDto userDto = new UserDto();
                userDto.setAmazonId(rs.getInt(1));
                userDto.setFullName(rs.getString(2));
                userDto.setEmail(rs.getString(3));
                userDto.setMobile(rs.getString(4));
                userDto.setPassword(rs.getString(5));
                userDto.setDob(rs.getString(6));
                System.out.println("done");
                userDtos[index] = userDto;
                index++;
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

