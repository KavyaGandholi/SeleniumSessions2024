package SeleniumPractice2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageFilling {

	public static void main(String[] args) throws Exception {

		BrowserUtil2024 brUtil = new BrowserUtil2024();
		
		WebDriver driver = brUtil.launchBrowser("Chrome");		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");		
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageUrl());
		
		ElementUtil eleUtil = new ElementUtil(driver);
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		
		
		eleUtil.doSendKeys(firstName, "Kavya");
		eleUtil.doSendKeys(lastName, "Sudha");
		eleUtil.doSendKeys(email, "Kavya123@gmail.com");
		eleUtil.doSendKeys(telephone, "96761901");
	}

}
