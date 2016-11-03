<%-- 
    Document   : converter
    Created on : Sep 19, 2016, 2:44:07 PM
    Author     : a1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Converter</title>
    </head>
    <body>
        <form method="get" action="TemperatureServlet">
            <table>
                <tr>
                <p>Temperature</p>
                </tr>
                <tr>
                    <p>Temperature Value<input type="text" name="tValue"></p>
                    <p><input type="radio" name="cType" value="F">C to F</p>
                    <p><input type="radio" name="cType" value="C">F to C</p>
                </tr>
                <tr>
                <input type="submit" value="Converter">
                </tr>
            </table>
        </form>
    </body>
</html>
