package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSValidation {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kitking.co.uk/");
		WebElement signupbutton = driver.findElement(By.cssSelector(".newsletter-submit .button-primary"));
		System.out.println(signupbutton.getCssValue("padding"));
		System.out.println(signupbutton.getCssValue("border"));

		driver.quit();

	}

}
