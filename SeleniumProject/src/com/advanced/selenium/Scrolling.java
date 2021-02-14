package com.advanced.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		
		 executor.executeScript("window.scroll(0,75)", ""); Thread.sleep(3000);
		 executor.executeScript("window.scroll(0,-22)", ""); Thread.sleep(3000);
		 
		 executor.executeScript("window.scroll(0,document.body.scrollHeight)", "");
		  Thread.sleep(3000); executor.executeScript("window.scroll(0,0)", "");
		
		WebElement frames=driver.findElement(By.xpath(
		 "/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[10]/a"));
		
		 executor.executeScript("arguments[0].scrollIntoView(true);", frames);
		 
		/*Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);*/
	}

}
