<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Database insert</title>
</head>
<body>
<%
int rno=Integer.parseInt(request.getParameter("rno"));
String name=request.getParameter("name");
float mark=Float.parseFloat(request.getParameter("mark"));
String result="";
if(mark>34)
	result="pass";
else
	result="fail";
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	out.println("Driver Accepted");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsd","root","12345");
	out.println("<h1>Mysql connection success</h1>");
	Statement st=con.createStatement();
	int rs=st.executeUpdate("insert into student values("+rno+",'"+name+"',"+mark+",'"+result+"')");
	if(rs==1){
		out.println("Data inserted succesfully");
	}
}
catch(Exception e){
	out.println("<h1>Error:"+e.toString()+"</h1>");
}
out.println("<h3>Register no:"+rno+"</h3>");
out.println("<h3>Student name:"+name+"</h3>");
out.println("<h3>Mark:"+mark+"</h3>");
%>
</body>
</html>