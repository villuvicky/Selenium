package com.testNG.selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Creds_From_Excel_POI {


	static List<String> username= new ArrayList<String>();
	static List<String> password= new ArrayList<String>();
	public void read_excel() throws IOException {
		FileInputStream excel= new FileInputStream("C:\\Users\\villu\\Documents\\TestData_JXL.xls");
		HSSFWorkbook workbook= new HSSFWorkbook(excel);
		Sheet sheet= workbook.getSheetAt(0);
		Iterator<Row> rowIterator=sheet.iterator();
		while(rowIterator.hasNext()) {
			Row rowvalue=rowIterator.next();
			Iterator<Cell> columnIterator=rowvalue.cellIterator();
			int i=2;
			while(columnIterator.hasNext()) 
			{
				if(i%2==0) {
					username.add(columnIterator.next().toString());}
				else
				{
					password.add(columnIterator.next().toString());
					}
				i++;
			}

		}workbook.close();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Creds_From_Excel_POI excel_POI= new Creds_From_Excel_POI();
		excel_POI.read_excel();
		System.out.println(username);
		System.out.println(password);
		excel_POI.execute();
	}

	public void login(String Username, String pwd) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver	driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement login=driver.findElement(By.id("txtUsername"));
		login.sendKeys(Username);
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(pwd);
		driver.findElement(By.name("Submit")).click();
		driver.close();
	}
	public void execute() {
		for(int i=0;i<username.size();i++){
			login(username.get(i),password.get(i));
		}
	}
}
