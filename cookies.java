package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cookies {

	public static void main(String[] args) {

		// to run test in headless mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");

		String targeturl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		WebDriver driver = new ChromeDriver(options);
		driver.get(targeturl);

		// add custom cookies by creating object of `Cookie` class
		Cookie myCookie = new Cookie("test-name-divyanshu", "test-value-33");
		driver.manage().addCookie(myCookie);

		Set<Cookie> allCookies = driver.manage().getCookies();

		for (Cookie ck : allCookies) {

			System.out.println(ck.getName() + ',' + ck.getDomain() + ',' + ck.getExpiry() + ',' + ck.getValue());

		}

		driver.manage().deleteCookieNamed("orangehrm");
		
		System.out.println("====================AFTER DELETING THE COOKIE============================");
		
		
		Set<Cookie> cookieafterdelete = driver.manage().getCookies();

		for (Cookie ck : cookieafterdelete) {

			System.out.println(ck.getName() + ',' + ck.getDomain() + ',' + ck.getExpiry() + ',' + ck.getValue());

		}
		
		driver.quit();

	}

}
