import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invoking browser
		//Chrome - ChromeDriver ->Methods
		//Safari - SafariDriver ->Methods
		//Firefox - FirefoxDriver ->Methods
		//webdriver
		
		//For invoking firefox browser -> WebDirver driver = new FirefoxDriver();
		
		//For invoking microsoft edge browser -> WebDriver driver = new EdgeDriver();

		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}

}
