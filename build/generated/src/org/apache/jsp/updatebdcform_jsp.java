package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;

public final class updatebdcform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

            String driver="com.mysql.jdbc.Driver";
    String connectionUrl="jdbc:mysql://localhost:3306/";
    String database="blooddonationcamp";
    String userid="root";
    String password="";
    try
    {
        Class.forName(driver);
        
    }
    catch(ClassNotFoundException e)
    {
        e.printStackTrace();
    }
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    
        
      out.write("\n");
      out.write("        <h1>Retrieve data from database in jsp</h1>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name</td>\n");
      out.write("                    <td>BloodGroup</td>\n");
      out.write("                    <td>Age</td>\n");
      out.write("                    <td>Weight</td>\n");
      out.write("                    <td>MobileNo</td>\n");
      out.write("                    <td>Action</td>\n");
      out.write("                    <td>Delete</td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("                ");

                    try
                    {
                        connection= DriverManager.getConnection(connectionUrl+database,userid,password);
                        statement=connection.createStatement();
                        
                        String sql="select * from bdcform ";
                        resultSet=statement.executeQuery(sql);
                        while(resultSet.next())
                        {
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(resultSet.getString("Name"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(resultSet.getString("BloodGroup"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(resultSet.getInt("Age"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(resultSet.getDouble("Weight"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(resultSet.getInt("MobileNo"));
      out.write("</td>\n");
      out.write("                                <td><a href=\"update2bdcform.jsp?id=");
      out.print(resultSet.getString("MobileNo"));
      out.write("\">Update</a></td>\n");
      out.write("                                <td><a href=\"deletebdcform.jsp?id=");
      out.print(resultSet.getString("MobileNo"));
      out.write("\">Delete</a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                        }
                        connection.close();
                    }
                    catch(Exception e)
{
e.printStackTrace();
}
                        
                
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
