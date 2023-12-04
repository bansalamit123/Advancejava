package in.co.rays.practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementCrud {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance06","root","root");
	//	PreparedStatement ps=conn.prepareStatement("insert into marksheet values(27,'jualu',600,40,40,40)");
		//PreparedStatement ps=conn.prepareStatement("update marksheet set name='kallu'where id=27");
		PreparedStatement ps=conn.prepareStatement("delete from marksheet where id=27");
		int i=ps.executeUpdate();
		System.out.println("Data worked Successfully "+i );
	}

}
