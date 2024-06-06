package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));

		// Cast WebDriver to JavaScriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// to get title and URL of the page
		String titlebefore = js.executeScript("return document.title").toString();
		System.out.println("Page Title before: " + titlebefore);
		String urlbefore = js.executeScript("return document.URL").toString();
		System.out.println("URL before: " + urlbefore);

		// To type in input fields
		// js.executeScript("arguments[0].value = 'text';", element);
		js.executeScript("arguments[0].value= 'student'", username);
		js.executeScript("arguments[0].value= 'Password123'", password);

		WebElement button = driver.findElement(By.id("submit"));

		// to scroll to specific element
		// js.executeScript("arguments[0].scrollIntoView(true);", element);
		js.executeScript("arguments[0].scrollIntoView(true)", button);

//		 To click on an element
//		 js.executeScript("arguments[0].click();", element);
		js.executeScript("arguments[0].click();", button);

		String titleafter = js.executeScript("return document.title").toString();
		System.out.println("Page Title after: " + titleafter);
		String urlafter = js.executeScript("return document.URL").toString();
		System.out.println("URL before: " + urlafter);

	}

}
