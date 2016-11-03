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
import java.util.Enumeration;

/**
 *
 * @author a1
 */
@WebServlet(name = "studentInfo", urlPatterns = {"/studentInfo"})
public class studentInfo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        Enumeration eParams = req.getParameterNames();
        String name = req.getParameter("username");
        String password = req.getParameter("password");
        String gender = req.getParameter("gender");
        String campus = req.getParameter("campus");
        String[] language = req.getParameterValues("language");
        String instruction = req.getParameter("instruction");
        String secret = req.getParameter("secret");
        out.println("<html");
        out.println("<head><title>Student Info Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>You have enter</h1></br>");
        
        if (name == null) {
            out.println("Name is null");
        } else if (name.equals("")) {
            out.println("Name: MISSING");
        } else {
            out.print("Name: " + name);
        }
        out.print("</br>");
        if (password == null) {
            out.println("Password is null");
        } else if (password.equals("")) {
            out.println("Password: MISSING");
        } else {
            out.println("Password: " + password);
        }
        out.print("</br>");
        if (gender == null) {
            out.println("Gender is null");
        } else if (gender.equals("")) {
            out.println("Gender: MISSING");
        } else if (gender.equals("m")){
            out.println("Gender: Male");
        } else {
            out.println("Gender: Female");
        }
        out.print("</br>");
        if (campus == null) {
            out.println("Campus is null");
        } else if (campus.equals("")) {
            out.println("Campus: MISSING");
        } else if (campus.equals("ty")){
            out.println("Campus: Tsing Yi");
        } else if (campus.equals("lwl")){
            out.println("Campus: Lee Wai Lee");
        } else {
            out.println("Campus: Tuen Mun");
        }
        out.print("</br>");
        if (language == null) {
            out.println("Languages is null");
        } else if (language.equals("")) {
            out.println("Languages: MISSING");
        } else {
            out.println("Languages: ");
            for (int i = 0; i < language.length; i++){
                switch (language[i]){
                    case "java":
                        out.println("Java ");
                        break;
                    case "c":
                        out.println("C/C++");
                        break;
                    case "cs":
                        out.println("C#");
                        break;
                }
            }
        }
        out.print("</br>");
        if (instruction == null) {
            out.println("Instruction is null");
        } else if (instruction.equals("")) {
            out.println("Instruction: NONE");
        } else {
            out.println("Instruction: " + instruction);
        }
        out.print("</br>");
        if (secret == null) {
            out.println("secret is null");
        } else if (password.equals("")) {
            out.println("secret: MISSING");
        } else {
            out.println("secret: " + secret);
        }
        out.print("<==Hidden parameter");
        out.print("</br>");
        out.println("<b>Request Parameter Names are:</b>");
        while (eParams.hasMoreElements()) {
            String strParam = (String) eParams.nextElement();
            if(eParams.hasMoreElements()){
                out.println(strParam + ", ");
            }else{
                out.println(strParam + ". ");
            }
        }
        out.println("</br><a href=\"studentInfo.jsp\">BACK</a>");
        out.println("</body></html>");
    }

}
