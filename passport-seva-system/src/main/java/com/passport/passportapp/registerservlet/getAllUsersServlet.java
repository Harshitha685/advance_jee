package com.passport.passportapp.registerservlet;

import com.passport.passportapp.dto.UserDto;
import com.passport.passportapp.registerservice.GetAllUsersService;
import com.passport.passportapp.registerservice.impl.GetAllUsersServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getAllUsers")

public class getAllUsersServlet extends HttpServlet {

    GetAllUsersService service;

    public getAllUsersServlet(){
        service = new GetAllUsersServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserDto[] dtos = service.getAllUsers();
String userName = null;

//        String userName = "Baba Singh";

        for(UserDto dto: dtos ) {
           // System.out.println("Dto is displaying");
//
            userName = dto.getGivenName() +" "+ dto.getSurName();
            break;
        }

        req.setAttribute("usName",userName);
        //setting the scope of the dto using req obj
        req.setAttribute("listOfUsers",dtos);

        //servlet chaining
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAllUsers.jsp");
        requestDispatcher.forward(req , resp);
    }
}
