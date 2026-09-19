package databasework;
import java.sql.*;
import java.util.Scanner;
public class prgm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter  student rno to update details:");
		int rno=sc.nextInt();
		System.out.print("Enter  student name to update:");
		String name=sc.next();
		System.out.print("Enter  student mark to update:");
		float mark=sc.nextInt();
		System.out.print("Enter  student result to update:");
		String result=sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver accepted");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsd","root","12345");
			System.out.println("Connection success");
			
			// update data
			Statement st=con.createStatement();
			int res=st.executeUpdate("update student set sname='"+name+"',mark="+mark+",result='"+result+"' where rno="+rno);
			if(res==1) {
				System.out.println("Data updated successfully!");
			}
			else {
				System.out.println("Student rno not found!");
			}
			
			st.close();con.close();
		}
		catch(Exception e){
			System.out.println("Error reason:"+e.toString());
		}
	}

}
