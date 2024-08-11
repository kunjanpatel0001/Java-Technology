package main.java.com.filter.demofilter;
import java.io.IOException;

import javax.servlet.ServletConfig;

import javax.servlet.ServletException;

import javax.servlet.ServletOutputStream;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "S2", urlPatterns = {"/S2"}, initParams = {

    @WebInitParam(name = "message", 

                  value = "Annotations can be used for configuration parameters"

    )

})

public class S2 extends HttpServlet {

    

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

            out.println("<title>Servlet S2</title>");            

            out.println("</head>");

            out.println("<body>");

            ServletConfig sconfig = getServletConfig();

            String msg = sconfig.getInitParameter("message");

            request.setAttribute("msg",msg);

            out.println("<h1>Servlet S2 says " + msg + "</h1>");

            out.println(

                    "<h1> Servlet S2 get one more message "+ 

                    request.getAttribute("fmsg")+"</h1>"

            );

            out.println("</body>");

            out.println("</html>");

        }

        catch(Exception e){

            System.out.println("Exception Occured in Servlet S2 "+e);

        }

    }

}