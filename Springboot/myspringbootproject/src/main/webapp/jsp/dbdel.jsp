<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Record</title>
</head>
<body>
<%
int rno=Integer.parseInt(request.getParameter("rno"));
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	out.println("Driver Accepted");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsd","root","12345");
	out.println("<br>Mysql connection success");
	Statement st=con.createStatement();
	int rs=st.executeUpdate("delete from student where rno="+rno);
	if(rs==1){
		out.println("<br><font size='7' color='green'>Data deleted succesfully</font>");
	}
}
catch(Exception e){
	out.println("<h1>Error:"+e.toString()+"</h1>");
}
%>
</body>
</html>