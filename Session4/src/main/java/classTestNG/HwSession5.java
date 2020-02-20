package classTestNG;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HwSession5 {

	@Test
	public void techfioslogin() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		driver.manage().window().maximize();

		Thread.sleep(3000);

		Random rd = new Random();
		String account = "Test" + rd.nextInt(500);

		driver.findElement(By.xpath("//span[contains(text(),'Bank & Cash')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("account")).sendKeys("" + account);
		driver.findElement(By.id("description")).sendKeys("justForTest");
		driver.findElement(By.id("balance")).sendKeys("95000");

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		Thread.sleep(3000);

		// waitForElement(driver,10,By.xpath("//div[@class='alert alert-success fade
		// in']"));

	}

}
