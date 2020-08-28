package com.advanced.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com/pages/Calendar.html");
		WebElement datepicker=driver.findElement(By.id("datepicker"));
		datepicker.click();
		WebElement nextbutton=driver.findElement(By.xpath("//a[@title='Next']"));
		nextbutton.click();
		WebElement date=driver.findElement(By.xpath("//a[contains(text(),10)]"));
		date.click();
	}

}
