<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sql connection</title>
</head>
<body>
<%
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	out.println("Driver Accepted");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsd","root","12345");
	out.println("<h1>Mysql connection success</h1>");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("Select * from student");
	out.println("<table border='4' bgcolor='skyblue' align='center'>");
	out.println("<tr><th>Regno</th><th>Student name</th><th>Mark</th><th>Result</th>");
	while(rs.next()){
		out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");
	}
	out.println("</table>");
}
catch(Exception e){
	out.println("<h1>Error:"+e.toString()+"</h1>");
}
%>
</body>
</html>