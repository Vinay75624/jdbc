package in.sp.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class updatedemo {

	public static void main(String[] args) throws Exception {
		
		 Scanner vc = new Scanner(System.in);
	     String city1= vc.next();
	     String email1= vc.next();
	    
	     
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","1234");
		
		PreparedStatement ps = con.prepareStatement("update register set city=? where email=?");
		ps.setString(1, city1);
		ps.setString(2, email1);
		
		int count = ps.executeUpdate();
		if(count >0) {
			System.out.println("updated");
		}
		else {
			System.out.println("update failed");
		}

	}

}
