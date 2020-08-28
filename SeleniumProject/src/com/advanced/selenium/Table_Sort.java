package com.advanced.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com/pages/sorttable.html");
//		List<WebElement> names=driver.findElements(By.xpath("//td[2]"));
//		int size=names.size();
//		System.out.println(size);
//		List<String> array= new ArrayList<String>();
//		for (WebElement webElement : names) {
//			String Person_name=webElement.getText();
//			array.add(Person_name);
//		}
//		System.out.println(array);
//		Collections.sort(array);
//		System.out.println(array);
		
		List<WebElement> header=driver.findElements(By.tagName("th"));
		List<String> headerarray= new ArrayList<String>();
		for (WebElement webElement : header) 
		{
			String header_name=webElement.getText();
			headerarray.add(header_name);
			
			}
		System.out.println(headerarray);
		WebElement Search_button=driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/label/input"));
		Search_button.sendKeys("1019");	
		List<WebElement> row=driver.findElements(By.xpath("//tr[1]//following::tr[1]"));
		List<String> rowarray= new ArrayList<String>();
		for (WebElement webElement : row)
		{
			String row_name=webElement.getText();
			rowarray.add(row_name);
	}
		System.out.println(rowarray);
		
	      
}
}