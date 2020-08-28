package com.pageObject.selenium;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Objects_FindBy {

	@FindBy(id="id")
	public static WebElement username; 
	
	@FindBy(id="txtPassword")
	public static WebElement password;

	@FindBy(name="submit")
	public static WebElement submit;

	
	
		
	}
