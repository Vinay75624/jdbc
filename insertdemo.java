package insertdemo;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertdemo {

	public static void main(String[] args) throws Exception
	{ 
	     Scanner kc = new Scanner(System.in);
	     String name1= kc.next();
	     String email1= kc.next();
	     String gender1= kc.next();
	     String city1= kc.next();
	     
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","1234");
		
		PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?)");
		ps.setString(1, name1);
		ps.setString(2, email1);
		ps.setString(3, gender1);
		ps.setString(4, city1);
        int i =ps.executeUpdate();
        if(i>0) {
        	System.out.println("success");
        }
        else {
        	System.out.println("fail");
        }
	}

}
