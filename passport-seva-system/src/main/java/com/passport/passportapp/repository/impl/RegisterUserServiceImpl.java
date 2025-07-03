package com.passport.passportapp.repository.impl;

import com.passport.passportapp.dto.UserDto;
import com.passport.passportapp.repository.UserRegisterServiceRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterUserServiceImpl implements UserRegisterServiceRepo {
    @Override
    public boolean saveUser(UserDto dto) {
        //JDBC
        boolean userRegistered = false;
        Connection conn = null;
        Statement statement = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/passport","root","Harshitha@12");
             statement = conn.createStatement();
            int noOfRowsAffected =
                    statement.executeUpdate("insert into user_table values("+dto.getUserId()+"," +
                            "'"+dto.getGivenName()+"'," +
                            "'"+dto.getSurName()+"' ," +
                            "'"+dto.getEmailId()+"' ," +
                            "'"+dto.getPassword()+"' ," +
                            "'"+dto.getConfirmPassword()+"')");

                    if (noOfRowsAffected > 0)
                        userRegistered = true;
        } catch (ClassNotFoundException | SQLException e) {
           e.printStackTrace();
        }
        finally {
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
//        System.out.println(dto);
        return userRegistered;
    }
}
