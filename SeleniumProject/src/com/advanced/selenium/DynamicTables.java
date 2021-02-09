package com.advanced.selenium;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com/pages/table.html");
		List<WebElement> columns=driver.findElements(By.tagName("th"));
		int columns_size=columns.size();
		System.out.println("Total columns are "+columns_size);
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int rows_size=rows.size();
		System.out.println("Total rows are "+rows_size);
		WebElement progress=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String Progress=progress.getText();
		
		System.out.println("The Progress is "+Progress);
		List<WebElement> allprogress=driver.findElements(By.xpath("//td[2]"));
		List<Integer> array= new ArrayList<Integer>();
		
		for (WebElement singleprogress : allprogress) {
			String PROGRESS=singleprogress.getText().replace("%", "");
			array.add(Integer.parseInt(PROGRESS));
		}
		int minimum=Collections.min(array);
		System.out.println("minimum is "+minimum);
		String finalvalue=Integer.toString(minimum)+"%";
		String finalXpath="//td[normalize-space()="+"\""+ finalvalue +"\""+"]"+"//following::td[1]//input";
		System.out.println(finalXpath);
		driver.findElement(By.xpath(finalXpath)).click();
		
	}

}
