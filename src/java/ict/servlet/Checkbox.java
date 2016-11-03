/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ict.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author a1
 */
@WebServlet(name = "Checkbox", urlPatterns = {"/checkbox"})
public class Checkbox extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
       res.setContentType("text/html");
       PrintWriter out = res.getWriter();
       String[] ideName = req.getParameterValues("ide");
       out.println("<html");
       out.println("<head><title>checkbox button</title></head>");
       out.println("<body>");
       out.println("Your choices are :");
       if (ideName != null) {
           for(int i = 0; i < ideName.length; i++) {
               out.println("<br/><b>" + ideName[i]+ "</b>");
           }
       }
       out.println("</body></html>");
    }
}
