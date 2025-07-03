package com.amazon.amazonapp.registerservlet;

import com.amazon.amazonapp.dto.UserDto;
import com.amazon.amazonapp.service.GetUsersService;
import com.amazon.amazonapp.service.impl.GetUsersServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getUsers")
public class getUsersServlet extends HttpServlet {

    GetUsersService service;
    public getUsersServlet(){
        service = new GetUsersServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDto[] dtos = service.getAllUsers();

        System.out.println("User count: " + dtos.length);
        for (UserDto dto : dtos) {
            System.out.println(dto);
        }

        req.setAttribute("listOfUsers",dtos);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getUsers.jsp");
        requestDispatcher.forward(req , resp);
    }
}
