package com.example.loginframework.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "Login", urlPatterns = {"/Login"})

public class Login extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        if (session.getAttribute("username") != null) {
            request.getRequestDispatcher("Welcome").forward(request, response);
        }

        String redirect = (String) request.getAttribute("redirect");
        if ( redirect != null ) session.setAttribute("redirect", redirect);
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Rpise Login</h1>");
            out.println("<form action='Authenticator'>"
                + "  <div style='padding:30px'>"
                + "  <label>Username</label>"
                + "  <input type='text' size='30' name='username'/>"
                + "  <br>"
                + "  <br>"
                + "  <label>Password</label>"
                + "  <input type='password' size='30' "
                + "  name='password'/>"
                + "  <br>"
                + "  <br>"
                + "  <input type='submit' value='Go'/>"
                + "  </div>"
                + "  </form>");
            out.println("</body>");
            out.println("</html>");
        }

    }

}