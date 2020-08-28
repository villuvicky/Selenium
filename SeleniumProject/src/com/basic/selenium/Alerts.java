package com.basic.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");
		WebElement displayalert= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/button"));
		displayalert.click();
		Alert alert1=driver.switchTo().alert();
		Thread.sleep(3000);
		alert1.accept();
		WebElement confirmalert= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
	    confirmalert.click();
		Alert alert2=driver.switchTo().alert();
		Thread.sleep(3000);
		alert2.dismiss();
		WebElement promptbox=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/button"));
		promptbox.click();
		Alert alert3=driver.switchTo().alert();
		String value=alert3.getText();
		System.out.println(value);
		alert3.sendKeys("got you");
		alert3.accept();
		
	}

}
