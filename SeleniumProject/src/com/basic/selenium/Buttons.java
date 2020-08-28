package com.basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Button.html");
		WebElement position = driver.findElement(By.id("position"));
		Point xy= position.getLocation();
		int X=xy.getX();
		int Y=xy.getY();
		System.out.println("X is "+X +"Y is "+Y);
		WebElement colorbutton = driver.findElement(By.id("color"));
		String color=colorbutton.getCssValue("background-color");
		System.out.println(color);
		WebElement buttonsize= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/button"));
		Dimension size=buttonsize.getSize();
		int height=size.getHeight();
		int width=size.getWidth();
		System.out.println("height is "+height +"width is "+width);
	}

}
