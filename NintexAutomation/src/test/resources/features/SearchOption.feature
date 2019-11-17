#Author: amarasingheai@gmail.com
@Search-Option
Feature: Testing to validate search option in the home page
  In order to validate that

  @Search-Option-automation
  Scenario: validate search option
    Given I am on the Home Page "http://www.nintex.com" of Nintex website
    When I click on search icon
    And I should see new popup window and enter search parameter as "automation"
    And click on submit button
    Then I should see list of search "results " on the result page
    And the search result page title should be "You searched for automation - Nintex"
    
    
    


