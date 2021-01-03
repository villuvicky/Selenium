package com.basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://google.co.in");
		driver.findElement(By.xpath("//*[@class='SDkEP']//div[2]//input")).sendKeys("Hey");*/
		//*[@class='SDkEP']//div[2]//child::input---child
		
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.name("search_query")).sendKeys("Pulsar 125 review");
		Thread.sleep(3000);
		driver.findElement(By.id("search-icon-legacy")).click();
	}

}
