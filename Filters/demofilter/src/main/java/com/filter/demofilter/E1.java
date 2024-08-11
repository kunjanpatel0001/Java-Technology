package main.java.com.filter.demofilter;
import java.io.IOException;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;

import javax.servlet.ServletOutputStream;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "E1", urlPatterns = {"/E1"})

public class E1 extends HttpServlet {

    @Override

    public void service(HttpServletRequest request, 

                        HttpServletResponse response)

                        throws ServletException, 

                        IOException 

    {

        response.setContentType("text/html;charset=UTF-8");

        ServletOutputStream out = response.getOutputStream();

        try{

            out.println("<!DOCTYPE html>");

            out.println("<html>");

            out.println("<head>");

            out.println("<title>Servlet E1</title>"); 

            out.println("</head>");

            out.println("<body>");

            out.println("<p> Entering Servlet E1 </p>");

            out.println("E1 prints count = "+request.getAttribute("count"));

            RequestDispatcher rd = request.getRequestDispatcher("E2");

            rd.include(request, response);

            out.println("<p> Leaving Servlet E1 </p>");

            out.println("</body>");

            out.println("</html>");

        }

        catch(Exception e){

            System.out.println("Exception in Servlet E1");

        }

    }

}


