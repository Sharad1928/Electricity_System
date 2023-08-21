<%@page import="java.sql.*"%>
<html>
<%@include file="common2.jsp"%>


<form action="search.jsp">
<div id="mydata">
<center>
<table cellpadding="12">
<tr>
<td>Enter Roll.No</td>
<td><input type="text" placeholder="Enter Roll.No"  name="u1" class="A"></td>
</tr>


<tr>
<th colspan="2"><input type="submit" class="B" value="search" name="b1"></th>
</tr>
</table>
    
</center>
</div>
</form>
<%
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
	out.println("<tr>");
        out.println("<th>Roll.No</th>");
	out.println("<td>"+rs.getString(1)+"</td>");
        out.println("<tr>");
        out.println("<tr>");
        out.println("<th>Name</th>");
	out.println("<td>"+rs.getString(2)+"</td>");
        out.println("<tr>");
        out.println("<tr>");
        out.println("<th>Phy mark</th>");
	out.println("<td>"+rs.getString(3)+"</td>");
        out.println("<tr>");
        out.println("<tr>");
        out.println("<th>Che mark</th>");
	out.println("<td>"+rs.getString(4)+"</td>");
        out.println("<tr>");
        out.println("<tr>");
        out.println("<th>Maths mark</th>");
	out.println("<td>"+rs.getString(5)+"</td>");
        out.println("<tr>");
	
}	
else{
out.println("INvalid no.");    
}
out.println("</center>");
out.println("</table>");
con.close();
}

catch(Exception e1){
out.println(e1);
}
}
%>
</html>