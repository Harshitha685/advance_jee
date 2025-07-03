package com.passport.passportapp.servlet;

import com.passport.passportapp.dto.UserDto;
import com.passport.passportapp.service.RegisterUserService;
import com.passport.passportapp.service.impl.RegisterUserValid;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registerUser")
public class RegisterUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String givenName= req.getParameter("givenName");
        String surName= req.getParameter("surName");
        String dob= req.getParameter("dob");
        String email= req.getParameter("email");
        String loginId= req.getParameter("loginId");
        String password= req.getParameter("password");
        String confirmPassword= req.getParameter("confirmPassword");
        String hintQuestion= req.getParameter("hintQuestion");
        String answer= req.getParameter("answer");

        UserDto dto = new UserDto();
        dto.setGivenName(givenName);
        dto.setSurName(surName);
        dto.setEmail(email);
        dto.setPassword(password);
        dto.setConfirmPassword(confirmPassword);
        dto.setLoginId(loginId);
        dto.setHintQuestion(hintQuestion);
        dto.setAnswer(answer);
        dto.setDob(dob);

        System.out.println(dto);

        RegisterUserService registerUserService;
        registerUserService = new RegisterUserValid();
        registerUserService.validAndSaveUser(dto);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thank you for registering");
    }
}
