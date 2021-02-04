package com.basic.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver;
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		Driver = new ChromeDriver(options);
	}

}
