import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Kavya");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("kavya@gmail.com");
		driver.findElement(By.cssSelector("input[id='exampleInputPassword1']")).sendKeys("Kavya123");
		driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.cssSelector("input[id='inlineRadio2']")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("16052000");
		driver.findElement(By.cssSelector("input[class='btn btn-success']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-dismissible")).getText());

	}

}
