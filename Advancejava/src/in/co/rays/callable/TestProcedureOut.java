package in.co.rays.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

import in.co.rays.util.JDBCDataSource;

public class TestProcedureOut {
	public static void main(String[] args) throws Exception {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance06","root","root");
		Connection conn=JDBCDataSource.getConnection();
		CallableStatement callStmt=conn.prepareCall("{CALL emp1OUT(?)}");
		callStmt.registerOutParameter(1, Types.INTEGER);
		callStmt.execute();
		
			System.out.println(callStmt.getInt(1));
		
		}
}
