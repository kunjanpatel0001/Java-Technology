package com.example.loginframework.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "SimpleLogin", urlPatterns = {"/SimpleLogin"}, loadOnStartup = 1)
public class SimpleLogin extends HttpServlet {

   @Override
   public void doGet(
           HttpServletRequest request,
           HttpServletResponse response) throws ServletException, IOException {

       response.setContentType("text/html;charset=UTF-8");
       try (PrintWriter out = response.getWriter()) {
           out.println("<!DOCTYPE html>");
           out.println("<html>");
           out.println("<head>");

           out.println("<title>Servlet Login</title>");

           out.println("</head>");

           out.println("<body>");

           out.println("<h1>Rpise Login</h1>");

           out.println("<form>"

                + "  <div style='padding:30px'>"

                + "  <label>Username</label>"

                + "  <input type='text' size='30' name='username'/>"

                + "  <br>"

                + "  <br>"

                + "  <label>Password</label>"

                + "  <input type='password' size='30' name='password'/>"

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