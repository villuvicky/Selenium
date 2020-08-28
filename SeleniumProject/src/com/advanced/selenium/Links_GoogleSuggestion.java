package com.advanced.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_GoogleSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement enterbox=driver.findElement(By.name("q"));
		enterbox.sendKeys("netflix"+Keys.ENTER);
		Thread.sleep(4000);
		List<WebElement> Sites=driver.findElements(By.xpath("//*[cite]"));
		for (WebElement webElement : Sites) {
			System.out.println(webElement.getText());
			
		}
	}

}
