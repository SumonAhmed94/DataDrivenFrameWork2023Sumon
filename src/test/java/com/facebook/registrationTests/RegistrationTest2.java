package com.facebook.registrationTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.base.BaseTest;
import com.facebook.registrationPages.Registrationpage;
import com.facebookUtilities.ExcelReader;

public class RegistrationTest2 extends BaseTest {
	Registrationpage regPage;
	ExcelReader exReader;
	String file = "src/test/resources/registration.xlsx";
	String sheetName = "Sheet1";
	
	@BeforeMethod(groups= {"Smoke", "Regression","Sprint3"})
	public void openFacebook() {
		openApp();
	
	}
	
	@Test(groups= {"Smoke", "Regression","Sprint3"})
	public void faizaRegistrationTest() {
		regPage = new Registrationpage(driver);// has a relationship
		regPage.createNewAccountButton();
		exReader = new ExcelReader(file, sheetName);
		String firstName = exReader.getStringCellValue(3, 0);
		regPage.firstNameField(firstName);
		regPage.lastNameField(exReader.getStringCellValue(3, 1));
		regPage.emailField(exReader.getStringCellValue(3, 3));
		regPage.reEnterEmail(exReader.getStringCellValue(3, 3));
		regPage.passwordField(exReader.getStringCellValue(3, 4));
		regPage.monthDropDownField(exReader.getStringCellValue(3, 5));
		regPage.dayDropDownField(exReader.getStringCellValue(3, 6));
		regPage.yearDropDownField(exReader.getStringCellValue(3, 7));
		regPage.radioButton(exReader.getStringCellValue(3, 8));
	}
	@AfterMethod(groups={"Smoke","Regression","Sprint3"})
		public void closeFacebook() {
		 closeApp();
		}
}

