import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.spicejet.com/");		
		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']) [1]")).click();// click on arrival		
		List<WebElement> cities = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-18u37iz']"));		
		for (int i = 0; i < cities.size(); i++) 
		{			
		String cityName = cities.get(i).getText();			
		if (cityName.contains("Jammu")) 
		{				
		driver.findElement(By.xpath("//div[text()='IXJ']")).click();				
		break;			
		}		
		}		
		Thread.sleep(3000);		
		List<WebElement> cities1 = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-18u37iz']"));		
		for (int i = 0; i < cities1.size(); i++) 
		{			
		String cityName = cities1.get(i).getText();			
		if (cityName.contains("Chennai")) 
		{				
		driver.findElement(By.xpath("//div[text()='MAA']")).click();				
		break;			
		}		
		}		
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']")).click();		
		driver.findElement(By.xpath("//div[contains(text(),'Passengers')]")).click();		
		for (int j = 0; j < 5; j++) {			
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();		
		}		
		driver.findElement(By.xpath("//div[text()='INR']")).click();		
		Thread.sleep(1000);		
		driver.findElement(By.xpath("//div[text()='USD']")).click();		
		driver.findElement(By.xpath("//div[text()='Family & Friends']")).click();		
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();

	}

}
