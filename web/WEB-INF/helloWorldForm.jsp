<%-- 
    Document   : helloWorldForm
    Created on : Jan 23, 2023, 5:35:09 PM
    Author     : burha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="post" action="hello">
            First name: <input type="text" name="firstname" value="${firstname}"><br>
            Last name: <input type="text" name="lastname" value="${lastname}"><br>
            <input type="submit" value="Submit">
                       
        </form>
            <c:if test="${invalid==true}">
                <p>Invalid entry, Please enter both your first and last name</p>
            </c:if>
            
    </body>
    
</html>
