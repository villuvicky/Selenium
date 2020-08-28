package com.advanced.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaysToEnter {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in/");
		WebElement searchbox= driver.findElement(By.name("q"));
		//searchbox.sendKeys("Vicky");
		JavascriptExecutor  executor=(JavascriptExecutor) driver;
		//executor.executeScript("document.getElementsByName('q')[0].value='Vicky'", "");
		//executor.executeScript("arguments[0].value='Vicky'", searchbox);
		driver.switchTo().activeElement();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
	}

}
