package in.co.rays.transacationhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestTransactionHandling {
	public static void main(String[] args) throws Exception {
		Connection conn=null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance06","root","root");
			Statement stmt=conn.createStatement();
			int i=stmt.executeUpdate("insert into  emp1 values (12,'abc',1000)");
		 i=stmt.executeUpdate("insert into emp1 values (12,'abc',1000)");
			 i=stmt.executeUpdate("insert into  emp1 values (12,'abc',1000)");
			System.out.println("Data inserted"+i);
			
	
			
			
		}
		
		
	}


