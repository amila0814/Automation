package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.LanguageSelectorLocators;
import utils.SeleniumDriver;

public class LanguageSelectorActions {
	
	LanguageSelectorLocators languageSelectorLocators = null;
	
	public LanguageSelectorActions() {
		
		this.languageSelectorLocators = new LanguageSelectorLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), languageSelectorLocators);
	}
	
	public void moveToLanguageSelectorMenu() {
		
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(languageSelectorLocators.languageDropDown).perform();
		
	}
	
	public void moveToJapaniesLanguage() {
		
		Actions selectLanguage = new Actions(SeleniumDriver.getDriver());
		selectLanguage.moveToElement(languageSelectorLocators.japaniesLanguage).perform();
	}
	
	public void selectJapaniesLanguage() {
		
		languageSelectorLocators.japaniesLanguage.click();
		
	}
	

}
