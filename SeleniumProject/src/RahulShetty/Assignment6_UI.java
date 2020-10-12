package RahulShetty;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6_UI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement option1=driver.findElement(By.id("checkBoxOption1"));
		option1.click();
		String text= driver.findElement(By.xpath("//*[@for='bmw']")).getText();
		Thread.sleep(3000);
		WebElement selecting=driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(selecting);
		select.selectByVisibleText(text);
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys(text);
		Thread.sleep(3000);
		driver.findElement(By.id("alertbtn")).click();
		Alert alert= driver.switchTo().alert();
		boolean result=alert.getText().contains(text);
		System.out.println(result);
		
			
		
	}

}
