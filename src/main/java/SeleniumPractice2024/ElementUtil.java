package SeleniumPractice2024;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	private WebDriver driver;

	// constructor:
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	//for single web element:
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();

	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public boolean doEleIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	// multiple webelements utils:

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public ArrayList<String> getElementsTextList(By locator) {
		List<WebElement> eletList = getElements(locator);
		ArrayList<String> eleTextList = new ArrayList<String>();

		for (WebElement e : eletList) {
			String text = e.getText();
			if (text.length() != 0) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	
//	**************DropDown Utils-- Select********************
//	only when html tag = <Select>
	
	public void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
		
		//other way
//		WebElement ele = getElement(locator);
//		Select select = new Select(ele);		
//		select.selectByIndex(index);
				
	}
	public void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	public void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);		
	}
	
	public List<WebElement> getDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}
	
	public void getDropDownOptionsCount(By locator) {
		getDropDownOptions(locator).size();
	}
	
	public void doSelectValueFromDropDown(By locator, String value) {
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
	
	public void search(By searchLocator, String searchKey, By suggLocator, String value) throws InterruptedException {
		getElement(searchLocator).sendKeys(searchKey);
		Thread.sleep(3000);
		
		List<WebElement> suggList = getElements(suggLocator);
	
		System.out.println(suggList.size()-1);
		
		for(WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	
	}
}
