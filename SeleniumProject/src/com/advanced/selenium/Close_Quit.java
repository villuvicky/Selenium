package com.advanced.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Quit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");	
		driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button")).click();
	driver.close();
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\villu\\Downloads\\chromedriver.exe"); WebDriver driver1 = new
		 * ChromeDriver(); driver1.manage().window().maximize();
		 * driver1.get("http://www.leafground.com/pages/Window.html");
		 * driver1.findElement(By.xpath(
		 * "/html/body/div/div/div[3]/section/div[2]/div/div/button")).click();
		 * driver1.quit();
		 */
	}

}
