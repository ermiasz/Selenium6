package com.Maven_First_Class;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechFios {
	@Test
	public void techfioslogin() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\eyerus\\eclipse-workspace\\Maven_First_Class\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("http://techfios.com/test/billing/?ng=admin/");

		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");

		driver.findElement(By.cssSelector("#password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Transaction')]")).click();
		driver.findElement(By.linkText("Add Deposit")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//option[@value='Homeloan']")).click();
		driver.findElement(By.name("description")).sendKeys("Mortgage");
		driver.findElement(By.name("amount")).sendKeys("5000");
		driver.findElement(By.xpath("//*[@id='submit']")).click();

		Thread.sleep(5000);

		String expectedTitle = "Dashboard- Techfios Test Application - Billing";
		String actualTitle = driver.getTitle();

	}

}
