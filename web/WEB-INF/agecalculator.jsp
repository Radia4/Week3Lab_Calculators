<%-- 
    Document   : agecalculator
    Created on : Jan 28, 2023, 3:51:42 PM
    Author     : radia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <form action="currentage" method="POST">
            <h1>Age Calculator</h1>
            <label for="currentage">Enter your current age:</label>
            <input type="text" id="currentage" name="currentage" value="">
            <input type="submit" value="Age next birthday">
        </form>
        ${Message}
 
    </body>
</html>
