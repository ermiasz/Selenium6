package browser;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours {

	@Test
	public void Mercurywebsite() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\eyerus\\eclipse-workspace\\Maven_First_Class\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");

		String actual_title = driver.getTitle();
		String expected_title = "Welcome: Mercury Tours";

		Assert.assertEquals(actual_title, expected_title);

		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();

		// Thread.sleep(5000);

		try {
			driver.findElement(By.linkText("SGN-OFF")).isDisplayed();
			System.out.println("Pass");
		} catch (NoSuchElementException e) {
			System.out.println("Fail");
		}
		driver.close();
		driver.quit();
	}

}
