import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserInvoking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// this method below will have access to webdriver and chrome driver methods
		// ChromeDriver driver = new ChromeDriver();

		// but chrome driver methods won't be accessible in firefox or edge driver
		// driver.getCapabilities();

		// hence we will use Webdriver as common interface which will have methods
		// which will be there across multilple browsers

		WebDriver driver = new ChromeDriver(); // invoke chromedriver
		// WebDriver driver = new FirefoxDriver(); // invoke firefox driver
		// WebDriver driver = new EdgeDriver();// invoke edgedriver

		driver.get("https://www.espncricinfo.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
