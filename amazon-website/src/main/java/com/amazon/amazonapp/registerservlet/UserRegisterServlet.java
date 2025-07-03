package com.amazon.amazonapp.registerservlet;

import com.amazon.amazonapp.dto.UserDto;
import com.amazon.amazonapp.service.UserRegisterService;
import com.amazon.amazonapp.service.impl.UserRegisterServiceValidate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registerUser")
public class UserRegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullName = req.getParameter("fullName");
        String email = req.getParameter("email");
        String mobile = req.getParameter("mobile");
        String gender = req.getParameter("gender");
        String password = req.getParameter("password");
        String dob = req.getParameter("dob");

        UserDto dto = new UserDto();
        dto.setFullName(fullName);
        dto.setEmail(email);
        dto.setMobile(mobile);
        dto.setGender(gender);
        dto.setPassword(password);
        dto.setDob(dob);

        System.out.println(dto);
        UserRegisterService user;
        user = new UserRegisterServiceValidate();
        user.validAndSaveUser(dto);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thank you " + fullName + " for registering successfully");
    }
}
