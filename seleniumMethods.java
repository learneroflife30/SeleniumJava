package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class seleniumMethods {

	public static void main(String[] args) throws InterruptedException {

		// create object of Web-driver class
		WebDriver driver = new ChromeDriver();

		// Initiate the browser
		driver.get("https://the-internet.herokuapp.com/");
		// or alternate way below
		// driver.navigate().to("https://the-internet.herokuapp.com/");

		// maximize the window
		driver.manage().window().maximize();

		// get the title and URL of current page
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url + " , " + title + " , " + " are url and titles of the page");

		// navigate forward, refresh, and back
		driver.findElement(By.linkText("Broken Images")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		// use-case for driver.close() and driver.quit() methods
		// - Open one tab separately
		// - //driver.findElement(By.linkText("Elemental selenium")).click();

		// Double click on element to open two tabs Separately, three in total, by
		// creating actions class
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.linkText("Elemental Selenium"));
		act.doubleClick(ele).perform();

		Thread.sleep(3000);
		driver.close(); // closes, current instance/tab of browser
		Thread.sleep(3000);
		driver.quit(); // closes all tabs of browser

	}

}
