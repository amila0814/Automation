package steps;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.SearchOptionActions;
import pages.locators.SearchOptionLocators;
import utils.SeleniumDriver;

public class SearchOptionSteps {

	SearchOptionActions searchOptionActions = new SearchOptionActions();
	SearchOptionLocators searchOptionLocators = new SearchOptionLocators();
	

	@When("^User clicks on search icon$")
	public void user_clicks_on_search_icon() throws Throwable {

		searchOptionActions.clickOnHomeSearchButton();
	}

	@And("^User should see new popup window and enter search parameter as \"([^\"]*)\"$")
	public void user_should_see_new_popup_window_and_enter_search_parameter_as(String searchText) throws Throwable {


		searchOptionActions.popUpWindow();

		searchOptionActions.keyInSearchParameter(searchText);
		
	}

	@And("^User clicks on submit button$")
	public void user_clicks_on_submit_button() throws Throwable {

		searchOptionActions.clickOnPopUpSearchButton();

	}

	@Then("^User should see list of search \"([^\"]*)\" on the result page$")
	public void user_should_see_list_of_search_on_the_result_page(String resultLbl) throws Throwable {
		searchOptionActions.waitSearchResult();
		searchOptionActions.searchResults(resultLbl);

	}

	@And("^the search result page title should be \"([^\"]*)\"$")
	public void the_search_result_page_title_should_be(String expectdTitle) throws Throwable {

		String actualTitle = SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(actualTitle, expectdTitle);

	}
	
	@Then("^the local should be selectced as \"([^\"]*)\"$")
	public void the_local_should_be_selectced_as(String pageLocal) throws Throwable {
		searchOptionActions.waitlocalLblpresent();
		searchOptionActions.pageLocalLbl(pageLocal);
	    
	}

}
