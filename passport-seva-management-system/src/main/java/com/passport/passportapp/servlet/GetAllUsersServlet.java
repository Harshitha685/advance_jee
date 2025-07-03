package com.passport.passportapp.servlet;

import com.passport.passportapp.dto.UserDto;
import com.passport.passportapp.service.GetAllUsersService;
import com.passport.passportapp.service.impl.GetAllUsersServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getAllUsers")
public class GetAllUsersServlet extends HttpServlet {

    GetAllUsersService service;
    public GetAllUsersServlet(){
        service = new GetAllUsersServiceImpl();
    }
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserDto[] dtos = service.getAllUsers();

        for(UserDto dto : dtos){

        }
        req.setAttribute("listOfUsers",dtos);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getUsers.jsp");
        requestDispatcher.forward(req,resp);
    }
}
