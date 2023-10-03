package PROPERTIES;

import java.io.*;
import java.util.Properties;



public class propertiesreaddemo {
	public static void main(String[] args) {
		
		app pro=new app();
		
		try {
			FileReader freader=new FileReader("Documents/app.properties");
			pro.load(freader);
			String username=pro.getPropertiy("dbname");
			String pw=pro.getProperty("dbpwd");
			freader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	

}
