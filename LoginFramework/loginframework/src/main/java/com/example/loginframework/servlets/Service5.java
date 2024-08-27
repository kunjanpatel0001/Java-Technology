package com.example.loginframework.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "Service3", urlPatterns = {"/Service3"})
public class Service5 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(false);
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Welcome</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Welcome to RPISE "+session.getAttribute("username")+"</h2>");
            out.println("<ol>");
            out.println("<li> This is Service5 </li>");
            out.println("</ol>");
            out.println("<a href='Welcome' style='padding:20px'>Back </a>");
            out.println("<a href='Logout' style='padding:20px'> Logout </a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}

