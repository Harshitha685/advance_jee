package com.passport.passportapp.registerservlet;

import com.passport.passportapp.dto.UserDto;
import com.passport.passportapp.registerservice.UserRegisterService;
import com.passport.passportapp.registerservice.impl.UserRegisterValidate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registerUser")
public class UserRegisterServlet extends HttpServlet {

    public UserRegisterServlet(){
        System.out.println("RegisterUserServlet object is  created");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doXXX via service");
        String givenName = req.getParameter("givenName");
        String surName = req.getParameter("surName");
        String emailId = req.getParameter("emailId");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        UserDto dto = new UserDto();
        dto.setGivenName(givenName);
        dto.setSurName(surName);
        dto.setEmailId(emailId);
        dto.setPassword(password);
        dto.setConfirmPassword(confirmPassword);

        System.out.println(dto);

        UserRegisterService user;
        user = new UserRegisterValidate();

        user.validAndSaveUser(dto);


        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thank you " + givenName + " for registering");

    }

}
