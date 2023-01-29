<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 28, 2023, 8:37:49 PM
    Author     : radia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
   <body>
        <form action="arithmetic" method="POST">
            <h1>Arithmetic Calculator</h1>
            First: <input type="text" name="FirstNumber" value="${FirstNumber}">
            Second: <input type="text" name="SecondNumber" value="${SecondNumber}">
            <input type="submit" name="calculate" value="+">
            <input type="submit" name="calculate" value="-">
            <input type="submit" name="calculate" value="*">
            <input type="submit" name="calculate" value="%">
        </form>
        Result: ${result}
        <a href="age">Age Calculator></a>
 
    </body>
</html>

