<%@page import="java.sql.*"%>
<%
    String s11=request.getParameter("b2");
if(s11!=null){
    
String s1=request.getParameter("n1");
String s2=request.getParameter("n2");
String s3=request.getParameter("n3");
String s4=request.getParameter("n4");
String s5=request.getParameter("n5");
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql:///ajava77","root","root");
Statement st=con.createStatement();
st.executeUpdate("Update inmark set UN='"+s2+"',CM='"+s3+"',PM='"+s4+"',MM='"+s5+"' where RN='"+s1+"'");
response.sendRedirect("showall.jsp");

con.close();
}
catch(Exception e){

out.println(e);
}
    
}%>