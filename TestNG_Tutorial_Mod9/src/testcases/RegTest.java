package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegTest {

	@Test
	public void doRegisterTest() {
		String expectedTitle = "xxxxx";
		String actualTitle = "xxxxx";
		System.out.println("A");
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("B");
		// Assert.assertEquals(actualTitle, expectedTitle, message);
		// Assert.assertTrue(2 > 11, "Error message");
		// Assert.assertTrue(isElementPresent("xxx"), "Element not found");
	}
}
