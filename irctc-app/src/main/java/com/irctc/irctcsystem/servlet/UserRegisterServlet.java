package com.irctc.irctcsystem.servlet;

import com.irctc.irctcsystem.dto.UserDto;
import com.irctc.irctcsystem.service.RegisterUserService;
import com.irctc.irctcsystem.service.RegisterUserValid;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registerIRCTCUser")
public class UserRegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullName = req.getParameter("fullName");
        String email = req.getParameter("email");
        String mobile = req.getParameter("mobile");
        String password = req.getParameter("password");
        String idProofFileName = req.getParameter("idProofFileName");
        String idProofNumber = req.getParameter("idProofNumber");
        String travelClass = req.getParameter("travelClass");
        String foodPreference = req.getParameter("foodPreference");

        UserDto dto = new UserDto();
        dto.setFullName(fullName);
        dto.setEmail(email);
        dto.setMobile(mobile);
        dto.setPassword(password);
        dto.setIdProofNumber(idProofNumber);
        dto.setIdProofFileName(idProofFileName);
        dto.setTravelClass(travelClass);
        dto.setFoodPreference(foodPreference);


        System.out.println(dto);

        RegisterUserService registerUserService;
        registerUserService = new RegisterUserValid();

        registerUserService.validAndSaveUser(dto);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thank you " + fullName + " for registering");
    }
}
