import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class upd extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
PrintWriter out=response.getWriter();
out.println("<html>");
out.println("<body>");
out.println("<html><head><link rel='stylesheet' href='kamal.css'/></head><div id='mymenu'><ul><li> Home</li>\n" +
"<li><a href=\"insert.html\"> Insert </a></li>\n" +
"<li><a href=\"showall.html\"> showall </a> </li>\n" +
"<li><a href=\"serch.html\">Search</a></li>\n" +
"<li><a href=\"update.html\"> Update </a> </li>\n" +
"<li><a href=\"delete.html\"> Delete </a> </li></ul></div><form action='updatedemo'><div id='mydata'></table></div></form></html>");
String s1=request.getParameter("u1");
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql:///ajava77","root","root");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from inmark where RN='"+s1+"'");
out.println("<center>");
out.println("<table cellpadding='12' border=1>");
if(rs.next()){
    out.println("<form action='updatedemo'>");
	out.println("<tr>");
        out.println("<th>Roll.No</th>");
	out.println("<td><input type='text' value='"+rs.getString(1)+"'name=u1></td>");
        out.println("<tr>");
        out.println("<tr>");
        out.println("<th>Name</th>");
	out.println("<td><input type='text' value='"+rs.getString(2)+"'name=u2></td>");
        out.println("<tr>");
        out.println("<tr>");
        out.println("<th>Phy mark</th>");
        out.println("<td><input type='text' value='"+rs.getString(3)+"' name=u3></td>");
        out.println("<tr>");
        out.println("<tr>");
        out.println("<th>Che mark</th>");
	out.println("<td><input type='text' value='"+rs.getString(4)+"'name=u4></td>");
        out.println("<tr>");
        out.println("<tr>");
        out.println("<th>Maths mark</th>");
	out.println("<td><input type='text' value='"+rs.getString(5)+"'name=u5></td>");
        out.println("<tr>");
        
        out.println("<tr>");
	out.println("<th colspan=\"2\"><input type=\"submit\" class=\"B\" value=\"Update\"></th>\n" +
"");
        out.println("<tr>"); 
        out.println("</form>");
        
}	
out.println("</center>");
out.println("</table>");
con.close();
}

catch(Exception e1){
out.println(e1);
}
out.println("<body>");
out.println("<html>");
out.close();
}
}