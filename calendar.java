package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.findElement(By.cssSelector(".imgdp")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[title='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[title='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[title='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("tbody tr:nth-child(2) td:nth-child(3) a:nth-child(1)")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
