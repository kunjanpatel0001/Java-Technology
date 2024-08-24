package com.example.loginframework.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "Welcome", urlPatterns = {"/Welcome"})
public class Welcome extends HttpServlet {
    @Override
    public void service(HttpServletRequest request,HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(false); //false- do not create a nes session if it does not exist
        if(session == null) {       // if a session does not already exists
            request.getRequestDispatcher("Login").forward(request, response);
        }
        else {
            if(session.getAttribute("username") == null) {
                request.getRequestDispatcher("Login").forward(request, response);
            }
        }
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Welcome</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Welcome to RPISE "+session.getAttribute("username")+"</h2>");
            out.println("<br/>");
            out.println("<a href='./Logout'>Logout</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}

