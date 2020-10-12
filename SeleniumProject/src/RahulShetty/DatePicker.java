package RahulShetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.goibibo.com/");
		driver.findElement(By.id("departureCalendar")).click();
		while (!driver.findElement(By.className("DayPicker-Caption")).getText().contains("April")) {

			driver.findElement(By.xpath("//*[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}

		List<WebElement> dates = driver.findElements(By.className("calDate"));
		for (WebElement webElement : dates) {
			String Element_Date = webElement.getText();
			String date="2";
			if (Element_Date.equalsIgnoreCase(date)) {
				String xpath="//div[text()="+"\""+date+"\""+"]"+"//parent::div";
				driver.findElement(By.xpath(xpath)).click();
				break;
				
			}

		}
driver.close();
	}

}
