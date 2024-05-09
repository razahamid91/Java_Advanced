<%-- 
    Document   : outer.jsp
    Created on : Apr 13, 2024, 12:52:52 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP  implicit Page</title>
    </head>
    <body>
             <h1>   implicit page  </h1>
       <%
String myname=request.getParameter("name1");
out.print(myname);
%>
<%
String s= (String) session.getAttribute("session_name");
out.print(s);
%>
    </body>
</html>
