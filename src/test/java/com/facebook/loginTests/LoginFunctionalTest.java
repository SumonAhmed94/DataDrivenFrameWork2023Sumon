package com.facebook.loginTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.facebook.base.BaseTest;
import com.facebook.loginPages.LoginPage;
import com.facebookUtilities.PropertiesReader;

public class LoginFunctionalTest extends BaseTest {
	LoginPage lp;
	PropertiesReader pr;
	
	@BeforeMethod
	public void openFacebook() {
		openApp();	
		lp=new LoginPage(driver);
		pr=new PropertiesReader();
	}
	
	@Test(priority=0)
	public void userNameTest() {
		lp=new LoginPage(driver);
		pr=new PropertiesReader();
		lp.usernameMethod(pr.getUserName());
	}
	@Test(priority=1)
	public void passwoedTest() {
		lp.passWordMethod(pr.getPassword());
	}
	@Test(priority=2)
	public void loginButtonTest() {
		lp.loginButton();
	}
	//@AfterTest
	public void closeFacebook() {
		closeApp();
		
	}
}
