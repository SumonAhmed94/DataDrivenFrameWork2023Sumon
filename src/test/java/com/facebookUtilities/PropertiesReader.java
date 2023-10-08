package com.facebookUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	Properties prop;

	public PropertiesReader() { // without user define parameterized constructor
		prop = new Properties(); // creating Refererancial object, intance variable
		String propertyFile = "src/test/resources/test.properties"; // file path

	 	try { // its says like if and else block
			
			FileInputStream fis = new FileInputStream("src/test/resources/test.properties");
			// fis job is navigate the file
			prop.load(fis); // prop job is load path

		} catch (IOException e) {

			e.printStackTrace(); // this called exceptional handling (try catch)
		}
		

	}

	public String readBrowser() { // this method for reading the file
		return prop.getProperty("browser");
	}	
	
	public String getQaUrl() {
		return prop.getProperty("qaUrl");
	}
	public String getUserName() {
		return prop.getProperty("userName");
	}
	public String getPassword() {
		return prop.getProperty("passwoed");
	
	}
	
public static void main(String[] args) {
	PropertiesReader pr = new PropertiesReader();
	String browsername = pr.readBrowser();
	System.out.println(browsername);
}
}
