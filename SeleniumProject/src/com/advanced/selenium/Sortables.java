package com.advanced.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com/pages/sortable.html");
		List<WebElement> allnumbers=driver.findElements(By.xpath("/html/body/div/div/div[3]/ul/li"));
		WebElement from=allnumbers.get(3);
		WebElement to=allnumbers.get(2);
		Actions action= new Actions(driver);
		action.dragAndDrop(from,to).build().perform();	
	}

}
