package com.pageObject.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login_wothout_findby {

	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement Submit;

	@Test
	public void login() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		PageFactory.initElements(driver, Login_wothout_findby.class);
		txtUsername.sendKeys("Admin");
		txtPassword.sendKeys("admin123");
		Submit.click();
		driver.close();
	}

}
