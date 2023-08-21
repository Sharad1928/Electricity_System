<%@page import="java.sql.*"%>
<html>
<%@include file="common2.jsp"%>


<form action="upda.jsp">
<div id="mydata">
<center>
<table cellpadding="12">
<tr>
<td>Customer ID</td>
<td><input type="text" placeholder="Enter Customer ID"  name="u1" class="A"></td>
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
    %><form action="update2.jsp">
    <center>
<table cellpadding='12' border=1>
  
 <h1 style=\"color:LightGray;\">BillTech</h1>
       
	<tr>
        <th>Customer ID</th>
	<td><input type="text" value="<%=rs.getString(1)%>" name="n1"> </td>
        </tr>
        <tr>
        <th>Full Name</th>
	<td><input type="text" value="<%=rs.getString(2)%>" name="n2"> </td>
        </tr>
        <tr>
        <th>Address</th>
	<td><input type="text" value="<%=rs.getString(3)%>" name="n3"> </td>
        </tr>
        <tr>
        <th>Meter NO</th>
	<td><input type="text" value="<%=rs.getString(4)%>" name="n4"> </td>
        </tr>
        <tr>
        <th>Due Amount</th>
	<td><input type="text" value="<%=rs.getString(5)%>" name="n5"> </td>
        </tr>
        <tr>
        <th colspan="2"><input type="submit" class="B" value="update" name="b2"></th>
        </tr>
        </center>
        </form>
</table><%
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
%>
</html>