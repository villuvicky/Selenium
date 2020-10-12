package RahulShetty;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> FooterLinks= driver.findElements(By.xpath("/html/body/div[6]/table/tbody/tr/td[1]/ul/li"));
		for (WebElement webElement : FooterLinks) {
			String keys= Keys.chord(Keys.CONTROL,Keys.ENTER);
			webElement.findElement(By.tagName("a")).sendKeys(keys);
		}
		Set<String> allWindows=driver.getWindowHandles();
		for (String window : allWindows) {
			String Title=driver.switchTo().window(window).getTitle();
			System.out.println(Title);
		}
	}

}
