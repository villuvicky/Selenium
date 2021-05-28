package com.advanced.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement element=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavaScriptUtils.drawBorrder(element, driver);
		
		String Title=JavaScriptUtils.TitleOfPage(driver);
		System.out.println(Title);
		
		WebElement ClickElement=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		JavaScriptUtils.ClickElement(ClickElement, driver);
		
		JavaScriptUtils.GenerateAlert("This is an Alert", driver);
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
	
		JavaScriptUtils.ScrollDown(driver);
		Thread.sleep(3000);
		
		JavaScriptUtils.ScrollUp(driver);
		Thread.sleep(3000);
		
		WebElement Element2= driver.findElement(By.xpath("//input[@id='Company']"));
		JavaScriptUtils.MoveToElements(driver, Element2);
		
		JavaScriptUtils.ZoomPage(driver);
		
		
	}

}
