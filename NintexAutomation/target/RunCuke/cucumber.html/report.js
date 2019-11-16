$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchOption.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: amarasingheai@gmail.com"
    }
  ],
  "line": 3,
  "name": "Testing to validate search option in the home page",
  "description": "In order to validate that",
  "id": "testing-to-validate-search-option-in-the-home-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Search-Option"
    }
  ]
});
formatter.before({
  "duration": 10494742200,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "validate search option",
  "description": "",
  "id": "testing-to-validate-search-option-in-the-home-page;validate-search-option",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Search-Option-automation"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on the Home Page \"http://www.nintex.com\" of Nintex website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on search icon",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see new popup window and enter search parameter as \"automation\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should see list of search results on the result page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "the search result page title should be \"You searched for automation - Nintex\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.nintex.com",
      "offset": 23
    }
  ],
  "location": "LanguageSelectorSteps.i_am_on_the_Home_Page_of_MalindoAir_website(String)"
});
formatter.result({
  "duration": 7625305500,
  "status": "passed"
});
formatter.match({
  "location": "SearchOptionSteps.i_click_on_search_icon()"
});
formatter.result({
  "duration": 218293100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "automation",
      "offset": 61
    }
  ],
  "location": "SearchOptionSteps.i_should_see_new_popup_window_and_enter_search_parameter_as(String)"
});
formatter.result({
  "duration": 30370142600,
  "status": "passed"
});
formatter.match({
  "location": "SearchOptionSteps.click_on_submit_button()"
});
formatter.result({
  "duration": 2971831100,
  "status": "passed"
});
formatter.match({
  "location": "SearchOptionSteps.i_should_see_list_of_search_results_on_the_result_page()"
});
formatter.result({
  "duration": 155200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You searched for automation - Nintex",
      "offset": 40
    }
  ],
  "location": "SearchOptionSteps.the_search_result_page_title_should_be(String)"
});
formatter.result({
  "duration": 88985900,
  "status": "passed"
});
formatter.after({
  "duration": 852982600,
  "status": "passed"
});
});