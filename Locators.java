import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// values stored in variables
		String name = "Divyanshu";
		String staticwrongpassword = "rahulshetty";
		String staticrightpassword = "rahulshettyacademy";
		String email = "abc@gmail.com";
		String PhoneNumber1 = "123456789";
		String PhoneNumber2 = "9023573367";

		// creating object of webdriver class to invoke required selenium methods
		WebDriver driver = new ChromeDriver();

		// wait applied at global level
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// call getpasswordmethod to get dynamic password and place it
		String dypassword = getpassword(driver);

		// go to the url
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		// get the page title in a string and print it
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);

		// input fields filling with incorrect information and then switching
		driver.findElement(By.id("inputUsername")).sendKeys(name); // enter name
		driver.findElement(By.name("inputPassword")).sendKeys(staticwrongpassword); // enter wrongpassword
		driver.findElement(By.className("submit")).click(); // click on signing in

		// get the error message and print it
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		// switch to signup page
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);

		// and fill information
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(PhoneNumber1);
		driver.findElement(By.xpath("//input[@type='text'][3]")).clear(); // clear the phone number
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys(PhoneNumber2);
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		String message = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText(); // get message
		System.out.println(message);

		// switched back
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer'] //button[@class='go-to-login-btn']"))
				.click();
		Thread.sleep(2000);

		// and fill correct information
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(dypassword);
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		driver.findElement(By.cssSelector("#chkboxTwo")).click();
		driver.findElement(By.xpath("//*[@class='submit signInBtn']")).click();
		Thread.sleep(2000);

		// to assert we are successfully logged in
		String actualvalue = driver.findElement(By.tagName("p")).getText();
		System.out.println(actualvalue);
		Assert.assertEquals(actualvalue, "You are successfully logged in.");
		driver.findElement(By.cssSelector(".logout-btn")).click();

		// close the instance of the current browser
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

	// get dynamic password
	public static String getpassword(WebDriver driver) throws InterruptedException {

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		String message = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();

		// Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordmessage = message.split("'"); // split string

		String part1passwordmessage = passwordmessage[0]; // Please use temporary password
		String part2passwordmessage = passwordmessage[1]; // rahulshettyacademy' to Login.

		String[] getdynamicpassword = part2passwordmessage.split("'");

		String dynamicpassword = getdynamicpassword[0]; // rahulshettyacademy

		return dynamicpassword;

	}

}
