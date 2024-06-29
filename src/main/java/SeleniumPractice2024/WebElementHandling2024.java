package SeleniumPractice2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementHandling2024 {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Venkatesh PC\\Drivers\\chromedriver-win64\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		// WebDriverManager.firefoxdriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(driver.getTitle());

		// create a webelement + perform action(click,sendkeys,select
		// (dropdown),isDisplayed,getText)
//	//1.	
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test123");
//	
//	//2.
//		WebElement emailID = driver.findElement(By.id("input-email")); //webelemt is an interface
//		WebElement password = driver.findElement(By.id("input-password"));
//		emailID.sendKeys("test@gamil.com");
//		password.sendKeys("test123");

		// 3.By locator:
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//		WebElement emailID = driver.findElement(email);
//		WebElement pwd = driver.findElement(password);
//		
//		emailID.sendKeys("test@gmail.com");
//		pwd.sendKeys("test123");
//		

		// 4. By locator + generic function
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//		getElement(email).sendKeys("test@gmail.com");
//		getElement(password).sendKeys("test123");
//		

		// 5. By locator + generic fucntion + actions

//		By email = By.id("input-email");
//		By password = By.id("input-password");
//
//		doSendKeys(email, "test@gmail.com");
//		doSendKeys(password, "test123");

		//6. By locator + Element Utility class--> generic functions
		
		//create an object of element util to call the driver and point it to chromedriver
		ElementUtil eleUtil = new ElementUtil(driver);
		By email = By.id("input-email");
		By password = By.id("input-password");
		
		eleUtil.doSendKeys(email, "test@gmail.com");
		eleUtil.doSendKeys(password, "test123");
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	// Wrapper function:
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
