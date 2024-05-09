<%-- 
    Document   : newjsp
    Created on : Mar 29, 2024, 12:47:34 PM
    Author     : ASUS
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page language="java" %>
<%@ page import="java.util.Random" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Implicit object page</title>
    </head>
    <body>
        <h1>Implicit object</h1>
        <%
            String name ="Hamid";
            out.print(name);
           %>
           <%
               session.setAttribute("session_name", "Advance java Programming");
               out.print(session);
           %>
    </body>
</html>
