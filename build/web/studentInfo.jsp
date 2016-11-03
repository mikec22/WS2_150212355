<%-- 
    Document   : studentInfo
    Created on : Sep 19, 2016, 4:16:16 PM
    Author     : a1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Input Form</title>
    </head>
    <body>
        <h1>Student Input Form</h1>
        <form method="get" action="studentInfo">
            <fieldset>
                <legend>Personal Particular:</legend>
                Name: <input type="text" name="username"><br>
                Password: <input type="password" name="password"><br>
                Gender: <input type="radio" name="gender" value="m" checked>M<input type="radio" name="gender"value="f">F</br>
                Campus: <select name="campus">
                    <option value="ty">Tsing Yi</option>
                    <option value="tm">Tuen Mun</option>
                    <option value="lwl">Lee Wai Lee</option>
                </select>
            </fieldset>
            <fieldset>
                <legend>Languages</legend>
                <input type="checkbox" name="language" value="java" checked>Java
                <input type="checkbox" name="language" value="c">C/C++
                <input type="checkbox" name="language" value="cs">C#
            </fieldset>
            <fieldset>
                <legend>Instruction</legend>
                <textarea name="instruction" placeholder="Enter your instrucion here..."></textarea>
                <input type="hidden" name="secret" value="888">
            </fieldset>
            <input type="submit" value="SEND">
            <input type="reset" value="CLEAR">
        </form>
    </body>
</html>
