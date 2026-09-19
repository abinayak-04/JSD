package databasework;
import java.sql.*;
import java.util.Scanner;
public class prgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter rno:");
		int rno=sc.nextInt();
		System.out.print("Enter Name:");
		String name=sc.next();
		System.out.print("Enter mark:");
		float mark=sc.nextFloat();
		System.out.print("Enter result(pass/fail):");
		String result=sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver accepted");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsd","root","12345");
			System.out.println("Connection success");
			
			// insert data
			Statement st=con.createStatement();
			int res=st.executeUpdate("insert into student values("+rno+",'"+name+"',"+mark+",'"+result+"')");
			if(res==1) {
				System.out.println("Data inserted successfully!");
			}
			
			st.close();con.close();
		}
		catch(Exception e){
			System.out.println("Error reason:"+e.toString());
		}
	}

}
