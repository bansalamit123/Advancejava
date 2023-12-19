package in.co.rays.test;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

public class TestUser  {
	public static void main(String[] args) throws Exception {
	     testAdd();
		//testSearch();
		
	}
	private static void testSearch() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();

		bean.setDob(sdf.parse("2001-01-01"));

		UserModel model = new UserModel();

		//List list = model.search(bean); it's will work when made search method only one argument pass
		List list = model.search(bean,1,1);   //it's a temporary 

		Iterator it = list.iterator();

	while (it.hasNext()) {

			bean = (UserBean) it.next();

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLoginId());
			System.out.print("\t" + bean.getPassword());
			System.out.print("\t" + bean.getDob());
			System.out.println("\t" + bean.getAddress());

		

	}
	}
	private static void testAdd() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();
		//bean.setId(2);
		bean.setFirstName("aditya");
		bean.setLastName("sharma");
		bean.setLoginId("aditya@gmail.com");
		bean.setPassword("123");
		bean.setDob(sdf.parse("2001-01-01"));
		bean.setAddress("indore");

		UserModel model = new UserModel();

		model.add(bean);

	}
	

}
