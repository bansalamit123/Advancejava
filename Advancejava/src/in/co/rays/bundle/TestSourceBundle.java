package in.co.rays.bundle;

import java.util.Locale;
import java.util.ResourceBundle;



public class TestSourceBundle {
	public static void main(String[] args) {
		//ResourceBundle rb= ResourceBundle.getBundle("in.co.rays.bundle.app");
		//ResourceBundle rb= ResourceBundle.getBundle("in.co.rays.bundle.app_hi");
		//ResourceBundle rb= ResourceBundle.getBundle("in.co.rays.bundle.app_sp");
		//ResourceBundle rb= ResourceBundle.getBundle("in.co.rays.bundle.app",new Locale("hi"));
		ResourceBundle rb= ResourceBundle.getBundle("in.co.rays.bundle.app",new Locale("sp"));
		System.out.println(rb.getString("greeting"));
		
	}

}
