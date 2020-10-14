package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.*;
import java.sql.*;

public final class donarReg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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

    
      out.write("\n");
      out.write("        \n");
      out.write("    <center>\n");
      out.write("        <h1>You are eligible to donate blood.<br>\n");
      out.write("        You are successfully registered.<br>\n");
      out.write("        You have to be on blood donation camp in between 1 to 5 pm.\n");
      out.write("        </h1>\n");
      out.write("    </center>\n");
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
