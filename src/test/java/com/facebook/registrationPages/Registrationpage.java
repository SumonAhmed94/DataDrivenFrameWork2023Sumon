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

}