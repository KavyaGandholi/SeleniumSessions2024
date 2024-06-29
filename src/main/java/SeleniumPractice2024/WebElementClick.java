package SeleniumPractice2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementClick {
	
	static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//We create three uitliies to simplify reusablity
//		driver.findElement(By.id("username")).sendKeys("Kavya@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("naveen@123");
//				
//		driver.findElement(By.id("loginBtn")).click();
		
		
		By username = By.id("username");
		doSendKeys(username, "naveen@gmail.com");
		
		By pwd = By.id("password");
		doSendKeys(pwd, "naveen@123");
		
		By loginBtn = By.xpath("//*[@id=\"loginBtn\"]/i18n-string");
		doClick(loginBtn);
			
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
		
	}
	
}
