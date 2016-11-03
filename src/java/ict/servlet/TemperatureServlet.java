package ict.servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ict.util.Converter;
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
@WebServlet(name = "TemperatureServlet", urlPatterns = {"/TemperatureServlet"})
public class TemperatureServlet extends HttpServlet {

    private Converter converter;

    public void init() {
        converter = new Converter();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        double tValue = 0;
        char cType = 'a';
        String msg1 = "";
        String msg2 = "";
        double ans = 0;
        try {
            tValue = Double.parseDouble(req.getParameter("tValue"));
        } catch (NumberFormatException e) {
            msg1 = "<p>Invliad input  <a href=\"converter.jsp\">Try Again! </a></p>";
        }
        try {
            cType = req.getParameter("cType").charAt(0);
            if (cType != 'F' || cType != 'C') {
                msg2 = "<p>Please select the type of conversion!! <a href=\"converter.jsp\">Try Again!";
            }
        } catch (NullPointerException e) {
            msg2 = "<p>Please select the type of conversion!! <a href=\"converter.jsp\">Try Again!";
        }

        out.println("<html");
        out.println("<head><title>Servlet</title></head>");
        out.println("<body>");

        if (msg1.equals("") && msg2.equals("")) {
            if (cType == 'F') {
                ans = converter.toFahrenheit(tValue);
                out.println("The " + tValue + "F is " + ans +"C");
            } else if (cType == 'C'){
                ans = converter.toCelsius(tValue);
                out.println("The " + tValue + "C is " + ans+"F");
            }
        } else {
            out.println(msg1);
            out.println(msg2);
        }
        out.println("</body></html>");
    }
}
