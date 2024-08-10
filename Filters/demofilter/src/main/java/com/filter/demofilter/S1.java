package main.java.com.filter.demofilter;
import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.ServletOutputStream;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "S1", urlPatterns = {"/S1"})

public class S1 extends HttpServlet {

    @Override

    public void service(HttpServletRequest request, 

                        HttpServletResponse response)

                        throws ServletException,

                        IOException 

    {

        response.setContentType("text/html;charset=UTF-8");

        ServletOutputStream out = response.getOutputStream();

        try {

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

        catch(Exception e){

            System.out.println("Exception occured in S1 "+e);

        }

    }

}