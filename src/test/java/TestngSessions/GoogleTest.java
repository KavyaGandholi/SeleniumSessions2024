package TestngSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
	
	@Test(priority = 1)
	public void searchTest() {
		boolean flag = driver.findElement(By.name("q")).isDisplayed();
		System.out.println(flag);
		Assert.assertEquals(flag, true);
	}
	
	@Test(priority = 3)
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("page title is:" + title);
		Assert.assertEquals(title, "Google");
	}
	
	@Test(priority = 2)
	public void logoTest() {
//		boolean flag = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
//		Assert.assertTrue(flag);
		Assert.assertTrue(driver.findElement(By.className("lnXdpd")).isDisplayed());
	}
	
	
	
}
