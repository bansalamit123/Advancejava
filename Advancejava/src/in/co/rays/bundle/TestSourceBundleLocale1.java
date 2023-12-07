package in.co.rays.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestSourceBundleLocale1 {
	public static void main(String[] args) {
		//ResourceBundle rb=ResourceBundle.getBundle("in.co.rays.bundle.new_hi_IN");
		ResourceBundle rb=ResourceBundle.getBundle("in.co.rays.bundle.new",new Locale("hi","IN"));
		System.out.println(rb.getString("language"));
		System.out.println(rb.getString("country"));
		 
		
	}

}
