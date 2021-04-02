package com.pageObject.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login_PageFactory {

	@Test

	public static void login() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		PageFactory.initElements(driver, Login_Objects_FindBy.class);
		Login_Objects_FindBy.username.sendKeys("Admin");
		Login_Objects_FindBy.password.sendKeys("admin123");
		Login_Objects_FindBy.submit.click();
		driver.close();

	}

}
