package com.product.productapp.servlet;

import com.product.productapp.dto.UserDto;
import com.product.productapp.repo.UserRepo;
import com.product.productapp.repo.UserRepoImpl;
import com.product.productapp.service.UserService;
import com.product.productapp.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/saveProduct")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String productName = req.getParameter("productName");
        String category = req.getParameter("category");
        String price = req.getParameter("price");
        String quantity = req.getParameter("quantity");
        String description = req.getParameter("description");

        UserDto dto = new UserDto();
        dto.setProductName(productName);
        dto.setCategory(category);
        dto.setPrice(price);
        dto.setQuantity(quantity);
        dto.setDescription(description);

        System.out.println(dto);

        UserService userService = new UserServiceImpl();
        userService.validAndSaveUser(dto);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thank you for registering");
    }
}
