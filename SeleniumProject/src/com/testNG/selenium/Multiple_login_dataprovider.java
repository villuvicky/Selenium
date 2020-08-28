package com.testNG.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multiple_login_dataprovider {
	
String[][] data= {
		{"Admin","admin123"},
		{"Admin1","admin123"}
};	
	
	@DataProvider(name="data_provider")
	public String[][] data_getting() {
		return data;
	}
	
	
	@Test(dataProvider ="data_provider" )
	public void login(String username,String pwd) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement login=driver.findElement(By.id("txtUsername"));
		login.sendKeys(username);
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(pwd);
		driver.findElement(By.name("Submit")).click();
		
	}
}
