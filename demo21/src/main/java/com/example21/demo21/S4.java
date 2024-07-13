package com.example21.demo21;

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;

import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "S4", urlPatterns = {"/S4"})

public class S4 extends HttpServlet {

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

            out.println("<title>Servlet S4</title>");

            out.println("</head>");

            out.println("<body>");

            int c = 5;

            String msg = "Hello";

            String message = request.getParameter("msg");

            if(message != null) {

                msg = message;

            }

            String count = request.getParameter("count");

            if(count != null) {

                c = Integer.parseInt(

                        request.getParameter("count")

                );

            }

            out.println("<h1>Servlet S4 says... </h1>");

            for(int i = 0 ; i < c; i++){

               out.println("<p> "+ msg + "</p>");

            }

            out.println("</body>");

            out.println("</html>");

        }

    }

}