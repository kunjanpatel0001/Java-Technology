package com.example.loginframework.servlets;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import jakarta.servlet.DispatcherType;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@WebFilter(filterName = "GateKeeper", urlPatterns = {"/*"}, dispatcherTypes = {DispatcherType.REQUEST})

public class GateKeeper implements Filter {
    private FilterConfig filterConfig = null;
    
    public GateKeeper() {
    }    

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
            HttpSession session;
            session = ((HttpServletRequest)request).getSession(false);
            String servletName =((HttpServletRequest)request).getServletPath();
            if(session == null && !servletName.equals("/Login")){
                request.setAttribute("redirect", servletName.substring(1));
                request.getRequestDispatcher("Login").forward(request, response);
            }
        if(session != null && session.getAttribute("username") == null && !servletName.equals("/Login") && 
            !servletName.equals("/Authenticator")) {
                request.setAttribute("redirect",servletName.substring(1));
                request.getRequestDispatcher("Login").forward(request, response);
        }   
        try {
            chain.doFilter(request, response);
        } catch (Throwable t) {
            }
    }

    public FilterConfig getFilterConfig() {
        return (this.filterConfig);
    }

    public void setFilterConfig(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }

    public void init(FilterConfig filterConfig) {        
        this.filterConfig = filterConfig;
    }

    @Override
    public void destroy() {

    }   

}

