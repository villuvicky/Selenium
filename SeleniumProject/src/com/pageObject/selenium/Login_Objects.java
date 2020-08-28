package com.pageObject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Objects {
	
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.id("txtUsername"));	
	}
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("txtPassword"));	
	}
	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.name("Submit"));	
	}
}
