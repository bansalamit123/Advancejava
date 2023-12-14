package in.co.rays.ctl;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.coyote.http11.Http11AprProtocol;
import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;
import in.co.rays.util.DataUtility;
@WebServlet ("/UserRegistrationCtl")

public class UserRegistrationCtl extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		resp.sendRedirect("UserRegistrationView.jsp");
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-(generated method stub
		String fname=req.getParameter("firstName");
		String lname=req.getParameter("lastName");
		String login=req.getParameter("login");
		String password=req.getParameter("password");
		String dob=req.getParameter("dob");
		String address=req.getParameter("address");
		
//		
//		System.out.println(fname);
//		System.out.println(lname);
//		System.out.println(login);
//		System.out.println(password);
//		System.out.println(dob);
//		System.out.println(address);
		UserBean bean=new UserBean();
		bean.setFirstName(fname);
		bean.setLastName(lname);
		bean.setLoginId(login);
		bean.setPassword(password);
		bean.setDob(DataUtility.stringToDate(dob));
		bean.setAddress(address);
		UserModel model= new UserModel ();
		try {
			model.add(bean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
     	//resp.sendRedirect("UserRegistrationView.jsp");
		req.setAttribute("msg", "User Registered Successfully..!!");
		RequestDispatcher rd = req.getRequestDispatcher("UserRegistrationView.jsp");
		rd.forward(req, resp);

	}


}
