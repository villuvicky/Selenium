package RahulShetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8_AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("Uni");
		Thread.sleep(3000);
		String Country="United States";
		List<WebElement> Options= driver.findElements(By.xpath("//li[@class='ui-menu-item']//div"));
		for (WebElement webElement : Options) {
			if(webElement.getText().contains(Country)) {
				webElement.click();
				break;
			}

				
		}
		driver.close();
	}

}
