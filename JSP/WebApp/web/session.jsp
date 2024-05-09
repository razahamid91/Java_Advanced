<%-- 
    Document   : session.jsp
    Created on : Apr 12, 2024, 12:18:36 PM
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
        <h1>Hello World!</h1>
         <%
            String name ="Hamid";
            out.print(name);
           %>
           <%
               session.setAttribute("session_name", "Advance java Programming");
               out.print(session);
           %>
           
           <form action ="outer.jsp" method ="get">
               <input type="text" name="name1" placeholder="enter your name"/>
               <input type="submit" value="click "
           </form>
    </body>
</html>
