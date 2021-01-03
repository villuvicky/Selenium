package com.basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\villu\\Downloads\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
	

	driver.get("https://www.youtube.com/");
	
	driver.findElement(By.name("search_query")).sendKeys("Pulsar 125 review");
	
	driver.findElement(By.id("search-icon-legacy")).click();
	}
}
