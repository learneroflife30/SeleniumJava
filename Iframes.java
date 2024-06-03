package JSalerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/dialog/");
		driver.switchTo().frame(0); // switching to i-frame
		driver.findElement(By.cssSelector(".ui-button")).click();
		driver.switchTo().defaultContent(); // switching back to default content ( outside of i-frame)
		driver.findElement(By.linkText("Demos")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
