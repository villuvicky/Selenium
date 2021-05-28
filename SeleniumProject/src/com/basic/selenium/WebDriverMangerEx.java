package com.basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMangerEx {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		WebDriverManager.chromedriver().browserVersion("88.0.4324").setup();
		WebDriverManager.chromedriver().driverVersion("88.0.4324.96").setup();
		driver= new ChromeDriver();
		
	}

}
