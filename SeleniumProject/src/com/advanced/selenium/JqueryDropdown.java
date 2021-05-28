package com.advanced.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		//driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[@class='comboTreeItemTitle'][normalize-space()='choice 1']")).click();
		/*
		 * List<WebElement> lists=driver.findElements(By.xpath(
		 * "//*[@id=\"comboTree750372DropDownContainer\"]/ul/li//span[@class='comboTreeItemTitle']//input[@type='checkbox']"
		 * )); for (WebElement webElement : lists) { webElement.click(); }
		 */



	}

}
