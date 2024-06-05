package JSalerts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class multipleWindows {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String firstwindowhandle = driver.getWindowHandle(); // get a window handles
		System.out.println("first window handle is: " + firstwindowhandle);
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> alltabs = driver.getWindowHandles(); // get multiple window handles

		for (String s : alltabs) {

			if (!s.equals(firstwindowhandle)) {

				driver.switchTo().window(s);
			}

		}

		System.out.println(driver.getTitle());
		driver.switchTo().window(firstwindowhandle); // switch back to first window
		System.out.println(driver.getTitle());

		Thread.sleep(3000);
		driver.quit();
	}

}
