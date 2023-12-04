package in.co.rays.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class TestProcedureInOut {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance06","root","root");
		CallableStatement callStmt=conn.prepareCall("{CALL emp1"
				+ "InOut(?)}");
		callStmt.setInt(1, 1);
		callStmt.registerOutParameter(1,Types.INTEGER);
		callStmt.execute();
		System.out.println(callStmt.getInt(1));
		
		
	}

}