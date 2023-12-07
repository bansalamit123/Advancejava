package in.co.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import in.co.rays.util.JDBCDataSource;

public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance06", "root", "root");
		 Connection conn=JDBCDataSource.getConnection();
		
		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("insert into marksheet values(45 'lavish', 110, 11, 12, 13)");

		System.out.println("Data Inserted = " + i);
	}
		
	
	}
	


