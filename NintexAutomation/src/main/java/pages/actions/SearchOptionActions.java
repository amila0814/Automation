package pages.actions;


import org.openqa.selenium.support.PageFactory;

import pages.locators.SearchOptionLocators;
import utils.Helper;
import utils.SeleniumDriver;


public class SearchOptionActions extends Helper {

	SearchOptionLocators searchOptionLocators = null;

	public SearchOptionActions() {

		this.searchOptionLocators = new SearchOptionLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), searchOptionLocators);
	}

	public void clickOnHomeSearchButton() {

		click(searchOptionLocators.homeSearchButton);

	}

	public void keyInSearchParameter(String searchText) {

		type(searchOptionLocators.searchTextBox,searchText);

	}

	public void popUpWindow() {

		display(searchOptionLocators.popUpWindow);

	}


	public void clickOnPopUpSearchButton() {

		click(searchOptionLocators.popUpSearchButton);

	} 
 
	public void waitSearchResult() {
		waitForVisibilityOf(searchOptionLocators.searchResultLabel);
	}
	
	public void searchResults(String searchresultsLbl) {
		
		verifyLabel(searchresultsLbl,searchOptionLocators.searchResultLabel);
	
	}
	
	public void pageLocalLbl(String localLanquage) {
		
		verifyLabel(localLanquage,searchOptionLocators.pageLocal);
	}
	
	public void waitlocalLblpresent() {
		waitForVisibilityOf(searchOptionLocators.pageLocal);
	}
	
}
