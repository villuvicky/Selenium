package RahulShetty;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\villu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.cricbuzz.com/live-cricket-scorecard/30420/rr-vs-dc-23rd-match-indian-premier-league-2020");
		List<WebElement> scores=driver.findElements(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]//div[@class='cb-col cb-col-100 cb-scrd-itms']//div[@class='cb-col cb-col-8 text-right text-bold']"));
		for (WebElement Score : scores) {
			String s=Score.getText();
			Integer i=Integer.valueOf(s);
			total=total+i;
		}
		String Extras=driver.findElement(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]//div[@class='cb-col cb-col-100 cb-scrd-itms'] //div[text()='Extras']//following-sibling::div[1]")).getText();
		int Extra_Runs=Integer.valueOf(Extras);
		System.out.println("Extras "+Extra_Runs);
		System.out.println("Runs "+total);
		String Total=driver.findElement(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]//div[@class='cb-col cb-col-100 cb-scrd-itms'] \r\n" + 
				"//div[text()='Total']//following-sibling::div[1]")).getText();
		int Total_Runs=Integer.valueOf(Total);
		System.out.println("Total runs from page is "+Total_Runs);
		driver.close();
	}

}
