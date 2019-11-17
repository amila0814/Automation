package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class Helper {

	public static Logger log = Logger.getLogger("devpinoyLogger");
	

	public void click(WebElement element) {

		element.click();
		log.debug("Clicking on an Element : "+element);

	}

	public void type(WebElement element, String value) {

		element.sendKeys(value);
		log.debug("Typing in an Element : "+element+" entered value as : "+value);

	}

	public void display(WebElement element) {

		element.isDisplayed();
		log.debug("Clicking on an Element : "+element);

	}

	public String getText(WebElement element) {
		return element.getText();
	}
	public void verifyLabel(String expectedLabel,WebElement element) {
		log.debug("Verify the actual is matching the expected one : "+element);
		String actulaLbl = getText(element);
		Assert.assertTrue(actulaLbl.equalsIgnoreCase(expectedLabel),"Test step is failed, the actual shown is" + actulaLbl
				+ "and it's not machting with the expected, which is" + expectedLabel);
	}

	protected void waitForVisibilityOf(WebElement element) {
		WebDriverWait webDriverWait = new WebDriverWait(SeleniumDriver.getDriver(),10);
		webDriverWait.until(ExpectedConditions.visibilityOf(element));
	}
}
