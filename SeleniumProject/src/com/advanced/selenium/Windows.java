package com.advanced.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");
		String firstwindow=driver.getWindowHandle();
		WebElement secondwindowlink=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/button"));
		secondwindowlink.click();
		Set<String> allwindows=driver.getWindowHandles();
		for (String newwindow : allwindows) {
			driver.switchTo().window(newwindow);
			}
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a/img")).click();
		driver.close();
		driver.switchTo().window(firstwindow);
		WebElement multiplewindowlink=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		multiplewindowlink.click();
		int allwindowscount=driver.getWindowHandles().size();
		System.out.println(allwindowscount);
		WebElement allwindowslink=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/button"));
		allwindowslink.click();
		Set<String> allwindows2=driver.getWindowHandles();
		for (String currentwindow : allwindows2) {
			if(!currentwindow.equals(firstwindow)) {
				driver.switchTo().window(currentwindow);
				driver.close();
				}

		}

	}

}
