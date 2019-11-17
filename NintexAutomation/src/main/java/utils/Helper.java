package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;


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


}
