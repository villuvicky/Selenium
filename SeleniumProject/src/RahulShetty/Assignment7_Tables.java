package RahulShetty;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7_Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement tables=driver.findElement(By.xpath("//table[@id='product']//tbody"));
		List<WebElement> rows=tables.findElements(By.tagName("tr"));
		int Row_Size=rows.size();
		System.out.println(Row_Size);
		List<WebElement> column= driver.findElements(By.xpath("//table[@id='product']//tbody//tr//th"));
		int column_size=column.size();
		System.out.println(column_size);
		List<WebElement> Rows= driver.findElements(By.xpath("//tr[3]//td"));
		for (WebElement webElement : Rows) {
			System.out.println(webElement.getText());
		}
		driver.close();
	}

}
