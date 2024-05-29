package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textBoxOperations {
	
	public static void main (String[] args) throws InterruptedException {
		
		// initiate the Chrome browser
		ChromeDriver driver  = new ChromeDriver();
		
		// Enter the URL
		driver.get("https://the-internet.herokuapp.com/forgot_password");
		
		// find input field and store its value in variable to use furthur.
		WebElement email = driver.findElement(By.name("email"));
		
		// check if input field is present
		boolean emailisvisible =  email.isDisplayed();
		System.out.println("input field is present: " + emailisvisible);
		
		// check if input field is enabled
		boolean emailisenabled  = email.isEnabled();
		System.out.println("input field is enabled: " + emailisenabled );
		
		// enter value in input field
		email.sendKeys("SeleniumTest@gmail.com");
		
		Thread.sleep(3000);
		
		// find and print value entered in email input field
		String emailvalue = email.getAttribute("value");
		System.out.println("emailvalue is: " + emailvalue);
	
		// clear input field 
		email.clear();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
