package com.advanced.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act= new Actions(driver);
		act.contextClick(button).build().perform();
		
		
		driver.navigate().to("http://www.mouseprogram.com/double-click-game.html");
		//Actions act2= new Actions(driver);
		WebElement Element=driver.findElement(By.xpath("//a[normalize-space()='Return']"));
		Thread.sleep(3000);
		act.doubleClick(Element).build().perform();
		

	}

}
