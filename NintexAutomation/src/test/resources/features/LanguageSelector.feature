#Author: amarasingheai@gmail.com
@Language-Selector
Feature: Testing to validate Japanies language selector.
  In order to validate that

  @Language-Selector-Japanies
  Scenario: Validate Japanies language selector
    Given User navigates to the home page "http://www.nintex.com" of Nintex website
    When User moves to the language menu
    | Menu |
    | EN   |
    | FR   |
    | DE   |
    | JP   | 
    And User moves to Japanies language option
    And User clicks on "JP" link
    Then User should see new tab open with japanies language
    And the page title should be "Nintex"
    And the page url shoud be "https://www.nintex.jp/"
    

