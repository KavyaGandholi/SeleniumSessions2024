package SeleniumPractice2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling2024 {

	static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
//		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
//		country.sendKeys("India");
//		
//		
//		//create an object of select class
//		Select sel =  new Select(country);
		
		//sel.selectByIndex(5);
		//sel.selectByVisibleText("India");
		//sel.selectByValue("Armenia");

//		By country = By.id("Form_getForm_Country");
//		doSelectDropDownByIndex(country, 4);
//		doSelectDropDownByVisibleText(country, "India"); // we give it from dropdown directly
//		doSelectDropDownByValue(country, "Australia"); // we give by selecting value attribute from option tag from select tag
		
		WebElement country1 = driver.findElement(By.id("Form_getForm_Country"));
		Select sel =  new Select(country1);
		List<WebElement> countryOptions = sel.getOptions();
		System.out.println("total options:" +countryOptions.size()); // get 233 here-- but it is 232 as it shows country from dropdown
		System.out.println("total options:" + (countryOptions.size()-1)); //get 232
			
		//to print text of every option:
		for(WebElement e : countryOptions ) {
			String text = e.getText();
			System.out.println(text);
			
		}
			
	}
	
	
	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
		
	}
	
	public static void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
		
		//other way
//		WebElement ele = getElement(locator);
//		Select select = new Select(ele);		
//		select.selectByIndex(index);
				
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	
	public static List<WebElement> getDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}
	
	public static void getDropDownOptionsCount(By locator) {
		getDropDownOptions(locator).size();
	}
}
