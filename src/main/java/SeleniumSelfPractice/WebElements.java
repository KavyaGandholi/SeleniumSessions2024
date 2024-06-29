package SeleniumSelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.presentationml.x2006.main.CTTLOleChartTargetElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements {

	 static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 System.out.println(driver.getTitle());
		 	
		 
		 ElementUtil eleUtil = new ElementUtil(driver);
		 		 
		 By email =  By.id("input-email");
		 eleUtil.doSendKeys(email, "Kavya@gmail.com");
		 
		By password =  By.id("input-password");
		eleUtil.doSendKeys(password, "Kavya123");
	}
	
}
