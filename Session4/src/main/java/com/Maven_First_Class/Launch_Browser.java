package com.Maven_First_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch_Browser {

	/*
	 * public static void main(String[] args) { browserLaunch(); }
	 */

	@Test
	public static void browserLaunch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\eyerus\\eclipse-workspace\\Selenium_First_Class\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://selenium.dev/downloads/");
		driver.manage().window().maximize();
		driver.quit();
	}
}
