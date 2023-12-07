package in.co.rays.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import in.co.rays.util.JDBCDataSource;

public class TestProcedureIn {
	public static void main(String[] args) throws Exception {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance06","root","root");
		Connection conn=JDBCDataSource.getConnection();
		CallableStatement callStmt=conn.prepareCall("{call emp1in(?)}");
		callStmt.setInt(1,1);
		callStmt.execute();
		
		ResultSet rs=callStmt.getResultSet();
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			
		}
		
		
	}

}
