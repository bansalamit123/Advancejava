package in.co.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import in.co.rays.util.JDBCDataSource;

public class DeleteData {
	public static void main(String[] args) throws Exception {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance06", "root", "root");
		Connection conn=JDBCDataSource.getConnection();
		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("delete from marksheet where id=22");

		System.out.println("Data Inserted = " + i);
	}

}
