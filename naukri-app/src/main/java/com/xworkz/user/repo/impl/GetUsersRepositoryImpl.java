package com.xworkz.user.repo.impl;

import com.xworkz.user.repo.GetUsersRepository;
import com.xworkz.user.userregister.dto.UserDto;

import java.sql.*;

public class GetUsersRepositoryImpl implements GetUsersRepository {

    UserDto userDtos[];
    int index;
    @Override
    public UserDto[] fetchAllUsers() {
        int count = 1;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/naukri","root","Harshitha@12");
            PreparedStatement pstmt = connection.prepareStatement("select * from naukri_table");
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
                userDto.setFullName(rs.getString(2));
                userDto.setEmail(rs.getString(3));
                userDto.setMobile(rs.getString(4));
                userDto.setQualification(rs.getString(5));
                userDto.setPassword(rs.getString(6));
                userDto.setUserId(rs.getInt(1));
                System.out.println("done");
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
