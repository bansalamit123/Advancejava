package in.co.rays.practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementInsertCrud {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance06","root","root");
		Statement smt=conn.createStatement();
		//int i=smt.executeUpdate("insert into marksheet values(27,'lalu',500,50,50,50)");
		//int i=smt.executeUpdate("update marksheet set name='pk' where id=26");
		// int i=smt.executeUpdate("delete from marksheet where id=27" );
		         ResultSet rs= smt.executeQuery("select*from marksheet");
		         while(rs.next()) {
		        	 System.out.print(rs.getInt(1));
		        	 System.out.print("\t"+rs.getString(2));
		        	 System.out.print("\t"+rs.getInt(3));
		        	 System.out.print("\t"+rs.getInt(4));
		        	 System.out.print("\t"+rs.getInt(5));
		        	 System.out.println("\t"+rs.getInt(6));
		        	
		        	 
		         }
		         
			
	}

}
