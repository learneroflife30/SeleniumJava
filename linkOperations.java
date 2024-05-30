package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class linkOperations {

	public static void main(String[] args) throws InterruptedException {

		// open the browser

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://auth.gymshark.com/login?state=hKFo2SBNcVpJVjk3X0k5YjU1UUt0VGZIb2d3ZVExSzd1T294ZKFupWxvZ2luo3RpZNkgaDVGcFhDc3RMVllKZDVmN0hQSHhkcTFhOGp5MGFkb1OjY2lk2SAyd2JDeUhWbTFEZElYMkV3ZEU3bTBxVkliWGpPQ1RYag&client=2wbCyHVm1DdIX2EwdE7m0qVIbXjOCTXj&protocol=oauth2&scope=openid%20profile%20email&response_type=code&redirect_uri=https%3A%2F%2Fuk.gymshark.com%2Fapi%2Fauth%2Fcallback&audience=https%3A%2F%2Fgateway.api.gymshark.com&locale=en-GB&realm=gb&nonce=k8s7UL8NDrC3zGCsklqK1EcQH5pXOm_O7aRCdWVZXH8&code_challenge_method=S256&code_challenge=q9kaJ_OXhEyUvKe6igWuQM51cbcMzLYoqEsfey2Ojk4");

		// find the element

		WebElement passwordresetlink = driver.findElement(By.linkText("Forgot Password?"));

		// check if element is displayed

		boolean passwordresetlinkisDisplayed = passwordresetlink.isDisplayed();
		System.out.println("password reset link is Displayed: " + passwordresetlinkisDisplayed);

		// check if element is enabled

		boolean passwordresetlinkisEnabled = passwordresetlink.isEnabled();
		System.out.println("password reset link is Enabled: " + passwordresetlinkisEnabled);

		// get text of element
		String passwordresetlinkText = passwordresetlink.getText();
		System.out.println("password reset link Text is: " + passwordresetlinkText);

		// click on the element
		passwordresetlink.click();
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
