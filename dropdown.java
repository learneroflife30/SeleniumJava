package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {

		// Initiate the browser, go to URL and maximize it
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// inspect for the locator of drop-down (do-not perform any action on it)
		WebElement dropdown = driver.findElement(By.cssSelector("#dropdown-class-example"));

		// select from the drop-down by creating object of inbuilt Selenium WebDriver,
		// class = `SELECT` and using its various methods
		Select option = new Select(dropdown);

		option.selectByValue("option3");
		Thread.sleep(2000);

		option.selectByVisibleText("Option1");
		Thread.sleep(2000);

		option.selectByIndex(2);
		Thread.sleep(2000);

		// Get and print the text of selected drop-down
		WebElement firstvalue = option.getFirstSelectedOption();
		String firstvaluetext = firstvalue.getText();
		System.out.println(firstvaluetext);

		driver.quit();

	}

}
