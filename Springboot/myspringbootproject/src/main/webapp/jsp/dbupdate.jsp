<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update record</title>
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
	out.println("<br>Mysql connection success");
	Statement st=con.createStatement();
	int rs=st.executeUpdate("update student set mark="+mark+",result='"+result+"' where rno="+rno);
	if(rs==1){
		out.println("<br><font size='7' color='green'>Data Updated succesfully</font>");
	}
}
catch(Exception e){
	out.println("<h1>Error:"+e.toString()+"</h1>");
}

%>
</body>
</html>