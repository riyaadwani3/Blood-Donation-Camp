package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public final class retrivedbcForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body class=\"background\">\n");
      out.write("         ");

   
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
          
    
      out.write("\n");
      out.write("    \n");
      out.write("    <table border=\"0\" cellpadding=\"7\" cellspacing=\"7\">\n");
      out.write("        \n");
      out.write("            \n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <td><b>Name</b></td>\n");
      out.write("                <td><b>BloodGroup</b></td>\n");
      out.write("                <td><b>Age</b></td>\n");
      out.write("                <td><b>Weight</b></td>\n");
      out.write("                <td><b>MobileNo</b></td>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("            ");

                
             while(rs.next())  {
             
      out.write("\n");
      out.write("             <tbody>\n");
      out.write("             <tr>\n");
      out.write("                <td>");
      out.print(rs.getString("Name"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("BloodGroup"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getInt("Age"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getDouble("Weight"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getInt("MobileNo"));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write(" \n");
      out.write("             \n");
      out.write("             \n");
      out.write("            ");
 
             } 
            
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>    \n");
      out.write("    ");

    }
    catch(Exception e)
    {
        out.print(""+e.getMessage());
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
