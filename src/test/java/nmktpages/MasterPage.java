package nmktpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MasterPage {

	WebDriver driver;

	public MasterPage(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Generic browser action type method ALL THOSE BELOW METHODS WILL SUPPLY TO HIS
	 * CHILDS TO DO COMMON ACTION LIKE TYPE(); CLICK(); ISELEMENTEXIST();
	 */

	public void typeText(String locators, String texttobeWrite) {
		highlightElementBackground(locators);
		if (locators.contains("{name")) {
			driver.findElement(By.name(locators.split(":")[1])).sendKeys(texttobeWrite);
		} else if (locators.contains("{xpath")) {
			driver.findElement(By.xpath(locators.split(":")[1])).sendKeys(texttobeWrite);
		} else if (locators.contains("{id")) {
			driver.findElement(By.id(locators.split(":")[1])).sendKeys(texttobeWrite);
		}

	}

	public void clickElement(String locators) {

		highlightElementBackground(locators);

		if (locators.contains("{name")) {
			driver.findElement(By.name(locators.split(":")[1])).click();
		} else if (locators.contains("{xpath")) {
			driver.findElement(By.xpath(locators.split(":")[1])).click();
		} else if (locators.contains("{id")) {
			driver.findElement(By.id(locators.split(":")[1])).click();
		}
	}

	public boolean isElementExist(String locators) {

		try {
			highlightElementBackground(locators);

			if (locators.contains("{name")) {
				return driver.findElement(By.name(locators.split(":")[1])).isDisplayed();
			} else if (locators.contains("{xpath")) {
				return driver.findElement(By.xpath(locators.split(":")[1])).isDisplayed();
			} else if (locators.contains("{id")) {
				return driver.findElement(By.id(locators.split(":")[1])).isDisplayed();
			} else {
				return false;
			}

		} catch (Exception e) {

			return false;
		}

	}

	public boolean getElementsCount(String locators) {

		List<WebElement> allFriendselement = driver.findElements(By.xpath(locators.split(":")[1]));// list of elemts
		if (allFriendselement.size() > 0) {
			return true;
		}
		return false;
	}

	/** Helper Code */
	// 2 MORE METHODS MUST GO HERE

	public String reoplaceLocatorswith(String locators, String replaceCharacters) {
		String replacesstring = locators.replace("${RPLC}", replaceCharacters);
		return replacesstring;
	}

	public void uglyWaitFor(int mls) {
		try {
			Thread.sleep(mls);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void highlightElementBackground(String locators) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement element = null;

		if (locators.contains("{name")) {
			element = driver.findElement(By.name(locators.split(":")[1]));
		} else if (locators.contains("{xpath")) {
			element = driver.findElement(By.xpath(locators.split(":")[1]));
		} else if (locators.contains("{id")) {
			element = driver.findElement(By.id(locators.split(":")[1]));
		}

		js.executeScript("arguments[0].style.backgroundColor = '" + "yellow" + "'", element);

	}

}
