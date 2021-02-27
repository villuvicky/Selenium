package com.advanced.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedDatePicker {


	public static void getDate(int day,String Month,int year) throws InterruptedException
	{
		if((Month.contains("February")&&day==29&&year%4==0)||(Month.contains("February")&&day<=28)||!(Month.equals("February"))&&day<32)

		{
			System.out.println("It valid date and proceeding to select it");
			SelectDate(day,Month,year);

		}
		else 
			System.out.println("Not a valid date");
		
		return;//Nothing can be written if return in written

	}

	public static void SelectDate(int day,String Month,int year) throws InterruptedException
	{

		String MonthYear=Month+" "+String.valueOf(year);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		String CurrentDate= driver.findElement(By.className("ui-datepicker-title")).getText();
		
		while(!CurrentDate.equals(MonthYear))
		{
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			CurrentDate= driver.findElement(By.className("ui-datepicker-title")).getText();
		}
		
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
		
		System.out.println("Date is selected");
		
		Thread.sleep(4000);
		
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {

		
		int day=29;
		String Month="February";
		int year=2024;
		getDate(day,Month,year);
		
	}

}
