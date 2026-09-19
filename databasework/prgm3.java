package databasework;
import java.sql.*;
import java.util.Scanner;
public class prgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter  student rno to delete:");
		int rno=sc.nextInt();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver accepted");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsd","root","12345");
			System.out.println("Connection success");
			
			// delete data
			Statement st=con.createStatement();
			int res=st.executeUpdate("delete from student where rno="+rno);
			if(res==1) {
				System.out.println("Data deleted successfully!");
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
