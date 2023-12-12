package in.co.rays.preapared_statement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import in.co.rays.util.JDBCDataSource;

public class InsertFromUser{
	public static void main(String[] args) throws Exception {
		Connection conn=JDBCDataSource.getConnection();
		PreparedStatement ps=conn.prepareStatement("insert into marksheet(id,name) values(?,?)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Id: ");
		int id=Integer.parseInt(br.readLine());
		System.out.println("Enter name: ");
		String name=br.readLine();
		ps.setInt(1, id);
		ps.setString(2, name);
		int i=ps.executeUpdate();
		System.out.println("Data Insert using prepared statement"+ i);
		
		
		
		
		
		
	}

}
