package com.advanced.selenium;



import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/selectable.html");
		List<WebElement> total=driver.findElements(By.xpath("/html/body/div/div/div[2]/div[2]/ol/li"));
		int size=total.size();
		System.out.println(size);
		Actions actions= new Actions(driver);
//		actions.keyDown(Keys.CONTROL).click(total.get(0)).click(total.get(1)).build().perform();
		actions.clickAndHold(total.get(0)).clickAndHold(total.get(1)).build().perform();
		
		
	}

}
