package com.xworkz.user.userregisterservlet;

import com.xworkz.user.service.GetUsersService;
import com.xworkz.user.service.impl.GetUsersServiceImpl;
import com.xworkz.user.userregister.dto.UserDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getAllUsers")
public class GetUsersServlet extends HttpServlet {

    GetUsersService service;
    public GetUsersServlet(){
        service = new GetUsersServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserDto[] dtos = service.getAllUsers();
        for(UserDto dto: dtos ) {
            System.out.println("Dto is displaying");

        }
        req.setAttribute("listOfUsers",dtos);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAllUsers.jsp");
        requestDispatcher.forward(req , resp);
    }
}
