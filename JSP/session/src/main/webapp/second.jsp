<%-- 
    Document   : second.jsp
    Created on : Apr 13, 2024, 12:53:57 AM
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
         <h1>welcome to second page</h1>
        <form action="sessionpage.jsp">
            <input type="text" name="uname">
            <input type="text" name="password">
            <input type="submite" name="clicked it!!">
        </form>
        <% 
            String name = request.getParameter("uname");
            out.print("welcom :"+ name);
            session.setAttribute("uname", name);
            %>
            <a href="sessionpage.jsp">Redirected towards another page
            </a>
    </body>
</html>
