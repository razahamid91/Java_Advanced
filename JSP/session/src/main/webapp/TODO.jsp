<%-- 
    Document   : TODO.jsp
    Created on : Apr 13, 2024, 12:51:55 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Request forward through action  tag </h1>
        <jsp:forward page="second.jsp">
            <jsp:param name="name" value="https://www.google.com/"/>
        </jsp:forward>
    </body>
</html>
