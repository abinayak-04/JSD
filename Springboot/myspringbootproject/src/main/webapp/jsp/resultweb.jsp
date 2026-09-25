<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result website</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f4f7f6;
        margin: 0;
        padding: 40px 20px;
    }

    form {
        background-color: #ffffff;
        max-width: 480px;
        margin: 0 auto;
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
    }

    h2 {
        color: #2c3e50;
        margin-top: 0;
        margin-bottom: 10px;
    }

    hr {
        border: 0;
        height: 1px;
        background: #e0e0e0;
        margin-bottom: 25px;
    }

    label {
        display: inline-block;
        width: 170px;
        font-weight: 600;
        color: #34495e;
        text-align: left;
        vertical-align: middle;
        white-space: nowrap;
    }

    input[type="text"], input[type="date"] {
        width: 220px;
        box-sizing: border-box;
        padding: 8px 12px;
        border: 1px solid #ccc;
        border-radius: 5px;
        font-size: 14px;
        outline: none;
        vertical-align: middle;
        transition: border-color 0.3s;
    }

    input[type="text"]:focus, input[type="date"]:focus {
        border-color: #3498db;
    }

    input[type="submit"] {
        background-color: #3498db;
        color: white;
        border: none;
        padding: 10px 30px;
        font-size: 15px;
        font-weight: bold;
        border-radius: 5px;
        cursor: pointer;
        transition: background-color 0.3s;
        margin-top: 10px;
    }

    input[type="submit"]:hover {
        background-color: #2980b9;
    }

    /* Style for Welcome Student greeting */
    center {
        font-size: 20px;
        font-weight: 600;
        color: #2c3e50;
        margin-top: 20px;
    }

    table {
        border-collapse: collapse;
        width: 75%;
        max-width: 850px;
        box-shadow: 0 4px 10px rgba(0, 0, 0, 0.08);
        border-radius: 8px;
        overflow: hidden;
        margin-top: 15px;
        background-color: #ffffff;
    }

    th {
        background-color: #2c3e50 !important;
        color: #ffffff;
        padding: 12px;
        font-size: 15px;
    }

    td {
        padding: 10px 15px;
        text-align: center;
        border-bottom: 1px solid #e0e0e0;
        color: #2c3e50;
    }

    tr:nth-child(even) {
        background-color: #f8f9fa;
    }

    tr:hover {
        background-color: #f1f1f1;
    }

    .pass-status {
        color: #27ae60;
        font-weight: bold;
    }

    .fail-status {
        color: #e74c3c;
        font-weight: bold;
    }
</style>
</head>
<body>
<%String rnoVal = request.getParameter("rno") != null ? request.getParameter("rno") : "";
String dobVal = request.getParameter("dob") != null ? request.getParameter("dob") : ""; %>


<form action="resultweb.jsp" method="post">
<Center>
<h2>Student Result</h2>
<hr>
<label>Register Number:</label><input type="text" Placeholder="Enter Register No" name="rno" value="<%= rnoVal %>"><br><br>
<label>Date of Birth:</label><input type="date" Placeholder="dd-mm-yyy" name="dob" value="<%= dobVal %>"><br><br>
<input type="submit" name="btnget" value="Get Result" >
</Center>
</form>

<%
String btn=request.getParameter("btnget");
if(btn!=null){
String rno=request.getParameter("rno");
String dob=request.getParameter("dob");
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_data","root","12345");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("Select * from login_stud where regno="+rno+" and stud_dob='"+dob+"'");
if(rs.next()){
	out.println("<br><center>Welcome  "+rs.getString("stud_name")+", </center>");
	
	Statement st1=con.createStatement();
	ResultSet rs1=st1.executeQuery("select * from student_marks where regno="+rno);
	
	out.println("<br><table border='4' bgcolor='skyblue' align='center'>");
	out.println("<tr><th>Subject Code</th><th>Subject Name</th><th>Mark</th><th>Grade</th><th>Result</th>");
	while(rs1.next()){
		out.println("<tr>");
		out.println("<td>"+rs1.getString("sub_code")+"</td>");
		out.println("<td>"+rs1.getString("sub_name")+"</td>");
		out.println("<td>"+rs1.getInt("marks")+"</td>");
		out.println("<td>"+rs1.getString("grade")+"</td>");
		out.println("<td>"+rs1.getString("result")+"</td>");
		out.println("</tr>");
	}
	out.println("</table>");
	
}
else{
	out.println("<center>Student with Register no ("+rno+") is not found! </center>");
}
}
catch(Exception e){
	out.println("Error:"+e.toString());
}
}
%>
</body>
</html>