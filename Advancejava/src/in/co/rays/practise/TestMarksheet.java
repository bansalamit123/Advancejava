package in.co.rays.practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
		addRecord();
	}

	private static void addRecord() throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance06","root","root");
		      PreparedStatement ps=conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
		      ps.setInt(1,27);
		      ps.setString(2,"jj");
		      ps.setInt(3, 300);
		      ps.setInt(4, 88);
		      ps.setInt(5,88);
		      ps.setInt(6, 88);
		      int i=ps.executeUpdate();
		      System.out.println("insert data sucessfully "+i);
		      
		      
		}

}
