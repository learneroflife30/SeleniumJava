package SSL.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class ssldemo {

	public static void main(String[] args) throws InterruptedException {

		// code to accept insecure certificate in Chrome
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);

		String URL = "https://expired.badssl.com";

		WebDriver driver = new ChromeDriver(options);
		driver.get(URL);
		
		Thread.sleep(5000);

		driver.quit();
		
		
		// code to accept insecure certificate in Chrome

//		FirefoxOptions option1 = new FirefoxOptions();
//		option1.setAcceptInsecureCerts(true);
//		
//		WebDriver driver = new FirefoxDriver(option1);
//		driver.get("https://expired.badssl.com");
//		
//		Thread.sleep(5000);
//		
//		driver.quit();
		

	}

}
