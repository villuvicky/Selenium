package com.advanced.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
		WebElement firstbutton=driver.findElement(By.xpath("/html/body/button"));
		firstbutton.click();
		String text=firstbutton.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement secondone=driver.findElement(By.id("Click1"));
		secondone.click();
		driver.switchTo().defaultContent();
		List<WebElement> total=driver.findElements(By.tagName("iframe"));
		int totalframes= total.size();
		System.out.println(totalframes);

	}

}
