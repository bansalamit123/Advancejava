package in.co.rays.marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
		// addRecord();
		// addRecord1(25,"praksh",505,98,65,64);
		//testAdd();
		//testUpdate();
	//	testDelete();
		findByPk();
		//search();
		//add1();
		//searchDynamic();
		
		
	}

	
private static void searchDynamic()throws Exception {
		// TODO Auto-generated method stub
	MarksheetModel model=new MarksheetModel();
	MarksheetBean bean=new MarksheetBean();
	//bean.setName("lavish");
	//bean.setRoll_no(101);
	List list=model.searchDynamic(bean,1,5);
	Iterator it=list.iterator();
	while(it.hasNext()) {
		 bean=(MarksheetBean) it.next();
		System.out.print(bean.getId());
		System.out.print("\t"+bean.getName());
		System.out.print("\t"+bean.getRoll_no());
		System.out.print("\t"+bean.getPhysics());
		System.out.print("\t"+bean.getChemistry());
		System.out.println("\t"+bean.getMaths());
		
		
	}

}
private static void add1() throws Exception {
		// TODO Auto-generated method stub
	MarksheetBean bean=new MarksheetBean();
	MarksheetModel model=new MarksheetModel();
	bean.setName("kk");
	bean.setRoll_no(10000);
	bean.setPhysics(4);
	bean.setChemistry(5);
	bean.setMaths(10);
	model.add1(bean);
	
		
	}


private static void search() throws Exception {
		// TODO Auto-generated method stub
	MarksheetModel model=new MarksheetModel();
	List list=model.search();
	Iterator it=list.iterator();
	while(it.hasNext()) {
		MarksheetBean bean=(MarksheetBean) it.next();
		System.out.print(bean.getId());
		System.out.print("\t"+bean.getName());
		System.out.print("\t"+bean.getRoll_no());
		System.out.print("\t"+bean.getPhysics());
		System.out.print("\t"+bean.getChemistry());
		System.out.println("\t"+bean.getMaths());
		
		
		
	}
	
		
	}
private static void findByPk() throws Exception {
		// TODO Auto-generated method stub
	MarksheetModel model=new MarksheetModel();
	MarksheetBean bean=model.findByPk(8);
	if (bean != null) {

		System.out.print(bean.getId());
		System.out.print("\t" + bean.getName());
		System.out.print("\t" + bean.getRoll_no());
		System.out.print("\t" + bean.getPhysics());
		System.out.print("\t" + bean.getChemistry());
		System.out.println("\t" + bean.getMaths());

	} else {
		System.out.println("ID not found...!!!");
	}

		
	}
private static void testDelete() throws Exception {
		
		MarksheetModel model = new MarksheetModel();
		model.delete(27);

	}


	private static void testUpdate() throws Exception {
		// TODO Auto-generated method stub
		MarksheetBean bean=new MarksheetBean();
		bean.setName("Bhupendra");
		bean.setRoll_no(500);
		bean.setPhysics(91);
		bean.setChemistry(100);
		bean.setMaths(100);
		bean.setId(27);
		MarksheetModel model = new MarksheetModel();

		model.update(bean);

		
		
		
		
		}
	private static void testAdd() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		bean.setId(27);
		bean.setRoll_no(113);
		bean.setName("dilip");
		bean.setPhysics(78);
		bean.setChemistry(89);
		bean.setMaths(78);

		MarksheetModel model = new MarksheetModel();

		model.add(bean);

	}
	/*private static void addRecord1(int id,String name,int roll_no,int physics, int chemistry,int maths) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance06","root","root" );
		PreparedStatement ps=conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3,roll_no);
		ps.setInt(4, physics);
		ps.setInt(5,chemistry);
		ps.setInt(6,maths);
		int i=ps.executeUpdate();
		System.out.println("Record Inserted "+i);
	
	
	
	}

	private static void addRecord() throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance06","root","root" );
		PreparedStatement ps=conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
		ps.setInt(1, 23);
		ps.setString(2, "prankul");
		ps.setInt(3,202);
		ps.setInt(4, 70);
		ps.setInt(5,99);
		ps.setInt(6,100);
		int i=ps.executeUpdate();
		System.out.println("Record Inserted "+i);
		
	}*/
	
}
