package com.facebook.registrationTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.base.BaseTest;
import com.facebook.registrationPages.Registrationpage;
import com.facebookUtilities.ExcelReader;

public class RegistrationTest extends BaseTest {
	Registrationpage regPage;
	ExcelReader exReader;
	String file = "src/test/resources/registration.xlsx";
	String sheetName = "Sheet1";

	@BeforeMethod
	public void openFacebook() {
		openApp();
	}

	@Test
	public void createRegistrationTest() {
		regPage = new Registrationpage(driver);// has a relationship
		regPage.CreateNewAccountButton();
		exReader = new ExcelReader(file, sheetName);
		String firstName = exReader.getStringCellValue(1, 0);
		regPage.firstNameMethod(firstName);
	}
}
