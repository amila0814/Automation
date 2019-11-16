package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LanguageSelectorLocators {
	
	@FindBy(how=How.XPATH,using = "//*[@id=\"menu-item-4793\"]/a")
	public WebElement languageDropDown;
	
	@FindBy(how=How.XPATH,using = "//*[@id=\"menu-item-4795\"]/a")
	public WebElement japaniesLanguage;
	
}


