<%-- 
    Document   : login
    Created on : 3 Oct, 2019, 12:04:07 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String u=request.getParameter("Username");
            String p=request.getParameter("Password");
            
            if(u.equalsIgnoreCase("Admin") && p.equals("1234"))
            {
                response.sendRedirect("retrivedbcForm.jsp");
            }
            else
            {
                response.sendRedirect("sorry.html");
            }
        %>
    </body>
</html>
