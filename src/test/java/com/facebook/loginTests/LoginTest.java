package com.facebook.loginTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.base.BaseTest;
import com.facebook.loginPages.LoginPage;
import com.facebookUtilities.PropertiesReader;

public class LoginTest extends BaseTest {// is a relationship
LoginPage loginpage;
PropertiesReader pr;

@BeforeMethod
public void openFacebook() {
	openApp();
}

@Test
public void loginTest() {
	pr=new PropertiesReader();
	loginpage=new LoginPage(driver);
	loginpage.usernameMethod(pr.getUserName());
	loginpage.passWordMethod(pr.getPassword());
	loginpage.loginButton();
} 
//@AfterMethod
public void closeFacebook() {
	closeApp();
}
}
