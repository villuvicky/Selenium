package PoMApproach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyPage {

	
	private static WebDriver driver;

	public BuyPage(WebDriver driver) {
		
		BuyPage.driver=driver;
	}

	private static By BuyID= By.id("buyBtn1");
	
	public static void buy() {
	
	driver.findElement(BuyID).click();
	
	}
	
}
