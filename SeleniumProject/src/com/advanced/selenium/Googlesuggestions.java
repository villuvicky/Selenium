package com.advanced.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement enterbox=driver.findElement(By.name("q"));
		enterbox.sendKeys("n");
		Thread.sleep(4000);
		List<WebElement> options=driver.findElements(By.xpath("/html/body/div/div[2]/form/div[2]/div[1]/div[2]/div[2]/ul/li"));
		int size=options.size();
		System.out.println(size);
		for (WebElement suggestedelements : options) {
			if(suggestedelements.getText().contains("flix")) {
				suggestedelements.click();
				break;
			}
		}




	
	}

}
