package headless.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class chromeHeadless {

	public static void main(String[] args) {

		// line of code to do execution in headless mode for chrome and firefox drivers respectively
		ChromeOptions options = new ChromeOptions();
		//FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");

		// passing the options class to enable its property
		WebDriver driver = new ChromeDriver(options);
		//WebDriver driver = new FirefoxDriver(options);
		driver.get("http://google.com");
		System.out.println(driver.getCurrentUrl());
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		if (pageTitle.contains("e")) {

			System.out.println("we are on the google home page");

		}

		else {

			System.out.println("we are not on the google home page");

		}

		driver.findElement(By.className("gb_y")).click();
		System.out.println(driver.getCurrentUrl());
	}

}
