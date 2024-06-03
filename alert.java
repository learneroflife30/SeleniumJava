package JSalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.cssSelector("button[onclick*=jsCon]")).click();
		Thread.sleep(3000);

		// RETURN TYPE OF ALERT IS Alert
		Alert al = driver.switchTo().alert();

		String alerttext = al.getText(); // to get text of alert
		System.out.println("alert text is: " + alerttext);
		// al.accept(); // to confirm OK
		al.dismiss(); // to confirm CANCEL
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
