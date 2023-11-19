package com.facebook.loginTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.facebook.base.BaseTest;
import com.facebook.loginPages.LoginPage;
import com.facebookUtilities.ScreenShot;
import com.facebookUtilities.PropertiesReader;

public class LoginTest extends BaseTest {// is a relationship
LoginPage loginpage;
PropertiesReader pr;

@BeforeSuite
 public void startSuites() {
	System.out.println("Running suites");
	
}
@AfterSuite
	public void afterSuites() {
	System.out.println("end suites");
}
@BeforeMethod(groups={"Smoke","Regression"})
public void openFacebook() {
	openApp();
}

@Test(priority=0, groups={"Smoke","Regression"})
public void loginTest() {
	pr=new PropertiesReader();
	loginpage=new LoginPage(driver);
	loginpage.usernameMethod(pr.getUserName());
	loginpage.passWordMethod(pr.getPassword());
	loginpage.loginButton();
	try {
		//LoginPage sc= new LoginPage(driver);
		ScreenShot sc= new ScreenShot();
		sc.screenShot("login");
	} catch (Exception e) {
	
		e.printStackTrace();
	}
} 
@Test(priority=1, groups="Regression")
public void loginTest1() {
	pr=new PropertiesReader();
	loginpage=new LoginPage(driver);
	loginpage.usernameMethod(pr.getUserName());
	loginpage.passWordMethod(pr.getPassword());
	loginpage.loginButton();
	Assert.assertEquals("Hello", "Hello");
} 
@AfterMethod(groups={"Smoke","Regression"})
public void closeFacebook() {
	closeApp();
}
}
