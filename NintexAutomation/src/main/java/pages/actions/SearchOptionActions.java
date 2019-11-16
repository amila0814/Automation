package pages.actions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import pages.locators.SearchOptionLocators;
import utils.SeleniumDriver;

public class SearchOptionActions {

	SearchOptionLocators searchOptionLocators = null;

	public SearchOptionActions() {

		this.searchOptionLocators = new SearchOptionLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), searchOptionLocators);
	}

	public void clickOnHomeSearchButton() {

		searchOptionLocators.homeSearchButton.click();

	}

	public void keyInSearchParameter(String searchText) {

		searchOptionLocators.searchTextBox.sendKeys(searchText);

	}

	public void popUpWindow() {

		searchOptionLocators.popUpWindow.isDisplayed();

	}


	public void clickOnPopUpSearchButton() {

		searchOptionLocators.popUpSearchButton.click();

	} 
	
	public void searchResults() {
		
		searchOptionLocators.resultLable.isDisplayed();
		
	}

}
