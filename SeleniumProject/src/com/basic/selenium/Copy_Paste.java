package com.basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copy_Paste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement UserName = driver.findElement(By.id("txtUsername"));
		Actions act = new Actions(driver);
		act.moveToElement(UserName).doubleClick().build().perform();
		UserName.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.id("txtPassword")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}

}
