<%-- 
    Document   : donarReg
    Created on : 1 Oct, 2019, 5:24:59 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*,java.io.*,java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css.css" type="text/css" rel="stylesheet">
    </head>
    <body background="donar.jpg">
        <%
            String name= request.getParameter("Name");
            int age= Integer.parseInt(request.getParameter("Age"));
            int weight= Integer.parseInt(request.getParameter("Weight"));
            String bg=request.getParameter("BloodGroup");
            String m= request.getParameter("MobileNo");
      
if(age>=18 && age<=50)
{
    if(weight>=40)
    {
        String driver ="com.mysql.jdbc.Driver";
            String connectionUrl = "jdbc:mysql://localhost:3306/";
            String database = "blooddonationcamp";
            String userid = "root";
            String password="";
            try
            {
                Class.forName(driver);
                Connection conn = DriverManager.getConnection(connectionUrl+database,userid,password);
                Statement st = conn.createStatement();
                String sql = "insert into bdcform(Name,BloodGroup,Age,Weight,MobileNo)values('"+name+"','"+bg+"','"+age+"','"+weight+"','"+m+"')";
                st.executeUpdate(sql);
                out.println("Data is successfully inserted!");
                
            }
            catch(Exception e)
                    {
                        System.out.println(e);
                        e.printStackTrace();
                        
                    }
            %>
            <center>
        <h1>You are eligible to donate blood.<br>
        You are successfully registered.<br>
        You have to be on blood donation camp in between 1 to 5 pm.
        </h1>
    </center>
    
            <%
    }
    else
    {
        out.print("You are not eligible for donating the blood because your weight is below 40");
    }
}
else
{
    out.print("You are not eligible for donating the blood because your age is below 18 or above 50");
}

    %>
        
    </body>
</html>
