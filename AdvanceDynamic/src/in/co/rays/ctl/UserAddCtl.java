package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;
import in.co.rays.util.DataUtility;
@WebServlet ("/UserAddCtl.do")
public class UserAddCtl extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserModel model=new UserModel();
		UserBean bean=new UserBean();
		String edit=req.getParameter("edit");
		if(edit!=null) {
			try {
				bean=model.findByPk(Integer.parseInt(edit));
				req.setAttribute("editmsg", "Editing your record!!");
				req.setAttribute("userbean", bean);
			
			} catch ( Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
			
			RequestDispatcher rd=req.getRequestDispatcher("UserAddTableView.jsp");
			rd.forward(req,resp);
		
	}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String operation=req.getParameter("operation");
		String id=req.getParameter("id");
		String fname=req.getParameter("firstName");
		String lname=req.getParameter("lastName");
		String login=req.getParameter("loginId");
		String password=req.getParameter("password");
		String dob=req.getParameter("dob");
		String address=req.getParameter("address");
		
		UserBean bean=new UserBean();
		bean.setFirstName(fname);
		bean.setLastName(lname);
		bean.setLoginId(login);
		bean.setPassword(password);
		bean.setDob(DataUtility.stringToDate(dob));
		bean.setAddress(address);
		UserModel model= new UserModel ();
		if(operation.equals("save")) {
			
			
			try {
				model.add(bean);
				req.setAttribute("msg", "Data inserted..!!");
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	     	//resp.sendRedirect("UserRegistrationView.jsp");
			

			
		}
		if(operation.equals("update")) {
bean.setId(Integer.parseInt(id));
			try {
				model.update(bean);
			bean=model.findByPk(Integer.parseInt(id));
				req.setAttribute("userbean", bean);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	     	//resp.sendRedirect("UserRegistrationView.jsp");
			req.setAttribute("msg", "Data Updated..!!");
			

			
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("UserAddTableView.jsp");
		rd.forward(req, resp);
	}

}
