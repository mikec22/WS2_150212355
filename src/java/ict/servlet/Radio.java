/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ict.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author a1
 */
@WebServlet(name = "Radio", urlPatterns = {"/radio"})
public class Radio extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException{
       res.setContentType("text/html");
       PrintWriter out = res.getWriter();
       
       String size = req.getParameter("employee");
       out.println("<html");
       out.println("<head><title>radio button</title></head>");
       out.println("<body>");
       out.println("your company size :" + size);
       out.println("</body></html>");
    }
}
