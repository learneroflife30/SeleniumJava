package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssLocators {

	public static void main (String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='oxd-input oxd-input--active'][type='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("p[class*='login']")).click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".orangehrm-login-button")).click();
		Thread.sleep(5000);
		driver.quit();
		
		// applied many threads to avoid fast syncning issues.
		
	}
	
	
}
