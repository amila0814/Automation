#Author: amarasingheai@gmail.com
@Search-Option
Feature: Testing to validate search option in the home page
  In order to validate that

  @Search-Option-automation
  Scenario: validate search option
    Given User navigates to the home page "http://www.nintex.com" of Nintex website
    When User clicks on search icon
    And User should see new popup window and enter search parameter as "automation"
    And User clicks on submit button
    Then User should see list of search "Results per page" on the result page
    And the search result page title should be "You searched for automation - Nintex"
    And the local should be selectced as "EN"
    
    
    


