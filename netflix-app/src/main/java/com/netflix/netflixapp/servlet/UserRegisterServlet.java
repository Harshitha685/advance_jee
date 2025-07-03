package com.netflix.netflixapp.servlet;

import com.netflix.netflixapp.dto.UserDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registerNetflixUser")
public class UserRegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullName = req.getParameter("fullName");
        String email = req.getParameter("email");
        String mobile = req.getParameter("mobile");
        String password = req.getParameter("password");
        String plan = req.getParameter("plan");

        UserDto dto = new UserDto();
        dto.setFullName(fullName);
        dto.setEmail(email);
        dto.setMobile(mobile);
        dto.setPassword(password);
        dto.setPlan(plan);

        System.out.println(dto);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thank you " + fullName + " for registering");
    }
}
