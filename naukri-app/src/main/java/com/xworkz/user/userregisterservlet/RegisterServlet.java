package com.xworkz.user.userregisterservlet;

import com.xworkz.user.service.ValidRegistration;
import com.xworkz.user.userregister.dto.UserDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registerJobUser")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullName = req.getParameter("fullName");
        String email = req.getParameter("email");
        String mobile = req.getParameter("mobile");
        String password = req.getParameter("password");
        String qualification = req.getParameter("qualification");

        UserDto dto = new UserDto();
        dto.setFullName(fullName);
        dto.setEmail(email);
        dto.setMobile(mobile);
        dto.setPassword(password);
        dto.setQualification(qualification);

        System.out.println("Received DTO: " + dto);

        // 🧠 Here's the important part:
        ValidRegistration service = new ValidRegistration();
        boolean success = service.validAndSaveUser(dto);

        PrintWriter printWriter = resp.getWriter();
        if (success) {
            printWriter.write("Thank you " + fullName + " for registering successfully!");
        } else {
            printWriter.write("Oops! Registration failed. Please try again.");
        }
    }
}