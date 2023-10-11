package com.facebook.registrationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage {
	WebDriver driver;

	public Registrationpage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[starts-with(@id,'u_0_0_')]")
	private WebElement createNewAccount;

	public void CreateNewAccountButton() {
		createNewAccount.click();
	}

	@FindBy(how = How.NAME, using = "firstname")
	private WebElement firstName;

	public WebElement firstNameMethod(String enterYourFirstName) {
		firstName.sendKeys(enterYourFirstName);
		return firstName;

	}
	@FindBy(how = How.NAME, using = "lastname")
	private WebElement lastname;

	public WebElement lastNameMethod(String enterYourlastName) {
		lastname.sendKeys(enterYourlastName);
		return lastname;
	}
	@FindBy(how = How.NAME, using = "reg_email__")
	private WebElement mobilenumberandemail;

	public WebElement mobilenumberandemailMethod(String enterYourmobilenumberandemail) {
		mobilenumberandemail.sendKeys(enterYourmobilenumberandemail);
		return mobilenumberandemail;
}
	@FindBy(how = How.NAME, using = "reg_email_confirmation__")
	private WebElement mobilenumberandemail1;

	public WebElement mobilenumberandemail1Method(String enterYourmobilenumberandemail1) {
		mobilenumberandemail1.sendKeys(enterYourmobilenumberandemail1);
		return mobilenumberandemail1;
}
	@FindBy(how = How.NAME, using = "reg_passwd__")
	private WebElement password;

	public WebElement passWordMethod(String enterYourpassword) {
		password.sendKeys(enterYourpassword);
		return lastname;
}
}