package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;
@WebServlet("/LoginCtl")
public class LoginCtl extends HttpServlet {
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
		String ope=req.getParameter("operation");
		if(ope!=null) {
			HttpSession session=req.getSession();
			session.invalidate();
			
			
		}
		
		resp.sendRedirect("LoginView.jsp");
		
	}
  
  @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String loginid=req.getParameter("loginId");
		String password=req.getParameter("password");
		String uri=req.getParameter("uri");
		
		UserModel model=new UserModel();
		UserBean bean=new UserBean();
		try {
			bean=model.authenticate(loginid, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(bean!=null) {
			HttpSession session=req.getSession();
//			req.setAttribute("user", bean);
			session.setAttribute("user", bean);
			
			if(uri.equalsIgnoreCase("null")) {
				resp.sendRedirect("WelcomeCtl");
				
			}
			else {
				resp.sendRedirect(uri);
			}
			//session.setMaxInactiveInterval(10);
//			RequestDispatcher rd=req.getRequestDispatcher("Welcome2.jsp");
//			rd.forward(req, resp);
	}
		else {
			req.setAttribute("msg", "LoginId & Password is invalid...!!!");
		RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
		rd.forward(req, resp);
	}


			
}
}
