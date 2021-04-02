package PoMApproach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private static WebDriver driver;

	public LoginPage(WebDriver driver) {
		
		LoginPage.driver=driver;
	}

	private static By username= By.id("txtUsername");
	private static By password= By.id("txtPassword");
	private static By LoginButton= By.id("btnLogin");
	
	public void EnterUserName() {
		driver.findElement(username).sendKeys("Admin");
	}
	public void EnterPassword() {
		driver.findElement(password).sendKeys("admin123");
	}

	public static HomePage LoginButton() {
		driver.findElement(LoginButton).click();
		return new HomePage(driver);
	}

}
