package Excercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyPassword {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS );

		driver.manage().window().maximize();

		driver.get("https://mypassword-d.lilly.com");

		driver.findElement(By.name("USER_IDENT")).sendKeys("ELY9503");

		driver.findElement(By.name("SUBMIT-TOKENS.x")).click();

		driver.findElement(By.name("SUBMIT-chn:$INTERNAL_password.pss")).click();

		driver.findElement(By.name("_MYPW")).sendKeys("TcsLilly@123");

		driver.findElement(By.name("SUBMIT-VERIFY.x")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@title='Main menu']//i")).click();
		
		

		 new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Change passwords']"))).click();
	
		

	}

}
