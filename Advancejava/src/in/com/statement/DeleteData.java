package in.com.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteData {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance06", "root", "root");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("delete from marksheet where id=22");

		System.out.println("Data Inserted = " + i);
	}

}
