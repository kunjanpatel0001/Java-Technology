package com.example21.demo21;

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.annotation.WebInitParam;

import jakarta.servlet.http.HttpServlet;

import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "S3", urlPatterns = {"/S3"}, initParams = {

   @WebInitParam(name = "message",

                 value = "Annotations can be used for configuration parameters"

   )

})

public class S3 extends HttpServlet {


   @Override

   public void service(HttpServletRequest request,

           HttpServletResponse response)

           throws ServletException,

           IOException {

       response.setContentType("text/html;charset=UTF-8");

       try (PrintWriter out = response.getWriter()) {

           out.println("<!DOCTYPE html>");

           out.println("<html>");

           out.println("<head>");

           out.println("<title>Servlet S3</title>");

           out.println("</head>");

           out.println("<body>");

           ServletConfig sconfig = getServletConfig();

           String msg = sconfig.getInitParameter("message");

           out.println("<h1>Servlet S3 says " + msg + "</h1>");

           out.println("</body>");

           out.println("</html>");

       }

   }

}