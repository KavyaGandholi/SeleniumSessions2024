package SeleniumPractice2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeConcept2024 {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//String attrValue = driver.findElement(By.id("input-email")).getAttribute("placeholder");
		//System.out.println(attrValue);
		
		WebElement emailId = driver.findElement(By.id("input-email"));
		emailId.sendKeys("test@gmail.com");
		//String text = emailId.getText(); // this will not work to get the text of the value which we give
		String text = emailId.getAttribute("value");
		System.out.println(text);
	
		By emailID = By.id("input-email");
		By registerLink = By.linkText("Register");
		By logo = By.className("img-responsive");
	
		String text1 = doGetAttribute(emailID, "placeholder");
		String text2 = doGetAttribute(registerLink, "href");
		String text3 = doGetAttribute(logo, "src");
		
	
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
	
	}
	
	
	public static WebElement getElement(By locator ) {
		return driver.findElement(locator);
	}
	
	public static String doGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	
}
