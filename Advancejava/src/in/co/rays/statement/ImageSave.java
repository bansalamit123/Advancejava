package in.co.rays.statement;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.co.rays.util.JDBCDataSource;

public class ImageSave  {
	public static void main(String[] args) throws Exception {
		Connection conn=JDBCDataSource.getConnection();
	PreparedStatement ps=conn.prepareStatement("insert into images(pic)values(?)");
	FileInputStream fis=new FileInputStream("C:\\Users\\Amit\\OneDrive\\Desktop\\images\\mypic.jpg");
	ps.setBinaryStream(1,fis,fis.available());
	ps.executeUpdate();
	System.out.println("done...!!!!");
	
	

}
}