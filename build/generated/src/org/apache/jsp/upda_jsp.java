package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class upda_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/common2.jsp");
  }

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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"kamal_1.css\"/>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<div id=\"mymenu\">\n");
      out.write("\n");
      out.write("<ul>\n");
      out.write("<li> Home</li>\n");
      out.write("<li><a href=\"insert.html\">new connection</a></li>\n");
      out.write("<li><a href=\"upda.jsp\">Submit bill</a></li>\n");
      out.write("<li><a href=\"logout.html\">logout</a></li>\n");
      out.write("</ul>\n");
      out.write("</div>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<form action=\"search.jsp\">\n");
      out.write("<div id=\"mydata\">\n");
      out.write("<center>\n");
      out.write("<table cellpadding=\"12\">\n");
      out.write("<tr>\n");
      out.write("<td>Enter Roll.No</td>\n");
      out.write("<td><input type=\"text\" placeholder=\"Enter Roll.No\"  name=\"u1\" class=\"A\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<th colspan=\"2\"><input type=\"submit\" class=\"B\" value=\"search\" name=\"b1\"></th>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("    \n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("</form>\n");

    String s=request.getParameter("b1");
if(s!=null){
    String s1=request.getParameter("u1");
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql:///ajava77","root","root");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from inmark where RN='"+s1+"'");
out.println("<center>");
out.println("<table cellpadding='12' border=1>");
if(rs.next()){
    
      out.write("<form action=\"update2.jsp\">\n");
      out.write("    <center>\n");
      out.write("<table cellpadding='12' border=1>\n");
      out.write("\t<tr>\n");
      out.write("        <th>Roll.No</th>\n");
      out.write("\t<td><input type=\"text\" value=\"");
      out.print(rs.getString(1));
      out.write("\" name=\"n1\"> </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("        <th>UName</th>\n");
      out.write("\t<td><input type=\"text\" value=\"");
      out.print(rs.getString(2));
      out.write("\" name=\"n2\"> </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("        <th>UPHY</th>\n");
      out.write("\t<td><input type=\"text\" value=\"");
      out.print(rs.getString(3));
      out.write("\" name=\"n3\"> </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("        <th>UCHE</th>\n");
      out.write("\t<td><input type=\"text\" value=\"");
      out.print(rs.getString(4));
      out.write("\" name=\"n4\"> </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("        <th>UMATH</th>\n");
      out.write("\t<td><input type=\"text\" value=\"");
      out.print(rs.getString(5));
      out.write("\" name=\"n5\"> </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("        <th colspan=\"2\"><input type=\"submit\" class=\"B\" value=\"update\" name=\"b2\"></th>\n");
      out.write("        </tr>\n");
      out.write("        </center>\n");
      out.write("        </form>\n");
      out.write("</table>");

}	
else{
out.println("INvalid no.");    
}

con.close();
}

catch(Exception e1){
out.println(e1);
}
}

      out.write("\n");
      out.write("</html>");
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
