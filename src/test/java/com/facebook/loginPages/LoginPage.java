package com.facebook.loginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(); 
		this.driver = driver;
		PageFactory.initElements(driver, this);  
	}

	@FindBy(how = How.ID, using = "email")
	WebElement userNameId; // creating variable

	public WebElement usernameMethod(String enterYourUsername) {
		// driver.findElement(By.id("email"));
		userNameId.sendKeys(enterYourUsername);// were using the upper line in here.
		return userNameId;
	}

	@FindBy(how = How.NAME, using = "pass")
	public WebElement passWordLocator;

	public WebElement passWordMethod(String enterYourPassword) {
		passWordLocator.sendKeys(enterYourPassword);
		return null;
	}

	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	private WebElement loginButton;

	public void loginButton() {
		loginButton.click();
	}

}
