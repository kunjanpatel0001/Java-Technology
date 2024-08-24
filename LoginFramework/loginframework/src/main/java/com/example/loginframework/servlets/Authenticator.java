package com.example.loginframework.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "Authenticator", urlPatterns = {"/Authenticator"})
public class Authenticator extends HttpServlet {

    @Override
    public void service(HttpServletRequest request,HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(false);
        if (session == null) {                   // check 1. since doesnot come from a session, it might be an illegal way
            request.getRequestDispatcher("Login").forward(request, response);
        } else {
            if (session.getAttribute("username") != null) {     //check 2. 
                request.getRequestDispatcher("Welcome").forward(request, response);
            } else {
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                if ( username != null && password !=null  && 
                    username.equals("tom") && password.equals("cat")) {
                        session.setAttribute("username", username);
                        request.getRequestDispatcher("Welcome").forward(request, response);
                } else {
                    request.getRequestDispatcher("Login").forward(request, response);
                }
            }
        }
    }
}

