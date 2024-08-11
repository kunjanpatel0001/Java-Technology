package main.java.com.filter.demofilter;
import java.io.CharArrayWriter;

import java.io.IOException;

import java.io.PrintWriter;

import java.util.Enumeration;

import java.util.Hashtable;

import java.util.Iterator;

import java.util.Map;

import java.util.Set;

import javax.servlet.DispatcherType;

import javax.servlet.Filter;

import javax.servlet.FilterChain;

import javax.servlet.FilterConfig;

import javax.servlet.ServletException;

import javax.servlet.ServletRequest;

import javax.servlet.ServletResponse;

import javax.servlet.annotation.WebFilter;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletRequestWrapper;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpServletResponseWrapper;



@WebFilter(filterName = "F4", servletNames = {"S2"}, dispatcherTypes = {DispatcherType.FORWARD, DispatcherType.INCLUDE})

public class F4 implements Filter {


    private FilterConfig filterConfig = null;


    public F4() {

    }


    private void doBeforeProcessing(RequestWrapper request, ResponseWrapper response)

            throws IOException, ServletException {

        PrintWriter out = response.getWriter();

        out.println("<p> Header of F4 </p>");

    }


    private void doAfterProcessing(RequestWrapper request, ResponseWrapper response)

            throws IOException, ServletException {

        PrintWriter out = response.getWriter();

        out.println("<p> Footer of F4 </p>");

        String originaloutput = response.toString();

        String modifiedoutput = originaloutput.replaceAll("S2", "Amazing");

        response.getResponse().getWriter().println("<p>Now I add </p>"+ modifiedoutput);

    }


    public void doFilter(ServletRequest request, ServletResponse response,

            FilterChain chain)

            throws IOException, ServletException {

        try {

            RequestWrapper wrappedRequest = new RequestWrapper((HttpServletRequest) request);

            ResponseWrapper wrappedResponse = new ResponseWrapper((HttpServletResponse) response);

            doBeforeProcessing(wrappedRequest, wrappedResponse);

            chain.doFilter(wrappedRequest, wrappedResponse);

            doAfterProcessing(wrappedRequest, wrappedResponse);

        } catch (Exception e) {

            System.out.println("Exception in F4 " + e);

        }

    }


    public void destroy() {

    }


    public void init(FilterConfig filterConfig) {

        this.filterConfig = filterConfig;

    }


    class RequestWrapper extends HttpServletRequestWrapper {


        public RequestWrapper(HttpServletRequest request) {

            super(request);

        }

        protected Hashtable localParams = null;


        public void setParameter(String name, String[] values) {


            if (localParams == null) {

                localParams = new Hashtable();

                // Copy the parameters from the underlying request.

                Map wrappedParams = getRequest().getParameterMap();

                Set keySet = wrappedParams.keySet();

                for (Iterator it = keySet.iterator(); it.hasNext();) {

                    Object key = it.next();

                    Object value = wrappedParams.get(key);

                    localParams.put(key, value);

                }

            }

            localParams.put(name, values);

        }


        @Override

        public String getParameter(String name) {

            if (localParams == null) {

                return getRequest().getParameter(name);

            }

            Object val = localParams.get(name);

            if (val instanceof String) {

                return (String) val;

            }

            if (val instanceof String[]) {

                String[] values = (String[]) val;

                return values[0];

            }

            return (val == null ? null : val.toString());

        }


        @Override

        public String[] getParameterValues(String name) {

            if (localParams == null) {

                return getRequest().getParameterValues(name);

            }

            return (String[]) localParams.get(name);

        }


        @Override

        public Enumeration getParameterNames() {

            if (localParams == null) {

                return getRequest().getParameterNames();

            }

            return localParams.keys();

        }


        @Override

        public Map getParameterMap() {

            if (localParams == null) {

                return getRequest().getParameterMap();

            }

            return localParams;

        }

    }


    class ResponseWrapper extends HttpServletResponseWrapper {


        private CharArrayWriter output;


        public ResponseWrapper(HttpServletResponse response) {

            super(response);

            output = new CharArrayWriter();

        }


        public PrintWriter getWriter() {

            return new PrintWriter(output);

        }


        @Override

        public String toString() {

            return output.toString();

        }

       

    }


}