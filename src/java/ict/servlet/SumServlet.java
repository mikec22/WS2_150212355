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
@WebServlet(name = "SumServlet", urlPatterns = {"/SumServlet"})
public class SumServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int num1 = 0;
        int num2 = 0;
        String msg = "";
        try{
            num1 = Integer.parseInt(request.getParameter("num1"));
        } catch (NumberFormatException e) {
            msg += "<p>value 1 is a invalid and assume it is zero</p>";
        }
        try{
            num2 = Integer.parseInt(request.getParameter("num2"));
        } catch (NumberFormatException e) {
            msg += "<p>value 2 is a invalid and assume it is zero</p>";
        }
        out.println("<html");
        out.println("<head><title>checkbox button</title></head>");
        out.println("<body>");
        out.println(msg);
        out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
        out.println("</body></html>");
    }



}
