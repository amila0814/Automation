package steps;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.LanguageSelectorActions;
import utils.SeleniumDriver;

public class LanguageSelectorSteps {

	LanguageSelectorActions languageSelectorActions = new LanguageSelectorActions();

	@Given("^I am on the Home Page \"([^\"]*)\" of Nintex website$")
	public void i_am_on_the_Home_Page_of_Nintex_website(String websiteURL) throws Throwable {

		SeleniumDriver.openPage(websiteURL);

	}

	@When("^I move to the language menu$")
	public void i_move_to_the_language_menu(List<String> lang) throws Throwable {

		String menu = lang.get(4);
		languageSelectorActions.moveToLanguageSelectorMenu();

	}

	@And("^I move to Japanies language option$")
	public void i_move_to_Japanies_language_option() throws Throwable {

		languageSelectorActions.moveToJapaniesLanguage();

	}

	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String arg1) throws Throwable {

		languageSelectorActions.selectJapaniesLanguage();

	}

	@Then("^I should see new tab open with japanies language$")
	public void i_should_see_new_tab_open_with_japanies_language() throws Throwable {

		ArrayList<String> newTab = new ArrayList<String> (SeleniumDriver.getDriver().getWindowHandles());
		SeleniumDriver.getDriver().switchTo().window(newTab.get(1));

	}

	@And("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String expectdTitle) throws Throwable {

		String actual_title = SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(actual_title, expectdTitle);

	}
	
	@And("^the page url shoud be \"([^\"]*)\"$")
	public void the_page_url_shoud_be(String expectd_URL) throws Throwable {
	   
		String actual_URL = SeleniumDriver.getDriver().getCurrentUrl();
		Assert.assertEquals(actual_URL, expectd_URL );
	}

}
