package in.co.rays.preapared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteData {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance06","root","root");
		 PreparedStatement ps=conn.prepareStatement("delete from marksheet where id=22" );
		 int i=ps.executeUpdate();
		 System.out.println("delete data sucessfully "+ i);
	}

}
