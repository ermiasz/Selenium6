package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser_Java {

	public static void main(String[] args) throws Exception {

		// System.setProperty("webdriver.chrome.driver",
		// "C:\Users\eyerus\eclipse-workspace\Selenium_First_Class\Drivers\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\eyerus\\eclipse-workspace\\Selenium_First_Class\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		driver.quit();

	}

}
