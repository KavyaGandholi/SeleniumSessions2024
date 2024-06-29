package SeleniumPractice2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

		static WebDriver driver;
		
		public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.get("https://www.orangehrm.com/en/30-day-free-trial");
			
			
//		List<WebElement> optionsList =driver.findElements(By.xpath("//select/option"));
//		System.out.println(optionsList.size());
//		//to print all the elements
//		for(WebElement e : optionsList ) {
//			String Text = e.getText();
//			System.out.println(Text);
//				if(Text.equals("India")) {
//					e.click();
//					break;
//			}
//		}
			
			By country = By.xpath("//select/option");
			doSelectValueFromDropDown(country, "Germany");
			
		
	}
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		}
		
		
		public static void doSelectValueFromDropDown(By locator, String value) {
			List<WebElement> optionsList = getElements(locator);
			System.out.println(optionsList.size());
			//to print all the elements
			for(WebElement e : optionsList ) {
				String Text = e.getText();
				System.out.println(Text);
					if(Text.equals(value)) {
						e.click();
						break;
				}
			}
		}

}
