package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchOptionLocators {
	
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"search-mag-glass\"]")
	public WebElement homeSearchButton;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"keyword-input\"]")
	public WebElement searchTextBox;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"footer-search-form\"]/form/div/button")
	public WebElement popUpSearchButton;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"footer-search-form\"]")
	public WebElement popUpWindow;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"search\"]/div[4]/div[2]/div[6]/div[2]/span[1]/span/text()[1]")
	public WebElement resultLable;
	
	@FindBy(how=How.XPATH, using = "//span[contains(text(),'Results per page')]")
	public WebElement searchResultLabel;
	
	@FindBy(how=How.XPATH, using = "//a[@class='ga-lang']")
	public WebElement pageLocal;
}
