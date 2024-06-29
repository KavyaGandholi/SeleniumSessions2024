package SeleniumSelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeAssignment {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
//		WebElement name = driver.findElement(By.id("Form_getForm_subdomain"));
//		 name.sendKeys("Test@123");
//		 String text = name.getAttribute("placeholder");
//		System.out.println(text);
//		
//		WebElement phoneNum = driver.findElement(By.id("Form_getForm_Contact"));
//		phoneNum.sendKeys("967676767");
//		String text1 = phoneNum.getAttribute("placeholder");
//		System.out.println(text1);
//		
		
		
		
		
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}
	
	public static String doGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute("attrName");
	}
	

}
