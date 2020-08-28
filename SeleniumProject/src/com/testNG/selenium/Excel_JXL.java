package com.testNG.selenium;


import java.io.FileInputStream;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel_JXL {
	WebDriver driver;
	String [][] data= null;

	@BeforeTest
	public void open_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		
		
	}
	@DataProvider(name="giving_data")
	public String[][] data_getting() throws BiffException, IOException {
		data=Excel_Read();
		return data;
	}
	public String[][] Excel_Read() throws BiffException, IOException {
		FileInputStream excel= new FileInputStream("C:\\Users\\villu\\Documents\\TestData_JXL.xls");
		Workbook workbook=Workbook.getWorkbook(excel);
		Sheet sheet=workbook.getSheet(0);
		int rows=sheet.getRows();
		int columns=sheet.getColumns();
		String excel_data[][]= new String [rows-1][columns];

		for(int i=1;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				excel_data[i-1][j]=sheet.getCell(j, i).getContents();

			}
		}
		return excel_data;
	}
	@Test(dataProvider = "giving_data")
	public void login(String username, String pwd) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement login=driver.findElement(By.id("txtUsername"));
		login.sendKeys(username);
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(pwd);
		driver.findElement(By.name("Submit")).click();
		driver.close();
	}

}
