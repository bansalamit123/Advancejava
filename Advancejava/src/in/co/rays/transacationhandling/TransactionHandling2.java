package in.co.rays.transacationhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionHandling2 {
	public static void main(String[] args) throws Exception {
		
	Connection conn=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance06","root","root");
		conn.setAutoCommit(false);// bydefault this method of return type is true
		Statement stmt=conn.createStatement();
		int i=stmt.executeUpdate("insert into  emp1 values (12,'abc',1000)");
	 i=stmt.executeUpdate("insert into emp1 values (12,'abc',1000)");
		 i=stmt.executeUpdate("insert into  emp1 values (12,'abc',1000)");
		//conn.commit();
		System.out.println("Data inserted"+i);
		
	} catch (Exception e) {
		// TODO: handle exception
		conn.rollback();
		System.out.println("Duplicate entry is not allowed");
		
	}
	
	
}

}
