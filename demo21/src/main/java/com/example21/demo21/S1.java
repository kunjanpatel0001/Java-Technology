package com.example21.demo21;

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;

import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;


// "S1" - Logical Name, "/S1"- on the Browser
@WebServlet(name = "S1", urlPatterns = {"/S1"})

public class S1 extends HttpServlet {

   @Override

   public void service(HttpServletRequest request,

                       HttpServletResponse response)

                       throws ServletException,IOException{

       response.setContentType("text/html;charset=UTF-8");

       try (PrintWriter out = response.getWriter()) {

           out.println("<!DOCTYPE html>");

           out.println("<html>");

           out.println("<head>");

           out.println("<title>Servlet S1</title>");

           out.println("</head>");

           out.println("<body>");

           out.println("<h1> Welcome to the World Of Servlet</h1>");

           out.println("</body>");

           out.println("</html>");

       }

   }

}