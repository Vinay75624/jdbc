package in.sp.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class deletedemo {

	public static void main(String[] args) throws Exception {
		Scanner vc = new Scanner(System.in);
	     
	     String email1= vc.next();
	    
	     
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","1234");
		
		PreparedStatement ps = con.prepareStatement("delete from  register where email=?");
		
		ps.setString(1, email1);
		
		int count = ps.executeUpdate();
		if(count >0) {
			System.out.println("delete");
		}
		else {
			System.out.println("delete failed");
		}


	}

}
