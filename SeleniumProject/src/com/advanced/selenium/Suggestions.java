package com.advanced.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		WebElement enterbox=driver.findElement(By.id("tags"));
		enterbox.sendKeys("s");
		Thread.sleep(4000);
		List<WebElement> options=driver.findElements(By.xpath("/html/body/ul/li"));
		int size=options.size();
		System.out.println(size);
		for (WebElement suggestedelements : options) {
			if(suggestedelements.getText().contains("elenium")) {
				suggestedelements.click();
				break;
			}
		}




	}

}
