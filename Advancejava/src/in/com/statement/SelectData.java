package in.com.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectData {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance06", "root", "root");

		Statement stmt = conn.createStatement();
         ResultSet rs=stmt.executeQuery("select id,name from marksheet");
         while(rs.next()) {
        	   System.out.print(rs.getInt(1));
        	  System.out.println("\t"+rs.getString(2));

	
	}
      
       

}
}