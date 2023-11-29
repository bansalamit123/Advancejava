package in.com.preapared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance06", "root", "root");
		PreparedStatement ps=conn.prepareStatement("insert into marksheet values(22,'amit',111,45,65,70)");
		int i=ps.executeUpdate();
		System.out.println("Data Insert using prepared statement"+ i);
		
		
		
		
		
		
	}

}
