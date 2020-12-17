package RahulShetty;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetVegPagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<String> Price;
		do
		{
			List<WebElement> Lists = driver.findElements(By.xpath("//tr/td[1]"));
			Price=Lists.stream().filter(s->s.getText().contains("Rice")).map(s->getPrice(s)).collect(Collectors.toList());
			if(Price.size()<1)
			{
				driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div[2]/ul/li[7]/a")).click();;
			}

		}while(Price.size()<1);
	}
	public static String getPrice(WebElement s) {
		String price=s.findElement(By.xpath("following::td[1]")).getText();
		System.out.println(price);
		return price;

	}

}
