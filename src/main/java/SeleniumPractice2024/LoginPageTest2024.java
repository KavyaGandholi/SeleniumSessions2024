package SeleniumPractice2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest2024 {

	public static void main(String[] args) throws Exception {

		BrowserUtil2024 brUtil = new BrowserUtil2024();
		
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageUrl());

		ElementUtil eleUtil = new ElementUtil(driver);

		By email = By.id("input-email");
		By password = By.id("input-password");
		eleUtil.doSendKeys(email, "test@gmail.com");
		eleUtil.doSendKeys(password, "test123");

		brUtil.closeBrowser();

	}

}
