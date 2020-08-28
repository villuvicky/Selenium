package com.advanced.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		WebElement homelink=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/a"));
		homelink.click();
		driver.navigate().back();
		WebElement findlink=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/a"));
		String link=findlink.getAttribute("href");
		System.out.println("The link is "+link);
		WebElement checklink=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/a"));
		checklink.click();
		String status=driver.getTitle();
		if (status.contains("404")) {
			System.out.println("link is not working");
		}
		driver.navigate().back();
		WebElement secondlink=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/a"));
		secondlink.click();
		driver.navigate().back();
		List<WebElement> linkfind=driver.findElements(By.tagName("a"));
		int totallinks=linkfind.size();
		System.out.println(totallinks);
	}

}
