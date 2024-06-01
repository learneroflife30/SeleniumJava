package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// open the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

		// find web-element for button
		WebElement button = driver.findElement(By.cssSelector("button[onclick*='add']"));

		// check if web-element is visible
		boolean buttondisvisiblestatus = button.isDisplayed();
		System.out.println("button is visible: " + buttondisvisiblestatus);

		// check if web-element is enabled
		boolean buttonisenabledstatus = button.isEnabled();
		System.out.println("button is enabled: " + buttonisenabledstatus);

		// find text on web-element
		String buttontext = button.getText();
		System.out.println("button text is: " + buttontext);

		Thread.sleep(3000);

		// click on web-element
		button.click();

		Thread.sleep(3000);

		driver.quit();
	}

}
