package SeleniumSelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterPageGetText {

	static WebDriver driver;

	//this method is to capture warning messages on the page
	public static void main(String[] args) throws Exception {

//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		
		BrowserUtil brUtil = new BrowserUtil();
		
		WebDriver driver  = brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageTitle());
		driver.manage().window().maximize();
	
		
		By warningMsg = By.className("alert");
		By firstNameMsg = By.xpath("//*[@id=\"account\"]/div[2]/div/div");
		By lastNameMsg = By.xpath("//*[@id=\"account\"]/div[3]/div/div");
		By continueBtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		doClick(continueBtn);
		
		String warMsgValue = doGetText(warningMsg);
		System.out.println(warMsgValue);
			
//		String firstNameMsgValue = doGetText(firstNameMsg);
//		System.out.println(firstNameMsgValue);
//		
//		String lastNameMsgValue = doGetText(lastNameMsg);
//		System.out.println(lastNameMsgValue);
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
