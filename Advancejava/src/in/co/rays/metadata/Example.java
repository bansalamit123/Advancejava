package in.co.rays.metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import in.co.rays.util.JDBCDataSource;

public class Example {
	public static void main(String[] args) throws Exception {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance06","root","root");
		Connection conn=JDBCDataSource.getConnection();
		PreparedStatement ps=conn.prepareStatement("select id,name,color from emp2");
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData rsmt=(ResultSetMetaData)rs.getMetaData();
		System.out.println("Catlog Name "+rsmt.getCatalogName(1));
		System.out.println("Table Name "+rsmt.getTableName(1));
		int columnCount=rsmt.getColumnCount();
		System.out.println("Total Count"+columnCount);
		for(int i=1;i<=columnCount;i++) {
			System.out.println("Column:"+(i));
			System.out.println("Label:"+rsmt.getColumnLabel(i));
			System.out.println("Name:"+rsmt.getColumnLabel(i));
			System.out.println("Type:"+rsmt.getColumnTypeName(i));
			System.out.println("Size:"+rsmt.getColumnDisplaySize(i));
			System.out.println("Precision:"+rsmt.getPrecision(i));
			System.out.println();
		
		}
	}

}
