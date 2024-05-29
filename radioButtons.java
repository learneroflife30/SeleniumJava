package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtons {

	public static void main(String[] args) throws InterruptedException {

		// Radio buttons automation test case - PSEUDO CODE (Pseudo code summarizes a
		// program's flow, but excludes underlying details )

		// Initiate the browser and maximize the window
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Go to the URL
		driver.get("http://test.rubywatir.com/radios.php");

		// find web-element for radio button `with class`
		WebElement radiobutton = driver.findElement(By.className("radioclass"));

		// Check if radio button `is displayed`
		boolean radiobuttondislaystatus = radiobutton.isDisplayed();
		System.out.println("radio button display status is: " + radiobuttondislaystatus);

		// Check if radio button `is enabled`
		boolean radiobuttonenabledsttaus = radiobutton.isEnabled();
		System.out.println("radio button enabled status is: " + radiobuttonenabledsttaus);

		// click on radio button `with class`
		radiobutton.click();

		Thread.sleep(3000);

		// check status of radio button
		boolean radiobuttonselectedstatus = radiobutton.isSelected();
		System.out.println("radio button selected status is: " + radiobuttonselectedstatus);

		// Unselect radio button by selecting another radio button
		driver.findElement(By.cssSelector("input[value='Not sure']")).click();

		Thread.sleep(3000);

		driver.quit();
	}

}
