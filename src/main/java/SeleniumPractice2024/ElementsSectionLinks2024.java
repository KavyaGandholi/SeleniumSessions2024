package SeleniumPractice2024;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementsSectionLinks2024 {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		List<WebElement> sectionsLinks = driver.findElements(By.className("list-group-item"));
//	
//	System.out.println(sectionsLinks.size());
//	 
//	for(WebElement e : sectionsLinks ) {
//		System.out.println(e.getText());		 
//	}

		By rightSecsList = By.className("list-group-item");
		ElementUtil eleUtil = new ElementUtil(driver);
		ArrayList<String> textList = eleUtil.getElementsTextList(rightSecsList);
		System.out.println(textList);
		if(textList.contains("Order History")) {
			System.out.println("PASS");
		}

		
	}

}