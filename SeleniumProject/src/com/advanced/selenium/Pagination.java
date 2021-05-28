package com.advanced.selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://demo.opencart.com/admin/");

		//driver.findElement(By.id("input-username")).sendKeys("demo");
		//driver.findElement(By.id("input-password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();

		String TotalNoText= driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
		System.out.println(TotalNoText);

		String TotalPages=TotalNoText.substring(TotalNoText.indexOf("(")+1,TotalNoText.indexOf("Pages")-1 );
		System.out.println(TotalPages);

		int TotalPage=Integer.valueOf(TotalPages);


		for(int i=1;i<=3;i++) {
			

			String ActivePageNo=driver.findElement(By.xpath("//ul[@class='pagination']//li//span")).getText();
			
			System.out.println("*********************************************");
			
			System.out.println("The current page number is: "+ ActivePageNo);

			int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			System.out.println("Number of rows are: "+rows);
			
			System.out.println("OrderID  Customer  Status");
			
			for(int r=1;r<=rows;r++) {
				
				String OrderID=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				String Customer=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
				String Status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
				
				
				System.out.println(OrderID+"  "+Customer+" "+Status);
			}

			
			int NextPage=Integer.valueOf(ActivePageNo)+1;
			
			driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+NextPage+"']")).click();
		
		}

	}

}
