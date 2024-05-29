package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


public class checkBoxes {
	
	public static void main (String[]args) throws InterruptedException {
		
		
		// initiate the browser
		EdgeDriver driver = new EdgeDriver();
		
		// go to the URL
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		
		// check the Check-box for visibility and enabled statuses
		boolean isdiplsayedstatus = driver.findElement(By.cssSelector("div form input:nth-child(1)")).isDisplayed();
		boolean isenabledstatus = driver.findElement(By.cssSelector("div form input:nth-child(1)")).isEnabled();
		
		System.out.println("Checkbox is displayed: " + isdiplsayedstatus);
		System.out.println("Checkbox is enabled: " + isenabledstatus);
		
		
		// check the check-box
		driver.findElement(By.cssSelector("div form input:nth-child(1)")).click();
		Thread.sleep(2000);
		
		//un-check the check-box
		driver.findElement(By.cssSelector("div form input:nth-child(1)")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
