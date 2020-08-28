package com.basic.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dropdown1= driver.findElement(By.id("dropdown1"));
		Select select= new Select(dropdown1);
		select.selectByIndex(2);

		WebElement dropdown2= driver.findElement(By.name("dropdown2"));
		Select select2= new Select(dropdown2);
		select2.selectByVisibleText("Selenium");
		
		WebElement dropdown3= driver.findElement(By.id("dropdown3"));
		Select select3= new Select(dropdown3);
		select3.selectByValue("3");
		List<WebElement> list=select3.getOptions(); //javautil_section
		int total=list.size();
		System.out.println(total);
		
		WebElement dropdown4= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/select"));
		dropdown4.sendKeys("Loadrunner");
		
		WebElement dropdown5=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[6]/select"));
		Select select4= new Select(dropdown5);
		select4.selectByVisibleText("Selenium");
		select4.selectByIndex(3);
		
	}

}
