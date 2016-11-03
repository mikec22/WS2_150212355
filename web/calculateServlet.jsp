<%-- 
    Document   : calculateServlet.jsp
    Created on : Sep 12, 2016, 4:19:58 PM
    Author     : a1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>A Simple Calculator</h2>
        <form method="get" action="SumServlet">
            <p>Enter 2 nos, and click the Calculate button</p>
            </br><input type="text" name="num1">
            </br><input type="text" name="num2"> 
            </br><input type="submit" value="submit">
        </form>
    </body>
</html>
