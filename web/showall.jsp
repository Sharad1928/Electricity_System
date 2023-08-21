<%@page import="java.sql.*"%>
<html>
<%@include file="common2.jsp"%>

<%
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql:///ajava77","root","root");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from inmark");
out.println("<center>");
out.println("<table cellpadding='12' border=1>");
out.println("<tr>");
out.println("<th>Customer ID</th>");
out.println("<th>Full Name</th>");
out.println("<th>Address</th>");
out.println("<th>Meter NO</th>");
out.println("<th>Due Amount</th>");
out.println("</tr>");
while(rs.next()){
	out.println("<tr>");
	out.println("<td>"+rs.getString(1)+"</td>");
	out.println("<td>"+rs.getString(2)+"</td>");
	out.println("<td>"+rs.getString(3)+"</td>");
	out.println("<td>"+rs.getString(4)+"</td>");
	out.println("<td>"+rs.getString(5)+"</td>");
}	
out.println("</center>");
out.println("</table>");
con.close();
}

catch(Exception e1){
out.println(e1);
}%>
</div>
</form>
</html>