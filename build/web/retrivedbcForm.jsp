<%-- 
    Document   : retrivedbcForm
    Created on : 2 Oct, 2019, 7:03:28 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*,java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-image: url(retrive.jpg);
    background-size:800px 800px;
    background-position: center top;
    background-repeat: no-repeat">
         <%
   
    String driver="com.mysql.jdbc.Driver";
    String connectionUrl="jdbc:mysql://localhost:3306/";
    String database="blooddonationcamp";
    String userid="root";
    String password="";
    try
    {
    Class.forName(driver);
    Connection conn= DriverManager.getConnection(connectionUrl+database,userid,password);
    Statement st=conn.createStatement();
    ResultSet rs=null;
    String sql="select * from  bdcform";
    rs=st.executeQuery(sql);
          
    %>
    
    <table border="0" cellpadding="7" cellspacing="7">
        
            
        <thead>
            <tr>
                <td><b>Name</b></td>
                <td><b>BloodGroup</b></td>
                <td><b>Age</b></td>
                <td><b>Weight</b></td>
                <td><b>MobileNo</b></td>
            </tr>
        </thead>
            <%
                
             while(rs.next())  {
             %>
             <tbody>
             <tr>
                <td><%=rs.getString("Name")%></td>
                <td><%=rs.getString("BloodGroup")%></td>
                <td><%=rs.getInt("Age")%></td>
                <td><%=rs.getDouble("Weight")%></td>
                <td><%=rs.getInt("MobileNo")%></td>
            </tr>
 
             
             
            <% 
             } 
            %>
        </tbody>
    </table>    
    <%
    }
    catch(Exception e)
    {
        out.print(""+e.getMessage());
    }
    %>
    </body>
</html>
