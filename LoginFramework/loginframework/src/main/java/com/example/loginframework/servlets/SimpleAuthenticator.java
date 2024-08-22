package com.example.loginframework.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "SimpleAuthenticator",urlPatterns = {"/SimpleAuthenticator"})

public class SimpleAuthenticator extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("tom") && password.equals("cat")) {
            request.getRequestDispatcher("SimpleWelcome").forward(request, response);
        } else {
            request.getRequestDispatcher("SimpleLogin").forward(request, response);
        }
    }
} 