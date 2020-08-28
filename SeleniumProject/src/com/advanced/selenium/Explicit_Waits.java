package com.advanced.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123"+Keys.ENTER);
		WebDriverWait wait= new WebDriverWait(driver,10);
		WebElement welcome_button= wait.until(ExpectedConditions.elementToBeClickable((By.id("welcome"))));
		welcome_button.click();
		WebDriverWait wait2= new WebDriverWait(driver,10);
		WebElement logout= wait2.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[text()='Logout']"))));
		logout.click();

	}

}
