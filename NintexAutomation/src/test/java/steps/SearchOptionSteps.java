package steps;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.SearchOptionActions;
import utils.SeleniumDriver;

public class SearchOptionSteps {

	SearchOptionActions searchOptionActions = new SearchOptionActions();
	

	@When("^I click on search icon$")
	public void i_click_on_search_icon() throws Throwable {

		searchOptionActions.clickOnHomeSearchButton();
	}

	@And("^I should see new popup window and enter search parameter as \"([^\"]*)\"$")
	public void i_should_see_new_popup_window_and_enter_search_parameter_as(String searchText) throws Throwable {


		searchOptionActions.popUpWindow();

		searchOptionActions.keyInSearchParameter(searchText);
		
	}

	@And("^click on submit button$")
	public void click_on_submit_button() throws Throwable {

		searchOptionActions.clickOnPopUpSearchButton();

	}

	@Then("^I should see list of search \"([^\"]*)\" on the result page$")
	public void i_should_see_list_of_search_on_the_result_page(String resultTag) throws Throwable {
		
		String s = searchOptionActions.searchResults(); System.out.println(s);
		Assert.assertTrue(s.contains(resultTag));

	}

	@And("^the search result page title should be \"([^\"]*)\"$")
	public void the_search_result_page_title_should_be(String expectdTitle) throws Throwable {

		String actualTitle = SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(actualTitle, expectdTitle);

	}

}
