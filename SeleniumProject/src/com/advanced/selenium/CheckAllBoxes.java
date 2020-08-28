package com.advanced.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAllBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		List<WebElement> CheckBox= driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement webElement : CheckBox) {
			if (webElement.isSelected()) {
				
			}else
				webElement.click();
		}
	}

}
