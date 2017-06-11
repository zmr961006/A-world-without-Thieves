package contral;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;


/**
 * Created by hacker on 17-6-6.
 */

@WebServlet(urlPatterns="/Servlet_addinfo")

public class Servlet_addinfo extends HttpServlet{

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("Appeople_name");
        System.out.print(name);
        //request.setAttribute(name,a);
        request.getRequestDispatcher("typography.html").forward(request,response);

    }

    protected void doGet(HttpServletRequest request,HttpServletResponse response){

        String name = request.getParameter("Appeople_name");
        System.out.print("hello "+name);
        request.getRequestDispatcher("typography.html");

    }



}
