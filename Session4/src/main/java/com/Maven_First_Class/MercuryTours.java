package com.Maven_First_Class;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MercuryTours {

	@Test
	// Throws takes
	public void Mercurywebsite() throws Exception {

		// Launchs a browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\eyerus\\eclipse-workspace\\Maven_First_Class\\Driver\\chromedriver.exe");

		// Instantiate ChromeDriver object
		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Delete cookies and history
		driver.manage().deleteAllCookies();

		// Maximize Browser
		driver.manage().window().maximize();

		// Go to site
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");

		String actual_title = driver.getTitle();
		String expected_title = "Welcome: Mercury Tours";

		Assert.assertEquals(actual_title, expected_title);

		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();

		boolean isDisplayed = driver
				.findElement(
						By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"))
				.isDisplayed();

		/*
		 * if (isDisplayed) { System.out.println("The SIGN-OFF button is displayed"); }
		 * 
		 * else System.out.println("The SIGN-OFF button is not displayed");
		 */

		try {
			driver.findElement(By.linkText("SpGN-OFF")).isDisplayed();
			System.out.println("Pass");
		} catch (Exception e) {
			System.out.println("Fail");
		}

		// Slow down Java in 1000 ms = 1 second
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"))
				.click();
		Thread.sleep(5000);

	}

}