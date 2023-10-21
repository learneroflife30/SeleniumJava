import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // wait applied at global level
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); // hit the url
		String pagetitle = driver.getTitle(); // get the title in a string
		System.out.println(pagetitle); // print the title
		driver.findElement(By.id("inputUsername")).sendKeys("Divyanshu"); // enter username
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshetty"); // enter password
		driver.findElement(By.className("submit")).click(); // click on signing
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); // get the error message and print
		// it
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Divyanshu");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@type='text'][3]")).clear(); // clear the phone number
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9023573367");
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();

		// driver.close(); // close the instance of the current browser

	}

}
