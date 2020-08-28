package com.advanced.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Image.html");
		WebElement brokenimage=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/img"));
		String size=brokenimage.getAttribute("naturalWidth");
		if(size.equals("0")) {
			System.out.println("broken");
		}
	}

}
