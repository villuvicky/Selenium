package com.advanced.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Underlined_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in/");
		WebElement Tamil=driver.findElement(By.xpath("/html/body/div/div[4]/span/center/div[3]/div[1]/div/a[5]"));
		String beforehoverig=Tamil.getCssValue("text-decoration");
		System.out.println(beforehoverig);
		Actions actions= new Actions(driver);
		actions.moveToElement(Tamil);
		actions.perform();
		String afterhovering=Tamil.getCssValue("text-decoration");
		System.out.println(afterhovering);
		
	}

}
