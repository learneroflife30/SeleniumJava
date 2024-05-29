package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathLocators {

	public static void main(String[] args) throws InterruptedException {
		
	
	     String googleUrl = "https://accounts.google.com/signup";
		 
	     WebDriver driver = new ChromeDriver();
		 driver.get(googleUrl);
			
		// some of various scenarios for finding xpath, relative xpath is always preferred.
		 
		 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("test first name"); 
		 driver.findElement(By.xpath("//input[contains(@aria-label,'Last')]")).sendKeys("test last name"); // for dynamic xpath
		 driver.findElement(By.xpath("//span[text()='Next']")).click(); // for xpath with text
		 
		 Thread.sleep(3000);
		 
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 
		 driver.quit();
		
		

	}

}
