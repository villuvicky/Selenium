package com.pageObject.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Login_POM {
	@Test
	public void login() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Login_Objects.username(driver).sendKeys("Admin");
	Login_Objects.password(driver).sendKeys("admin123");
	Login_Objects.submit(driver).click();
	driver.close();
	}
}
