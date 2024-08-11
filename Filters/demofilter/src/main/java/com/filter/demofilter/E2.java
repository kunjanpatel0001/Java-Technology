package main.java.com.filter.demofilter;
import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.ServletOutputStream;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "E2", urlPatterns = {"/E2"})

public class E2 extends HttpServlet {

    @Override

    public void service(HttpServletRequest request, 

                        HttpServletResponse response)

                        throws ServletException, 

                        IOException 

    {

        

        ServletOutputStream out = response.getOutputStream();

        try{

            out.println("<p> Entering Servlet E2 </p>");

            out.println("<p> Leaving Servlet E2 </p>");

           }

        catch(Exception e){

            System.out.println("Exception in Servlet E2"+e);

        }

    }

}
