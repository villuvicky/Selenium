package com.basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		WebElement langselect=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[1]/input"));
		langselect.click();
		WebElement checkselected=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/input"));
		boolean value=checkselected.isSelected();
		System.out.println(value);
		WebElement checkselected1=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[1]/input"));	
		if(checkselected1.isSelected())
		{
			checkselected1.click();
		}
		WebElement checkselected2=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[2]/input"));		
		if(checkselected2.isSelected())
		{
			checkselected2.click();
		}
			
	}

}
