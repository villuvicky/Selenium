package com.advanced.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PriceRangeSlider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.navigate().to("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement Minimum=driver.findElement(By.xpath("//span[1]"));
		WebElement Maximum = driver.findElement(By.xpath("//span[2]"));
		Actions act= new Actions(driver);
		act.dragAndDropBy(Minimum, 150, 0).perform();
		act.dragAndDropBy(Maximum, -150, 0).perform();

	}

}
