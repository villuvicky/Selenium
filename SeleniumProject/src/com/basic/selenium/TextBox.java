package com.basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Edit.html");
		WebElement Email = driver.findElement(By.id("email"));
		Thread.sleep(3000);
		Email.sendKeys("villuvicky15@gmail.com");
		WebElement Append = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input"));
		Thread.sleep(3000);
		Append.sendKeys("Done");
		WebElement defaulttext = driver.findElement(By.name("username"));
		Thread.sleep(3000);
		String value= defaulttext.getAttribute("value");
		System.out.println(value);
		WebElement clearpath= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/input"));
		Thread.sleep(3000);
		clearpath.clear();
		WebElement disable = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input"));
		boolean enabled= disable.isEnabled();
		System.out.println(enabled);
	}

}
