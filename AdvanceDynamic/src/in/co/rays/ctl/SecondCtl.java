package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SecondCtl")
public class SecondCtl extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  String fname=req.getParameter("firstName");
	  String lname=req.getParameter("lastName");
	  String address=req.getParameter("address");
	 // String address[]=req.getParameterValues("address");
	  System.out.println("doGet() method call");
	  System.out.println(fname);
	  System.out.println(lname);
	  System.out.println(address);
// for(String string:address) {
//	  System.out.println(string);
//  }
//	  
	 resp.sendRedirect("ThirdCtl");
	  
	}
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String fname=req.getParameter("firstName");
	  String lname=req.getParameter("lastName");
	  String address=req.getParameter("address");
	  System.out.println("doPost() method call");
	  System.out.println(fname);
	  System.out.println(lname);
	  System.out.println(address);
	//  resp.sendRedirect("ThirdCtl"); 
	  RequestDispatcher rs=req.getRequestDispatcher("ThirdCtl");
	  rs.forward(req, resp);
	  
}
}
