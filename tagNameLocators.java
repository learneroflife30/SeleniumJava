package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagNameLocators {
	
	public static void main (String[] args) {
		
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://en-gb.facebook.com");
		 driver.manage().deleteAllCookies();
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 List <WebElement> links = driver.findElements(By.tagName("a"));
		 
// WebElement searchTextBox = driver.findElement(By.name("test value")); // returns single Web element.
// List <WebElement> allLinks = driver.findElements(By.tagName("a")); // returns list of web elements.
		 
		 System.out.println("The total number of links on the page are " + links.size());
		 // for loop to find all links on web page and print its text
		 
		 for(int i=0; i<links.size(); i++) {
			 
			 System.out.println(links.get(i).getText());
			 
		 }
		 
		 driver.quit();
		
	}


}
